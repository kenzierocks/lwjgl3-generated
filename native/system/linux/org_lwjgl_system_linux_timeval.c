/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include <stddef.h>
#include "LinuxLWJGL.h"
#include <sys/time.h>

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_timeval_offsets(JNIEnv *env, jclass clazz, jlong bufferAddress) {
	jint *buffer = (jint *)(intptr_t)bufferAddress;

	buffer[0] = (jint)(offsetof(struct timeval, tv_sec));
	buffer[1] = (jint)(offsetof(struct timeval, tv_usec));

	return sizeof(struct timeval);
}