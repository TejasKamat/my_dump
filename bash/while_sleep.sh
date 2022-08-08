#!/use/bin/bash

n=1
while [ $n -gt 0 ]
do
 echo "$n"
 (( n++ ))
 gnome-terminal &
 sleep 2
done
