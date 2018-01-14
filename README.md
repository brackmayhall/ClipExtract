### Disclaimer - The following code is still in a prototype phase ###
# EXTRACT.GG #
* EXTRACT.GG is a website that will display newly created video clips from Playstation, Pc, and Xbox
* [**SEE A SHORT CLIP OF THE PROTOTYPE HERE**](https://www.youtube.com/watch?v=HB0roFv9KOM)

### What is this repository for? ###
* Initializing the extract.gg virtual vagrant machine
* Installs ubuntu/trusty64, java7, tomcat8, mongodb, solor, maven
* Builds the extract sub repos ([extractminer](https://bitbucket.org/bmayhall/extractminer), [extractshared](https://bitbucket.org/bmayhall/extractshared), [extractwebapp](https://bitbucket.org/bmayhall/extractwebapp)) with maven
* Kicks off the extractminer service
* Deploys the extractwebapp to tomcat8

### Requirements ###
* Vagrant 1.8.4
* VirtualBox 5.0.24r108355 (may work with others)
* git
* ssh (some windows prompts do not have the proper ssh installed to work properly with vagrant, I use MINGW32 terminal)

### How to Run ###
- The initial clone of the repo will not pull all of the submodule git repos so there will be required username and password input during the submodule init/update since some of the submodules are private (bitbucket)
- other submodules included are [puppetlabs-apt](https://github.com/puppetlabs/puppetlabs-apt), [puppetlabs-stdlib](https://github.com/puppetlabs/puppetlabs-stdlib), [wget puppet module](https://github.com/maestrodev/puppet-wget), and [maven puppet module](https://github.com/maestrodev/puppet-maven)
```
git clone https://bitbucket.org/bmayhall/extractconfig.git
cd extractconfig
git submodule init
git submodule update (will have to input bitbucket username and password)
vagrant up
vagrant ssh
cd /vagrant/
sudo bash build_deploy.sh
```
note: if maven is installed on the host and you would like to build/deploy from the host ignore the final 3 commands on the guest machine and issue the following commands on the host to deploy the webapp to vagrant. This allows building and testing from the host.
```
cd extractconfig
mvn -f extractshared/pom.xml install;
mvn -f extractwebapp/pom.xml compile;
mvn -f extractwebapp/pom.xml tomcat7:redeploy;
```
![build_deploy.PNG](https://bitbucket.org/repo/B4gdod/images/2023143612-build_deploy.PNG)

Once maven has finished building and deploying the webapp you should be able to navigate to the following from your host machine:
http://192.168.33.10:8080/extractwebapp/

### Technologies Used ###
* vagrant
* virtualbox
* shell
* java7
* mongodb
* ubuntu
* tomcat8
* solr
* maven
* puppet-apt
* puppet-stdlib
* wget

### TODO ###
- Figure out why tomcat7:deploy and tomcat7:redeploy time out
- do not start miner if already running