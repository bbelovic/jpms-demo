#!/usr/bin/env bash
rm -rf classes/*
javac -d classes $(find chapter11-dep2/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep2.jar $(find . -path "*/exposed/*") ./module-info.class
cd ..
javac -p mods/ -d classes $(find chapter11-dep1/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep1.jar $(find . -path "*/exposing/*") ./module-info.class