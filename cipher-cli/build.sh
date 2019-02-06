#!/usr/bin/env bash
rm -rf target/

javac --module-path ../mods -d target/classes `find src/main/java -name '*.java'`

jar --create --file ../mods/cipher-cli.jar -C target/classes .
