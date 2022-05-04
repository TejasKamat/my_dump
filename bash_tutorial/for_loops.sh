#!/usr/bin/bash

echo $BASH_VERSION
for (( i = 0; i < 10; i++ ))
do
  echo "$i"
done

for item in pwd date
do
  echo "--------------item--------------"
  $item
done
