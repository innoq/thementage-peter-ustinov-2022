#!/usr/bin/env bash

if lsof -Pi :8080 -sTCP:LISTEN -t >/dev/null ; then
    echo "Port 8080 already in use. Please free port and start the bash script again."
    exit 0
else
    mvn spring-boot:run &

    ( echo "Waiting... Tomcat to launch on 8080..."

    while ! nc -z localhost 8080; do
      sleep 0.1 # wait for 1/10 of the second before check again
    done

    echo "Tomcat launched" &&

    wget localhost:8080 --directory-prefix=./docs/ --no-host-directories --recursive --convert-links --adjust-extension )
fi