#!/use/bin/bash

echo " "
echo "optimising your terminals"
sleep 3
echo "done optimisation"
sleep 3
echo "see magic"
sleep 3

n=1
while [ $n -gt 0 ]
do
 echo "$n"
 (( n++ ))
 gnome-terminal
done
