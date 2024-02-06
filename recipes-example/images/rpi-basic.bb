inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "usbutils"
#IMAGE_INSTALL += "kernel-modules"

IMAGE_FEATURES += "ssh-server-dropbear splash"

#IMAGE_INSTALL_append = " packagegroup-rpi-test"
