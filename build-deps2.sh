#!/usr/bin/env bash
rm -rf classes/*
javac -p mods -d classes $(find dep2/src/main/java -name '*.java')
jar --create --file mods/dep2.jar -C classes .