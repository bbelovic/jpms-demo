#!/usr/bin/env bash
rm -rf classes/*
javac -d classes $(find chapter11-dep2/src/main/java -name '*.java')

cd classes
jar --create --file ../mods/chapter11-dep2.jar $(find . -path "*/exposed/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find chapter11-dep1/src/main/java -name '*.java')

cd classes
jar --create --file ../mods/chapter11-dep1.jar $(find . -path "*/exposing/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find chapter11-dep3/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep3.jar $(find . -path "*/another/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find ch11-aggregator/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-aggregator.jar ./module-info.class

cd ..
javac -d classes $(find chapter11-optional/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-optional.jar $(find . -path "*/optional/*") ./module-info.class

cd ..
javac -d classes $(find chapter11-dep4/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep4.jar $(find . -path "*/dep4/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find chapter11-dep5/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep5.jar $(find . -path "*/dep5/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find chapter11-dep6/src/main/java -name '*.java')
cd classes
jar --create --file ../mods/chapter11-dep6.jar $(find . -path "*/dep6/*") ./module-info.class
