#!/bin/sh

echo ""
read -p  "Enter rom name (1=Octavi-Os, 2=Project-Zephyrus, 3=Evolution-X): " RM

i=1
fn=$PWD/device/xiaomi/mojito
while [ "$i" -lt 2 ]
do
	if [ -f $fn ]
	then
		break
	fi
	
	case $RM in
		1 )
			echo ""
			echo "Cloning dependencies for Octavi-Os"
			sleep 1
			git clone https://github.com/Tejaskamat/device_xiaomi_mojito.git -b 12 device/xiaomi/mojito ;;
		2 )
			echo ""
			echo -n "Cloning dependencies for Project-Zephyrus"
			sleep 1
			git clone https://github.com/TejasKamat/device_xiaomi_mojito.git -b zephyrus device/xiaomi/mojito ;;
		3 )
			echo ""
			echo "Cloning dependencies for Evolution-X"
			sleep 1
			git clone https://github.com/TejasKamat/device_xiaomi_mojito.git -b snow device/xiaomi/mojito ;;
		* )
			echo "Not Defined :("
		        exit 1 ;;
esac

(( i++ ))
done
echo ""
function clone_depth1 () {
	git clone https://github.com/TejasKamat/device_xiaomi_sm6150-common.git device/xiaomi/sm6150-common
	echo ""
	git clone --depth=1 https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_sm6150-common.git vendor/xiaomi/sm6150-common
	echo ""
	git clone --depth=1 https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_mojito.git vendor/xiaomi/mojito
}
function clone () {
        git clone https://github.com/TejasKamat/device_xiaomi_sm6150-common.git device/xiaomi/sm6150-common
        echo ""
	git clone https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_sm6150-common.git vendor/xiaomi/sm6150-common
        echo ""
	git clone https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_mojito.git vendor/xiaomi/mojito
}

hx=$PWD/hardware/xiaomi
if [ -f $hx ]
then
         echo " $hx exists . . . removing..."
         echo ""
         sleep 2
         rm -rf $PWD/hardware/xiaomi
         git clone https://github.com/TejasKamat/android_hardware_xiaomi.git -b arrow-12.0  hardware/xiaomi
fi

sleep 2
read -p "Would you like to do a shallow clone ? (Y/n)" depth
echo ""

if [ "$depth" -eq "Y" ]
then
	clone_depth1
else
	clone
fi

read -p "Enter kernel name (1=WestCoast, 2=legionX 3=NetErnels: " kernel
while [ "$i" -lt 2 ]
do
	case $kernel in 
		1 )
			echo ""
			echo "cloning WestCoast kernel . . ."
			echo ""
			sleep 1
			git clone https://github.com/xiaomi-sdm678/android_kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/sm6150 ;;
		2 )
			echo ""
			echo "Cloning legionX kernel . . ."
			echo ""
			sleep 1
			git clone https://github.com/venom-stark/kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/mojito ;;
		3 )
			echo ""
			echo "Cloning NetErnels kernel . . ."
			echo ""
			sleep 1
			git clone https://github.com/Neternels/android_kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/mojito ;;
		* )
			echo "Invalid option :( "
			exit 1 ;;
	esac
done

