LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := tools
LOCAL_SRC_FILES := interfaces.c functions.c
include $(BUILD_SHARED_LIBRARY)
