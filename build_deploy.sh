#!/bin/bash
echo "------------------------------------------------------------------"
echo "INSTALLING EXTRACTSHARED"
echo "------------------------------------------------------------------"
mvn -f extractshared/pom.xml install;
echo "------------------------------------------------------------------"
echo "INSTALLING EXTRACTMINER"
echo "------------------------------------------------------------------"
mvn -f extractminer/pom.xml clean install;
echo "------------------------------------------------------------------"
echo "STARTING EXTRACTMINER"
echo "------------------------------------------------------------------"
nohup java -jar extractminer/target/ExtractMiner-0.0.1-SNAPSHOT-jar-with-dependencies.jar > /dev/null 2>&1 &
echo "------------------------------------------------------------------"
echo "COMPILING EXTRACTWEBAPP"
echo "------------------------------------------------------------------"
mvn -f extractwebapp/pom.xml compile;
echo "------------------------------------------------------------------"
echo "DEPLOYING EXTRACTWEBAPP TO TOMCAT7"
echo "------------------------------------------------------------------"
mvn -f extractwebapp/pom.xml tomcat7:redeploy;