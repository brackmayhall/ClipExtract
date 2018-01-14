group {'puppet': ensure => 'present'}

exec { "update-package-list":
  command => "/usr/bin/sudo /usr/bin/apt-get update",
}

package { 'mongodb':
  ensure => present,
}

service { 'mongodb':
  ensure  => running,
  require => Package['mongodb'],
}

exec { 'allow remote mongo connections':
  command => "/usr/bin/sudo sed -i 's/bind_ip = 127.0.0.1/bind_ip = 0.0.0.0/g' /etc/mongodb.conf",
  notify  => Service['mongodb'],
  onlyif  => '/bin/grep -qx  "bind_ip = 127.0.0.1" /etc/mongodb.conf',
}

file { "/vagrant/solr":
  ensure => directory,
  before => Exec["download_solr"]
}

exec { "download_solr":
  command => "curl -L https://archive.apache.org/dist/lucene/solr/4.7.0/solr-4.7.0.tgz | tar zx --directory=/vagrant/solr --strip-components 1",
  cwd => "/vagrant",
  user => "vagrant",
  path => "/usr/bin/:/bin/",
  logoutput => true,
}

file { "/etc/init/solr.conf":
  source => "/vagrant/scripts/etc/init/solr.conf",
  require => Exec["download_solr"]
}

file { "/etc/init.d/solr":
  ensure => link,
  target => "/etc/init/solr.conf",
  require => File["/etc/init/solr.conf"],
}

service { "solr":
  enable => true,
  ensure => running,
  #path => "/etc/init/solr.conf",
  provider => "upstart",
  #hasrestart => true,
  #hasstatus => true,
  require => [ File["/etc/init/solr.conf"], File["/etc/init.d/solr"] ],
}