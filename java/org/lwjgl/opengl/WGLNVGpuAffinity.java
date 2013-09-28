/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/gpu_affinity.txt">WGL_NV_gpu_affinity</a> extension.
 * <p/>
 * On systems with more than one GPU it is desirable to be able to select which GPU(s) in the system become the target for OpenGL rendering commands. This
 * extension introduces the concept of a GPU affinity mask. OpenGL rendering commands are directed to the GPU(s) specified by the affinity mask. GPU
 * affinity is immutable. Once set, it cannot be changed.
 * <p/>
 * This extension also introduces the concept called affinity-DC. An affinity-DC is a device context with a GPU affinity mask embedded in it. This
 * restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the affinity mask.
 */
public final class WGLNVGPUAffinity {

	/** New error code set by wglShareLists, wglMakeCurrent and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int
		ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV = 0x20D0;

	/** New error code set by {@link org.lwjgl.system.windows.WGL#wglMakeCurrent} and {@link WGLARBMakeCurrentRead#wglMakeContextCurrentARB MakeContextCurrentARB}. */
	public static final int
		WGL_ERROR_MISSING_AFFINITY_MASK_NV = 0x20D1;

	private WGLNVGPUAffinity() {}

	// --- [ wglEnumGpusNV ] ---

	/** JNI method for {@link #wglEnumGpusNV wglEnumGpusNV} */
	public static native int nwglEnumGpusNV(int gpuIndex, long gpu, long __functionAddress);

	/**
	 * Returns the handles for all GPUs in a system.
	 * <p/>
	 * By looping over {@code wglEnumGpusNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles can be queried. If the function succeeds,
	 * the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The function fails if {@code gpuIndex} is
	 * greater or equal than the number of GPUs supported by the system.
	 *
	 * @param gpuIndex an index value that specifies a GPU
	 * @param gpu      returns a handle for GPU number {@code gpuIndex}. The first GPU will be index 0.
	 */
	public static int wglEnumGpusNV(int gpuIndex, ByteBuffer gpu) {
		long __functionAddress = getInstance().wglEnumGpusNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglEnumGpusNV(gpuIndex, memAddress(gpu), __functionAddress);
	}

	/** Alternative version of: {@link #wglEnumGpusNV wglEnumGpusNV} */
	public static int wglEnumGpusNV(int gpuIndex, PointerBuffer gpu) {
		long __functionAddress = getInstance().wglEnumGpusNV;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglEnumGpusNV(gpuIndex, memAddress(gpu), __functionAddress);
	}

	// --- [ wglEnumGpuDevicesNV ] ---

	/** JNI method for {@link #wglEnumGpuDevicesNV wglEnumGpuDevicesNV} */
	public static native int nwglEnumGpuDevicesNV(long gpu, int deviceIndex, long gpuDevice, long __functionAddress);

