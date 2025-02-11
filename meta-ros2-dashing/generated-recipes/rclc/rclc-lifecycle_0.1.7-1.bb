# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "rclc lifecycle convenience methods."
AUTHOR = "Jan Staschulat <jan.staschulat@de.bosch.com>"
ROS_AUTHOR = "Arne Nordmann <arne.nordmann@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclc"
ROS_BPN = "rclc_lifecycle"

ROS_BUILD_DEPENDS = " \
    lifecycle-msgs \
    rcl-lifecycle \
    rclc \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    lifecycle-msgs \
    rcl-lifecycle \
    rclc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lifecycle-msgs \
    rcl-lifecycle \
    rclc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclc-release/archive/release/dashing/rclc_lifecycle/0.1.7-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rclc_lifecycle"
SRC_URI = "git://github.com/ros2-gbp/rclc-release;${ROS_BRANCH};protocol=https"
SRCREV = "3f077d1ccbc8e891df85be17267bd96b0651b9e2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
