#!/usr/bin/env bash
rm -rf classes/*
javac -p mods/ -d classes $(find dep1/src/main/java -name '*.java')
jar --create --main-class=net.bbelovic.dependency.one.Main --file mods/dep1.jar -C classes .