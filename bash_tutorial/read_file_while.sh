#!/use/bin/bash

while IFS+= read p # use ifs for special characters
do
  echo $p
  sleep 1
done < ~/Desktop/arch.txt
