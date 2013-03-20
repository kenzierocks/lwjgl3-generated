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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/gpu_affinity.txt">WGL_AMD_gpu_association</a> extension.
 * <p/>
 * There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.
 * <p/>
 * This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.
 */
public final class WGLAMDGpuAssociation {

	/** Accepted by the {@code property} parameter of {@link #wglGetGPUInfoAMD}. */
	public static final int
		WGL_GPU_VENDOR_AMD                = 0x1F00,
		WGL_GPU_RENDERER_STRING_AMD       = 0x1F01,
		WGL_GPU_OPENGL_VERSION_STRING_AMD = 0x1F02,
		WGL_GPU_FASTEST_TARGET_GPUS_AMD   = 0x21A2,
		WGL_GPU_RAM_AMD                   = 0x21A3,
		WGL_GPU_CLOCK_AMD                 = 0x21A4,
		WGL_GPU_NUM_PIPES_AMD             = 0x21A5,
		WGL_GPU_NUM_SIMD_AMD              = 0x21A6,
		WGL_GPU_NUM_RB_AMD                = 0x21A7,
		WGL_GPU_NUM_SPI_AMD               = 0x21A8;

	private WGLAMDGpuAssociation() {}

	// --- [ wglGetGPUIDsAMD ] ---

	/** JNI method for {@link #wglGetGPUIDsAMD(int, ByteBuffer)} */
	public static native int nwglGetGPUIDsAMD(int maxCount, long ids, long __functionAddress);

