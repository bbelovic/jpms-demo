#!/usr/bin/env bash

javac -d target/classes $(find src -name '*.java')

jar --create --file ../mods/cipher.jar -C target/classes .