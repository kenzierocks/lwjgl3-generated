/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include <jni.h>
#include <stddef.h>
#include "opencl.h"

JNIEXPORT jint JNICALL Java_org_lwjgl_opencl_cl_buffer_region_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(cl_buffer_region, origin));
	buffer[1] = (jint)(offsetof(cl_buffer_region, size));

	return sizeof(cl_buffer_region);
}