#!/usr/bin/env bash
#javac --release 8 -d classes $(find dep2/src/main/java -name '*.java')
javac --release 9 -d classes-9 $(find dep2/src/main/java -name '*.java')
#javac --class-path classes -d classes $(find dep1/src/main/java -name '*.java')