#!/bin/bash

function clone_dt () {
        read -p "Enter the branch name : " BRANCH ; echo ""
        fn=$PWD/device/xiaomi/mojito
        git clone https://github.com/TejasKamat/device_xiaomi_mojito -b $BRANCH $fn
}
function clone_pe_vendor () {
        git clone https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_sm6150-common.git vendor/xiaomi/sm6150-common
        echo ""
        git clone https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_mojito.git vendor/xiaomi/mojito
}
function clone_vendor () {
        git clone https://github.com/TejasKamat/vendor_xiaomi_mojito vendor/xiaomi/mojito
        echo ""
}
function hx_clone () {
        HX=$PWD/hardware/xiaomi
        if [ -e $HX ] ; then
                read -p "$HX Exists. Do you want do remove and re-clone $HX Y/n " HX_OPTION
                if [[ $HX_OPTION == Y ]]
                then
                rm -rf $HX
                fi
        else
                git clone https://github.com/ArrowOS-Devices/android_hardware_xiaomi.git $HX
                echo ""
        fi
}
function clone_clang () {
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
                        echo "Clang not defined :(" ;;
        esac
}
echo ""
function clone_kernel () {
        read -p "Enter kernel name (1=WestCoast, 2=legionX : " KERNEL
        case $KERNEL in
                1 )
                        echo ""
                        echo "cloning WestCoast kernel . . ."
                        echo ""
                        git clone https://github.com/xiaomi-sdm678/android_kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/mojito ;;
                2 )
                        echo ""
                        echo "Cloning legionX kernel . . ."
                        echo ""
                        git clone https://github.com/venom-stark/kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/mojito ;;
                * )
                        echo "Invalid option :( "
        esac
}
clone_dt
echo ""
read -p "Do you want to clone PE vendor Y/n : " vendor_options
if [[ $vendor_options == Y ]]
then
        clone_pe_vendor
else
        clone_vendor
fi
hx_clone
clone_clang
clone_kernel
exit 0
