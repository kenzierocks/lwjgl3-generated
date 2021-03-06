/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/** Native bindings to the <strong>amd_device_persistent_memory</strong> extension. */
public final class AMDDevicePersistentMemory {

	/**
	 * {@code cl_mem_flags} bit. Buffers and images allocated with this flag reside in host-visible device memory. This flag is mutually exclusive with the
	 * flags {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}.
	 */
	public static final int
		CL_MEM_USE_PERSISTENT_MEM_AMD = 1 << 6;

	private AMDDevicePersistentMemory() {}

}