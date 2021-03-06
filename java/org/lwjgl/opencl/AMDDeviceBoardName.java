/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/** Native bindings to the <strong>amd_device_board_name</strong> extension. */
public final class AMDDeviceBoardName {

	/**
	 * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}. Returns the name of the GPU board and model of the specific device.
	 * <p/>
	 * Currently, this is only for GPU devices. The returned name is a 128-character value.
	 */
	public static final int
		CL_DEVICE_BOARD_NAME_AMD = 0x4038;

	private AMDDeviceBoardName() {}

}