	/**
	 * Retrieve information about the display devices supported by a GPU.
	 *
	 * @param gpu         a handle to the GPU to query
	 * @param deviceIndex an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0.
	 * @param gpuDevice   a {@link GPU_DEVICE} structure which will receive information about the display device at index {@code deviceIndex}.
	 */
	public static int wglEnumGpuDevicesNV(long gpu, int deviceIndex, ByteBuffer gpuDevice) {
		long __functionAddress = getInstance().wglEnumGpuDevicesNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(gpu);
			checkBuffer(gpuDevice, GPU_DEVICE.SIZEOF);
		}
		return nwglEnumGpuDevicesNV(gpu, deviceIndex, memAddress(gpuDevice), __functionAddress);
	}

	// --- [ wglCreateAffinityDCNV ] ---

	/** JNI method for {@link #wglCreateAffinityDCNV wglCreateAffinityDCNV} */
	public static native long nwglCreateAffinityDCNV(long gpuList, long __functionAddress);

	/**
	 * Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
	 * device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
	 * affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
	 * {@link WGLARBPbuffer#wglCreatePbufferARB CreatePbufferARB} followed by {@link WGLARBPbuffer#wglGetPbufferDCARB GetPbufferDCARB}.
	 * <p/>
	 * If successful, the function returns an affinity-DC handle. If it fails, NULL will be returned.
	 *
	 * @param gpuList a NULL-terminated array of GPU handles to which the affinity-DC will be restricted
	 */
	public static long wglCreateAffinityDCNV(ByteBuffer gpuList) {
		long __functionAddress = getInstance().wglCreateAffinityDCNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(gpuList);
		}
		return nwglCreateAffinityDCNV(memAddress(gpuList), __functionAddress);
	}

	/** Alternative version of: {@link #wglCreateAffinityDCNV wglCreateAffinityDCNV} */
	public static long wglCreateAffinityDCNV(PointerBuffer gpuList) {
		long __functionAddress = getInstance().wglCreateAffinityDCNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT(gpuList);
		}
		return nwglCreateAffinityDCNV(memAddress(gpuList), __functionAddress);
	}

	// --- [ wglEnumGpusFromAffinityDCNV ] ---

	/** JNI method for {@link #wglEnumGpusFromAffinityDCNV wglEnumGpusFromAffinityDCNV} */
	public static native int nwglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, long gpu, long __functionAddress);

	/**
	 * Retrieves a list of GPU handles that make up the affinity-mask of an affinity-DC.
	 * <p/>
	 * By looping over {@code wglEnumGpusFromAffinityDCNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles associated with the DC can
	 * be queried. If the function succeeds, the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The
	 * function fails if {@code gpuIndex} is greater or equal than the number of GPUs associated with {@code affinityDC}.
	 *
	 * @param affinityDC a handle of the affinity-DC to query
	 * @param gpuIndex   an index value of the GPU handle in the affinity mask of {@code affinityDC} to query
	 * @param gpu        returns a handle for  GPU number {@code gpuIndex}. The first GPU will be at index 0.
	 */
	public static int wglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, ByteBuffer gpu) {
		long __functionAddress = getInstance().wglEnumGpusFromAffinityDCNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(affinityDC);
		}
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu), __functionAddress);
	}

	/** Alternative version of: {@link #wglEnumGpusFromAffinityDCNV wglEnumGpusFromAffinityDCNV} */
	public static int wglEnumGpusFromAffinityDCNV(long affinityDC, int gpuIndex, PointerBuffer gpu) {
		long __functionAddress = getInstance().wglEnumGpusFromAffinityDCNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(affinityDC);
		}
		return nwglEnumGpusFromAffinityDCNV(affinityDC, gpuIndex, memAddress(gpu), __functionAddress);
	}

	// --- [ wglDeleteDCNV ] ---

	/** JNI method for {@link #wglDeleteDCNV wglDeleteDCNV} */
	public static native int nwglDeleteDCNV(long hdc, long __functionAddress);

	/**
	 * Deletes an affinity-DC.
	 *
	 * @param hdc a handle of an affinity-DC to delete
	 */
	public static int wglDeleteDCNV(long hdc) {
		long __functionAddress = getInstance().wglDeleteDCNV;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
		}
		return nwglDeleteDCNV(hdc, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLNVGPUAffinity;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_NV_gpu_affinity") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglEnumGpusNV) &&
			GL.isFunctionSupported(funcs.wglEnumGpuDevicesNV) &&
			GL.isFunctionSupported(funcs.wglCreateAffinityDCNV) &&
			GL.isFunctionSupported(funcs.wglEnumGpusFromAffinityDCNV) &&
			GL.isFunctionSupported(funcs.wglDeleteDCNV);

		return GL.checkExtension("WGL_NV_gpu_affinity", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLNVGPUAffinity}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long
			wglEnumGpusNV,
			wglEnumGpuDevicesNV,
			wglCreateAffinityDCNV,
			wglEnumGpusFromAffinityDCNV,
			wglDeleteDCNV;

		public Functions(FunctionProvider provider) {
			wglEnumGpusNV = provider.getFunctionAddress("wglEnumGpusNV");
			wglEnumGpuDevicesNV = provider.getFunctionAddress("wglEnumGpuDevicesNV");
			wglCreateAffinityDCNV = provider.getFunctionAddress("wglCreateAffinityDCNV");
			wglEnumGpusFromAffinityDCNV = provider.getFunctionAddress("wglEnumGpusFromAffinityDCNV");
			wglDeleteDCNV = provider.getFunctionAddress("wglDeleteDCNV");
		}

	}

}