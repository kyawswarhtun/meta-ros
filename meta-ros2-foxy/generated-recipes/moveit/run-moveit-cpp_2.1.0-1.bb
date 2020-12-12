# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "TODO: Package description"
AUTHOR = "Henning Kayser <henningkayser@picknik.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "TODO: License declaration"
LICENSE = "TODO-License-declaration"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=782925c2d55d09052e1842a0b4886802"

ROS_CN = "moveit"
ROS_BPN = "run_moveit_cpp"

ROS_BUILD_DEPENDS = " \
    moveit-common \
    moveit-ros-planning-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-ros-planning-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-ros-planning-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/moveit2-release/archive/release/foxy/run_moveit_cpp/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/run_moveit_cpp"
SRC_URI = "git://github.com/moveit/moveit2-release;${ROS_BRANCH};protocol=https"
SRCREV = "5abfa92cdfbe40ac4cb70ede12f1b3167f8d2ad8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
