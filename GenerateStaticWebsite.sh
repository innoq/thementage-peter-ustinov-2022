#!/usr/bin/env bash

# Make sure the server is running on port 8080.
cd docs; rm -rf *; cd ..;
wget localhost:8080 --directory-prefix=./docs/ --no-host-directories --recursive --convert-links --adjust-extension 
