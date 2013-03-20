/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "WindowsLWJGL.h"
#include "WGL.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_GPU_DEVICE_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(GPU_DEVICE, cb));
	buffer[1] = (jint)(offsetof(GPU_DEVICE, DeviceName));
	buffer[2] = (jint)(offsetof(GPU_DEVICE, DeviceString));
	buffer[3] = (jint)(offsetof(GPU_DEVICE, Flags));
	buffer[4] = (jint)(offsetof(GPU_DEVICE, rcVirtualScreen));

	return sizeof(GPU_DEVICE);
}