# Copyright (c) 2020 LG Electronics, Inc.

PNBLACKLIST[cl-tf2] ?= "${@bb.utils.contains('ROS_WORLD_SKIP_GROUPS', 'lisp', 'depends on sbcl for which there is no OE recipe', '', d)}"
