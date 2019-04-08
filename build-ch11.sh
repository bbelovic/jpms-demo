#!/usr/bin/env bash
rm -rf classes/*
javac -d classes $(find chapter11-dep1/src/main/java -name '*.java')
jar --create --file mods/chapter11-dep1.jar $(find classes -path "*/exposing/*")