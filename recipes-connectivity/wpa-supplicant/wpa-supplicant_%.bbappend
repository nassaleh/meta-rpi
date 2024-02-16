FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://${THISDIR}/${BPN}/wpa_supplicant.conf-sane"

# IMPORTANT!!!
# Once you add your info to the conf file, run this command
# git update-index --skip-worktree wpa_supplicant.conf-sane
