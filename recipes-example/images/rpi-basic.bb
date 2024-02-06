SUMMARY = "A small image for deploying on RPI4"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "usbutils"
#IMAGE_INSTALL += "kernel-modules"

IMAGE_FEATURES += "ssh-server-dropbear splash"

DISTRO_FEATURES_append = " bluez5 bluetooth wifi"
IMAGE_INSTALL_append = " linux-firmware-bcm43430 bluez5 i2c-tools python-smbus bridge-utils hostapd dhcp-server iptables wpa-supplicant"

#IMAGE_INSTALL_append = " packagegroup-rpi-test"
