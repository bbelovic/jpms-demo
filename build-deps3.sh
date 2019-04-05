#!/usr/bin/env bash
rm -rf classes/*
javac -p mods -d classes $(find dep3/src/main/java -name '*.java')
jar --create --file mods/dep3.jar -C classes .