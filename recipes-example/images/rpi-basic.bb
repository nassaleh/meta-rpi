SUMMARY = "A small image for deploying on RPI4"
LICENSE = "MIT"

inherit core-image

#IMAGE_INSTALL += "packagegroup-core-boot"
IMAGE_INSTALL += "packagegroup-base-wifi"
IMAGE_INSTALL += "usbutils"
#IMAGE_INSTALL += "kernel-modules"

IMAGE_FEATURES += "ssh-server-dropbear splash debug-tweaks"

DISTRO_FEATURES:append = " bluez5 bluetooth wifi"
DISTRO_FEATURES:remove = " sysvinit"
VIRTUAL-RUNTIME_init_manager = "systemd"

IMAGE_INSTALL:append = " linux-firmware kernel-image kernel-modules kernel-devicetree module-init-tools bluez5 i2c-tools python3-smbus ca-certificates hostapd kea iptables wpa-supplicant iw networkmanager"

IMAGE_INSTALL:append = " \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    bluez-firmware-rpidistro-bcm43430a1-hcd \
    bluez-firmware-rpidistro-bcm4345c0-hcd \
"
#IMAGE_INSTALL_append = " packagegroup-rpi-test"

