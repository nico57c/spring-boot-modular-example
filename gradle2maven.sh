#!/bin/bash

if [ "$1" = "reset" ]
then
  gradle install
fi

mv ./booking-module/build/poms/pom-default.xml ./booking-module/pom.xml
mv ./application/build/poms/pom-default.xml ./application/pom.xml
mv ./security-module/build/poms/pom-default.xml ./security-module/pom.xml
