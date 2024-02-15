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

###########################################################
# target
#MACHINE ?= "raspberrypi4-64"
#ENABLE_UART = "1"
#ENABLE_I2C = "1"
#KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev i2c-bcm2708"
#
## add a feature
#EXTRA_IMAGE_FEATURES:append = " debug-tweaks ssh-server-dropbear package-management tools-sdk"
#DISTRO_FEATURES:append = " bluez5 bluetooth wifi polkit acl xattr pam virtualization security systemd"
#DISTRO_FEATURES:remove = " sysvinit"
#VIRTUAL-RUNTIME_init_manager = "systemd"
#LICENSE_FLAGS_ACCEPTED = "synaptics-killswitch"
#
## add a recipe
#CORE_IMAGE_EXTRA_INSTALL:append = " vim"
#DISTRO_FEATURES_BACKFILL_CONSIDERED = ""
#IMAGE_INSTALL:append = " ntpdate i2c-tools podman crun buildah skopeo cgroup-lite procps ca-certificates kernel-modules python3-pip python3-dbus ebtables cri-o cri-tools e2fsprogs-resize2fs linux-firmware-bcm43430 bluez5 python3-smbus wpa-supplicant bridge-utils git hostapd"
#IMAGE_ROOTFS_EXTRA_SPACE = "8097152"
## BB_NUMBER_THREADS = "9"
## PARALLEL_MAKE = "-j 9"
#INHERIT += "rm_work"
