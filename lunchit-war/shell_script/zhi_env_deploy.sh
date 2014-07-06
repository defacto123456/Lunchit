#!/bin/bash


cd /Users/cz_michael/Desktop/workspace/Lunchit/lunchit-ear
mvn clean

cd /Users/cz_michael/Desktop/workspace/Lunchit/lunchit-war
mvn clean install

cd /Users/cz_michael/Desktop/workspace/Lunchit/lunchit-ear
mvn appengine:devserver
