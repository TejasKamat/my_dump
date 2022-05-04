#!/user/bin/bash

n=4
until [ $n -ge 10 ]
do
  echo "$n okay"
  n=$((n+1))

done
