/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "MacOSXLWJGL.h"
#include <dlfcn.h>

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlopen(JNIEnv *__env, jclass clazz, jlong pathAddress, jint mode) {
	const char *path = (const char *)(intptr_t)pathAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)dlopen(path, mode);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlerror(JNIEnv *__env, jclass clazz) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)dlerror();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlsym(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong nameAddress) {
	void *handle = (void *)(intptr_t)handleAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)dlsym(handle, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_macosx_DynamicLinkLoader_ndlclose(JNIEnv *__env, jclass clazz, jlong handleAddress) {
	void *handle = (void *)(intptr_t)handleAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)dlclose(handle);
}

EXTERN_C_EXIT
