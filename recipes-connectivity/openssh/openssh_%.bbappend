FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://${THISDIR}/${BPN}/sshd_config"
