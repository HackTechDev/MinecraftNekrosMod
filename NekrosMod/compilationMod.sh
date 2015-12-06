#!/bin/sh

./gradlew build
ls -l build/libs/
cp build/libs/nekros-1.0.jar ~/.minecraft/mods
cp build/libs/nekros-1.0.jar ~/JEUX/MINECRAFT/Serveur/mods
