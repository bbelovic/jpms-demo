#!/usr/bin/env bash
javac --module-source-path "./*/src/main/java" -d classes/ --module cipher.cli

rm -rf mods/*

jar --create --file mods/cipher.cli.jar --main-class net.bbelovic.cipher.cli.Main -C classes/cipher.cli .
jar --create --file mods/cipher.jar -C classes/cipher .