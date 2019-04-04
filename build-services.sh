#!/usr/bin/env bash
rm -rf classes/*
rm -rf mods/*
javac -d classes $(find services/src/main/java -name '*.java')

jar --create --file mods/services.jar -C classes .