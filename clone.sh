#!/bin/sh
# export PE=1
# export OCTAVI=1

if [ "$OCTAVI" = "1" ]
then
	echo "cloning dependencies for OctaviOs"

	git clone https://github.com/DrTK001/device_xiaomi_mojito.git -b 12 device/xiaomi/mojito

	git clone https://github.com/DrTK001/device_xiaomi_sm6150-common.git -b 12 device/xiaomi/sm6150-common
else
	echo "cloning dependencies for pixel blaster"

	git clone https://github.com/DrTK001/device_xiaomi_mojito.git -b 12-pixel-blaster device/xiaomi/mojito

	git clone https://github.com/DrTK001/device_xiaomi_sm6150-common.git -b 12-wip2 device/xiaomi/sm6150-common
fi

git clone https://github.com/TejasKamat/device_xiaomi_sm6150-extras.git device/xiaomi/sm6150-extras

if [ "$PE" = "1" ]
then
    echo "cloning vendor from PE"

    git clone --depth=1 https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_sm6150-common.git vendor/xiaomi/sm6150-common

    git clone --depth=1 https://gitlab.pixelexperience.org/android/vendor-blobs/vendor_xiaomi_mojito.git vendor/xiaomi/mojito
else
        echo "cloning vendor from xiaomi-sdm678"

        git clone --depth=1 https://gitlab.com/xiaomi-sdm678/android_vendor_xiaomi_mojito.git -b 12 vendor/xiaomi/mojito

        git clone --depth=1 https://gitlab.com/xiaomi-sdm678/android_vendor_xiaomi_sm6150-common.git -b 12 vendor/xiaomi/sm6150-common
fi

git clone https://github.com/xiaomi-sdm678/android_kernel_xiaomi_mojito.git --depth=1 kernel/xiaomi/sm6150

git clone https://github.com/kdrag0n/proton-clang --depth=1 prebuilts/clang/host/linux-x86/clang-proton

git clone https://github.com/DrTK001/android_hardware_xiaomi.git -b arrow-12.0  hardware/xiaomi