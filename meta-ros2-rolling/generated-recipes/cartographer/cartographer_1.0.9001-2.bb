# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "The Cartographer Authors <google-cartographer@googlegroups.com>"
HOMEPAGE = "https://github.com/googlecartographer/cartographer"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_CN = "cartographer"
ROS_BPN = "cartographer"

ROS_BUILD_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    glog \
    gtest \
    libeigen \
    lua \
    protobuf \
    python3-sphinx \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    glog \
    libeigen \
    lua \
    protobuf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cairo \
    ceres-solver \
    gflags \
    glog \
    libeigen \
    lua \
    protobuf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/cartographer-release/archive/release/rolling/cartographer/1.0.9001-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/cartographer"
SRC_URI = "git://github.com/ros2-gbp/cartographer-release;${ROS_BRANCH};protocol=https"
SRCREV = "0cde0d5e4516391ee6918cf556c5487d5aa96497"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
