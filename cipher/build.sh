#!/usr/bin/env bash
rm -rf target/

javac -d target/classes $(find src/main/java -name '*.java')

jar --create --file ../mods/cipher.jar -C target/classes .