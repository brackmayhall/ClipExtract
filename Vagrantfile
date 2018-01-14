# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

  config.vm.box = "ubuntu/trusty64"
  # http
  config.vm.network :forwarded_port, guest: 80, host: 8080
  # mongo
  config.vm.network "forwarded_port", guest: 3000, host: 3000
  config.vm.network "forwarded_port", guest: 27017, host: 27017
  # solr
  config.vm.network :forwarded_port, guest: 8983, host: 8983

  config.vm.network :private_network, ip: "192.168.33.10"

  config.vm.synced_folder "extractminer", "/vagrant/extractminer"
  config.vm.synced_folder "extractshared", "/vagrant/extractshared"
  config.vm.synced_folder "extractwebapp", "/vagrant/extractwebapp"

  config.vm.provision :puppet, :module_path => "puppet/modules" do |puppet|
    puppet.manifests_path = "puppet/manifests"
    puppet.manifest_file  = "main2.pp"
    puppet.options        = [
                              '--verbose',
                              #'--debug',
                            ]
  end

end
