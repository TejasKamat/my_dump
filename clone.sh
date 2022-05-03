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

HX=$PWD/hardware/xiaomi
if [ -f $HX ]
then
         echo " $HX exists . . . removing..."
         echo ""
         sleep 2
         rm -rf $PWD/hardware/xiaomi
         git clone https://github.com/TejasKamat/android_hardware_xiaomi.git -b arrow-12.0  hardware/xiaomi
fi

sleep 2
read -p "Would you like to do a shallow clone ? (Y/n)" DEPTH
echo ""

if [ "$DEPTH" -eq "Y" ]
then
	clone_depth1
else
	clone
fi

read -p "Enter kernel name (1=WestCoast, 2=legionX 3=NetErnels: " KERNEL
while [ "$i" -lt 2 ]
do
	case $KERNEL in
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
			K=ne
			sleep 1
			git clone https://github.com/Neternels/android_kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/mojito ;;
		* )
			echo "Invalid option :( "
			exit 1 ;;
	esac
done
if [ "$K" -eq "ne" ]
then
	git clone --depth=1 https://github.com/StatiXOS/android_prebuilts_gcc_linux-x86_aarch64_aarch64-elf -b 12.0.0 prebuilts/gcc/linux-x86/aarch64/aarch64-elf
	git clone --depth=1 https://github.com/StatiXOS/android_prebuilts_gcc_linux-x86_arm_arm-eabi -b 12.0.0 prebuilts/gcc/linux-x86/arm/arm-eabi
	# https://github.com/Neternels/android_kernel_xiaomi_mojito//wiki
fi

function cc () {
	read -p "Enter the clang name (1=Proton, 2=Neutron, 3=Azure, 4=Default): " cc
	case $cc in
		1 )
			echo
			echo "Cloning proton clang"
			git clone https://github.com/kdrag0n/proton-clang --depth=1 prebuilts/clang/host/linux-x86/clang-proton ;;
		2 )
			echo
			echo "cloning Neutron clang"
			git clone https://gitlab.com/dakkshesh07/neutron-clang.git --depth=1 prebuilts/clang/host/linux-x86/clang-neutron ;;
		3 )
			echo
			echo "Cloning Azure clang"
			git clone https://gitlab.com/Panchajanya1999/azure-clang.git --depth=1 prebuilts/clang/host/linux-x86/clang-azure ;;
		4 )
			echo "" 
			echo "Using default clang" ;;
		* )
			echo "Not defined :(" ;;
	esac
}

read -p "Would you like to clone custom clang (Y/n): " CLANG
if [ "$CLANG" -eq "Y" ]
then
	cc
fi
