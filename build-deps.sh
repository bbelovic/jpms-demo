#!/usr/bin/env bash
#javac --release 8 -d classes $(find dep2/src/main/java -name '*.java')
#javac --release 9 -d classes-9 $(find dep2/src/main/java -name '*.java')
jar --create --file mr.jar -C classes . --release 9 classes-9/module-info.class
#javac --class-path classes -d classes $(find dep1/src/main/java -name '*.java')