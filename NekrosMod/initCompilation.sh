#!/bin/sh

./gradlew setupDecompWorkspace
./gradlew build
./gradlew eclipse
ls -l build/libs
