#!/usr/bin/bash

for (( i = q; i <= 10; i++ ))
do
  if [ $i -eq 5 ]
  then
    echo "breaking the loop . . ."
    continue
    break
  fi
  echo "$i"
done