	/**
	 * Returns the IDs for available GPUs.
	 * <p/>
	 * If the function succeeds, the return value is the number of total GPUs available. The value 0 is returned if no GPUs are available or if the call has
	 * failed. The ID 0 is reserved and will not be retuned as a valid GPU ID. If the array {@code ids} is NULL, the function will only return the total number
	 * of GPUs. {@code ids} will be tightly packed with no 0 values between valid ids.
	 *
	 * @param maxCount the max number of IDs that can be returned
	 * @param ids      the array of returned IDs
	 */
	public static int wglGetGPUIDsAMD(int maxCount, ByteBuffer ids) {
		long __functionAddress = getInstance().wglGetGPUIDsAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( ids != null ) checkBuffer(ids, maxCount << 2);
		}
		return nwglGetGPUIDsAMD(maxCount, memAddressSafe(ids), __functionAddress);
	}

	/** Alternative version of: {@link #wglGetGPUIDsAMD(int, ByteBuffer)} */
	public static int wglGetGPUIDsAMD(IntBuffer ids) {
		long __functionAddress = getInstance().wglGetGPUIDsAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetGPUIDsAMD(ids == null ? 0 : ids.remaining(), memAddressSafe(ids), __functionAddress);
	}

	// --- [ wglGetGPUInfoAMD ] ---

	/** JNI method for {@link #wglGetGPUInfoAMD(int, int, int, int, ByteBuffer)} */
	public static native int nwglGetGPUInfoAMD(int id, int property, int dataType, int size, long data, long __functionAddress);

	/**
	 * Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
	 * which GPU is best suited for a specific task.
	 * <p/>
	 * For a string, {@code size} will be the number of characters allocated and will include NULL termination. For arrays of type GL_UNSIGNED_INT, GL_INT, and
	 * GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values written
	 * is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE type,
	 * are UTF-8 encoded and will be NULL terminated. If the function fails, -1 will be returned.
	 *
	 * @param id       a GPU id obtained from calling {@link #wglGetGPUIDsAMD(int, ByteBuffer)}
	 * @param property the information being queried. One of:<p/>{@link #WGL_GPU_VENDOR_AMD}, {@link #WGL_GPU_RENDERER_STRING_AMD}, {@link #WGL_GPU_OPENGL_VERSION_STRING_AMD}, {@link #WGL_GPU_FASTEST_TARGET_GPUS_AMD}, {@link #WGL_GPU_RAM_AMD}, {@link #WGL_GPU_CLOCK_AMD}, {@link #WGL_GPU_NUM_PIPES_AMD}, {@link #WGL_GPU_NUM_SIMD_AMD}, {@link #WGL_GPU_NUM_RB_AMD}, {@link #WGL_GPU_NUM_SPI_AMD}
	 * @param dataType the data type to be returned. One of:<p/>{@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL11#GL_FLOAT}, {@link GL11#GL_UNSIGNED_BYTE}
	 * @param size     the size of the {@code data} buffer
	 * @param data     the buffer which will be filled with the requested information
	 */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, int size, ByteBuffer data) {
		long __functionAddress = getInstance().wglGetGPUInfoAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, size * GLChecks.translateTypeToBytes(dataType));
		}
		return nwglGetGPUInfoAMD(id, property, dataType, size, memAddress(data), __functionAddress);
	}

	/** Alternative version of: {@link #wglGetGPUInfoAMD(int, int, int, int, ByteBuffer)} */
	public static int wglGetGPUInfoAMD(int id, int property, int dataType, ByteBuffer data) {
		long __functionAddress = getInstance().wglGetGPUInfoAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data), __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #wglGetGPUInfoAMD(int, int, int, int, ByteBuffer)} */
	public static int wglGetGPUInfoAMD(int id, int property, ByteBuffer data) {
		long __functionAddress = getInstance().wglGetGPUInfoAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetGPUInfoAMD(id, property, GL11.GL_UNSIGNED_BYTE, data.remaining(), memAddress(data), __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #wglGetGPUInfoAMD(int, int, int, int, ByteBuffer)} */
	public static int wglGetGPUInfoAMD(int id, int property, IntBuffer data) {
		long __functionAddress = getInstance().wglGetGPUInfoAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetGPUInfoAMD(id, property, GL11.GL_UNSIGNED_INT, data.remaining(), memAddress(data), __functionAddress);
	}

	// --- [ wglGetContextGPUIDAMD ] ---

	/** JNI method for {@link #wglGetContextGPUIDAMD(long)} */
	public static native int nwglGetContextGPUIDAMD(long hglrc, long __functionAddress);

	/**
	 * Determine which GPU a context is attached to.
	 * <p/>
	 * Unassociated contexts are created by calling {@link org.lwjgl.system.windows.WGL#wglCreateContext}. Although these contexts are unassociated, their use
	 * will still be tied to a single GPU in most cases. For this reason it is advantageous to be able to query the GPU an existing unassociated context
	 * resides on. If multiple GPUs are available, it would be undesirable to use one for rendering to visible surfaces and then chose the same one for
	 * off-screen rendering.
	 *
	 * @param hglrc the context for which the GPU id will be returned
	 */
	public static int wglGetContextGPUIDAMD(long hglrc) {
		long __functionAddress = getInstance().wglGetContextGPUIDAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hglrc);
		}
		return nwglGetContextGPUIDAMD(hglrc, __functionAddress);
	}

	// --- [ wglCreateAssociatedContextAMD ] ---

	/** JNI method for {@link #wglCreateAssociatedContextAMD(int)} */
	public static native long nwglCreateAssociatedContextAMD(int id, long __functionAddress);

	/**
	 * Creates an associated context. Upon successful creation, no pixel format is tied to an associated context.
	 *
	 * @param id a valid GPU id
	 */
	public static long wglCreateAssociatedContextAMD(int id) {
		long __functionAddress = getInstance().wglCreateAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglCreateAssociatedContextAMD(id, __functionAddress);
	}

	// --- [ wglCreateAssociatedContextAttribsAMD ] ---

	/** JNI method for {@link #wglCreateAssociatedContextAttribsAMD(int, long, ByteBuffer)} */
	public static native long nwglCreateAssociatedContextAttribsAMD(int id, long shareContext, long attribList, long __functionAddress);

	/**
	 * Create an associated context with a specific GL version.
	 * <p/>
	 * All capabilities and limitations of WGLARBCreateContext#wglCreateContextAttribsARB} apply to {@code wglCreateAssociatedContextAttribsAMD}.
	 *
	 * @param id           a valid GPU id
	 * @param shareContext must either be NULL or that of an associated context created with the the same GPU ID as {@code id}
	 * @param attribList   a 0-terminated list of attributes for the context
	 */
	public static long wglCreateAssociatedContextAttribsAMD(int id, long shareContext, ByteBuffer attribList) {
		long __functionAddress = getInstance().wglCreateAssociatedContextAttribsAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( attribList != null ) checkNT4(attribList);
		}
		return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList), __functionAddress);
	}

	/** Alternative version of: {@link #wglCreateAssociatedContextAttribsAMD(int, long, ByteBuffer)} */
	public static long wglCreateAssociatedContextAttribsAMD(int id, long shareContext, IntBuffer attribList) {
		long __functionAddress = getInstance().wglCreateAssociatedContextAttribsAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( attribList != null ) checkNT(attribList);
		}
		return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList), __functionAddress);
	}

	// --- [ wglDeleteAssociatedContextAMD ] ---

	/** JNI method for {@link #wglDeleteAssociatedContextAMD(long)} */
	public static native int nwglDeleteAssociatedContextAMD(long hglrc, long __functionAddress);

	/**
	 * Deletes an associated context. An associated context cannot be deleted by calling {@link org.lwjgl.system.windows.WGL#wglDeleteContext}.
	 *
	 * @param hglrc a valid associated context created by calling {@link #wglCreateAssociatedContextAMD}
	 */
	public static int wglDeleteAssociatedContextAMD(long hglrc) {
		long __functionAddress = getInstance().wglDeleteAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hglrc);
		}
		return nwglDeleteAssociatedContextAMD(hglrc, __functionAddress);
	}

	// --- [ wglMakeAssociatedContextCurrentAMD ] ---

	/** JNI method for {@link #wglMakeAssociatedContextCurrentAMD(long)} */
	public static native int nwglMakeAssociatedContextCurrentAMD(long hglrc, long __functionAddress);

	/**
	 * Makes an associated context current in the current thread.
	 *
	 * @param hglrc a context handle created by calling {@link #wglCreateAssociatedContextAMD}
	 */
	public static int wglMakeAssociatedContextCurrentAMD(long hglrc) {
		long __functionAddress = getInstance().wglMakeAssociatedContextCurrentAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hglrc);
		}
		return nwglMakeAssociatedContextCurrentAMD(hglrc, __functionAddress);
	}

	// --- [ wglGetCurrentAssociatedContextAMD ] ---

	/** JNI method for {@link #wglGetCurrentAssociatedContextAMD()} */
	public static native long nwglGetCurrentAssociatedContextAMD(long __functionAddress);

	/** Returns the current associated context in the current thread. */
	public static long wglGetCurrentAssociatedContextAMD() {
		long __functionAddress = getInstance().wglGetCurrentAssociatedContextAMD;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nwglGetCurrentAssociatedContextAMD(__functionAddress);
	}

	// --- [ wglBlitContextFramebufferAMD ] ---

	/** JNI method for {@link #wglBlitContextFramebufferAMD(long, int, int, int, int, int, int, int, int, int, int)} */
	public static native void nwglBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, long __functionAddress);

	/**
	 * Blits data from one context to another. This facilitates high performance data communication between multiple contexts.
	 *
	 * @param dstCtx the context handle for the write context
	 * @param srcX0  the source x<sub>0</sub> coordinate
	 * @param srcY0  the source Y<sub>0</sub> coordinate
	 * @param srcX1  the source X<sub>1</sub> coordinate
	 * @param srcY1  the source Y<sub>1</sub> coordinate
	 * @param dstX0  the destination X<sub>0</sub> coordinate
	 * @param dstY0  the destination Y<sub>0</sub> coordinate
	 * @param dstX1  the destination X<sub>1</sub> coordinate
	 * @param dstY1  the destination Y<sub>1</sub> coordinate
	 * @param mask   the bitwise OR of a number of values indicating which buffers are to be copied. One of:<p/>{@link GL11#GL_COLOR_BUFFER_BIT}, {@link GL11#GL_DEPTH_BUFFER_BIT}, {@link GL11#GL_STENCIL_BUFFER_BIT}
	 * @param filter the interpolation method to apply if the image is stretched. One of:<p/>{@link GL11#GL_LINEAR}, {@link GL11#GL_NEAREST}
	 */
	public static void wglBlitContextFramebufferAMD(long dstCtx, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().wglBlitContextFramebufferAMD;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(dstCtx);
		}
		nwglBlitContextFramebufferAMD(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLAMDGpuAssociation;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_AMD_gpu_association") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglGetGPUIDsAMD) &&
			GL.isFunctionSupported(funcs.wglGetGPUInfoAMD) &&
			GL.isFunctionSupported(funcs.wglGetContextGPUIDAMD) &&
			GL.isFunctionSupported(funcs.wglCreateAssociatedContextAMD) &&
			GL.isFunctionSupported(funcs.wglCreateAssociatedContextAttribsAMD) &&
			GL.isFunctionSupported(funcs.wglDeleteAssociatedContextAMD) &&
			GL.isFunctionSupported(funcs.wglMakeAssociatedContextCurrentAMD) &&
			GL.isFunctionSupported(funcs.wglGetCurrentAssociatedContextAMD) &&
			(!ext.contains("GL_EXT_framebuffer_blit") || GL.isFunctionSupported(funcs.wglBlitContextFramebufferAMD));

		return GL.checkExtension("WGL_AMD_gpu_association", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLAMDGpuAssociation}. */
	public static final class Functions implements FunctionMap {

		public final long
			wglGetGPUIDsAMD,
			wglGetGPUInfoAMD,
			wglGetContextGPUIDAMD,
			wglCreateAssociatedContextAMD,
			wglCreateAssociatedContextAttribsAMD,
			wglDeleteAssociatedContextAMD,
			wglMakeAssociatedContextCurrentAMD,
			wglGetCurrentAssociatedContextAMD,
			wglBlitContextFramebufferAMD;

		public Functions(FunctionProvider provider) {
			wglGetGPUIDsAMD = provider.getFunctionAddress("wglGetGPUIDsAMD");
			wglGetGPUInfoAMD = provider.getFunctionAddress("wglGetGPUInfoAMD");
			wglGetContextGPUIDAMD = provider.getFunctionAddress("wglGetContextGPUIDAMD");
			wglCreateAssociatedContextAMD = provider.getFunctionAddress("wglCreateAssociatedContextAMD");
			wglCreateAssociatedContextAttribsAMD = provider.getFunctionAddress("wglCreateAssociatedContextAttribsAMD");
			wglDeleteAssociatedContextAMD = provider.getFunctionAddress("wglDeleteAssociatedContextAMD");
			wglMakeAssociatedContextCurrentAMD = provider.getFunctionAddress("wglMakeAssociatedContextCurrentAMD");
			wglGetCurrentAssociatedContextAMD = provider.getFunctionAddress("wglGetCurrentAssociatedContextAMD");
			wglBlitContextFramebufferAMD = provider.getFunctionAddress("wglBlitContextFramebufferAMD");
		}

	}

}