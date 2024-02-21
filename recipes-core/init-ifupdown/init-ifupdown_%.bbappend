FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append() {
    echo "auto wlan0" >> ${D}/etc/network/interfaces
}
