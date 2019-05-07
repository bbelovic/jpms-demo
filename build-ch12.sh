#!/usr/bin/env bash
rm -rf classes/*
javac -d classes $(find chapter12-m1/src/main/java -name '*.java')

cd classes
jar -c -f ../mods/chapter12-m1.jar $(find . -path "*/chapter12/*") ./module-info.class

cd ..
javac -d classes $(find chapter12-impl/src/main/java -name '*.java')

cd classes
jar -c -f ../mods/chapter12-impl.jar $(find . -path "*/impl/*") ./module-info.class

cd ..
javac -p mods/ -d classes $(find chapter12-m2/src/main/java -name '*.java')

cd classes
jar --module-version=1.0.a -c -f ../mods/chapter12-m2.jar $(find . -path "*/reader/*") ./module-info.class

jlink --module-path /usr/java/jdk-11.0.2/bin/java/jmods:mods --add-modules chapter12.reflection chapter12.reflection.impl chapter12.reflection.reader --output image