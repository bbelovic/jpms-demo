#!/usr/bin/env bash
rm -rf classes/*
javac -p mods/ -d classes $(find chapter11-depending/src/main/java -name '*.java')
jar -p mods/ --main-class=net.bbelovic.ch11.depending.transitive.Main --create --file mods/depending.jar -C classes .

java -p mods/ -m depending