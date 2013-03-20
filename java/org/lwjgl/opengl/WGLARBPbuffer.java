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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_pbuffer.txt">WGL_ARB_pbuffer</a> extension.
 * <p/>
 * This extension defines pixel buffers (pbuffer for short). Pbuffers are additional non-visible rendering buffers for an OpenGL renderer. Pbuffers are
 * equivalent to a window that has the same pixel format descriptor with the following exceptions:
 * <ol>
 * 	<li>There is no rendering to a pbuffer by GDI.</li>
 * 	<li>The pixel format descriptors used for a pbuffer can only be those that are supported by the ICD.  Generic formats are not valid.</li>
 * 	<li>The allocation of a pbuffer can fail if there are insufficient resources (i.e., all the pbuffer memory has been allocated).</li>
 * 	<li>The pixel buffer might be lost if a display mode change occurs. A query is provided that can be called after a display mode change to determine the
 * state of the pixel buffer.</li>
 * </ol>
 * <p/>
 * The intent of the pbuffer semantics is to enable implementations to allocate pbuffers in non-visible frame buffer memory. These pbuffers are intended to
 * be "static" resources in that a program will typically allocate them only once rather than as a part of its rendering loop.  (Pbuffers should be
 * deallocated when the program is no longer using them -- for example, if the program is iconified.)
 * <p/>
 * The frame buffer resources that are associated with a pbuffer are also static and are deallocated when the pbuffer is destroyed or possibly when a
 * display mode change occurs.
 */
public final class WGLARBPbuffer {

	/**
	 * Accepted by the {@code attribIList} parameter of {@link WGLARBPixelFormat#wglChoosePixelFormatARB} and the {@code attributes} parameter of
	 * {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB}.
	 */
	public static final int
		WGL_DRAW_TO_PBUFFER_ARB = 0x202D;

	/** Accepted by the {@code attributes} parameter of {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB}. */
	public static final int
		WGL_MAX_PBUFFER_PIXELS_ARB = 0x202E,
		WGL_MAX_PBUFFER_WIDTH_ARB  = 0x202F,
		WGL_MAX_PBUFFER_HEIGHT_ARB = 0x2030;

	/** Accepted by the {@code attribList} parameter of {@link #wglCreatePbufferARB(long, int, int, int, ByteBuffer)}. */
	public static final int
		WGL_PBUFFER_LARGEST_ARB = 0x2033;

	/** Accepted by the {@code attribute} parameter of {@link #wglQueryPbufferARB(long, int, ByteBuffer)}. */
	public static final int
		WGL_PBUFFER_WIDTH_ARB  = 0x2034,
		WGL_PBUFFER_HEIGHT_ARB = 0x2035,
		WGL_PBUFFER_LOST_ARB   = 0x2036;

	private WGLARBPbuffer() {}

	// --- [ wglCreatePbufferARB ] ---

	/** JNI method for {@link #wglCreatePbufferARB(long, int, int, int, ByteBuffer)} */
	public static native long nwglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, long attribList, long __functionAddress);

	/**
	 * Creates a pixel buffer (pbuffer) and returns a handle to it.
	 * <p/>
	 * Support for pbuffers may be restricted to specific pixel formats. Use {@link WGLARBPixelFormat#wglGetPixelFormatAttribiARB} to query the {@link #WGL_DRAW_TO_PBUFFER_ARB}
	 * attribute to determine which pixel formats support the creation of pbuffers.
	 *
	 * @param hdc         a device context for the device on which the pbuffer is created
	 * @param pixelFormat a non-generic pixel format descriptor index
	 * @param width       the pixel width of the rectangular pbuffer
	 * @param height      the pixel height of the rectangular pbuffer
	 * @param attribList  a 0-terminated list of attributes {type, value} pairs containing integer attribute values
	 */
	public static long wglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, ByteBuffer attribList) {
		long __functionAddress = getInstance().wglCreatePbufferARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
			if ( attribList != null ) checkNT4(attribList);
		}
		return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList), __functionAddress);
	}

	/** Alternative version of: {@link #wglCreatePbufferARB(long, int, int, int, ByteBuffer)} */
	public static long wglCreatePbufferARB(long hdc, int pixelFormat, int width, int height, IntBuffer attribList) {
		long __functionAddress = getInstance().wglCreatePbufferARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(hdc);
			if ( attribList != null ) checkNT(attribList);
		}
		return nwglCreatePbufferARB(hdc, pixelFormat, width, height, memAddressSafe(attribList), __functionAddress);
	}

	// --- [ wglGetPbufferDCARB ] ---

	/** JNI method for {@link #wglGetPbufferDCARB(long)} */
	public static native long nwglGetPbufferDCARB(long pbuffer, long __functionAddress);

	/**
	 * Creates a device context for the pbuffer.
	 *
	 * @param pbuffer a pbuffer handle returned from a previous call to {@link #wglCreatePbufferARB(long, int, int, int, ByteBuffer)}
	 */
	public static long wglGetPbufferDCARB(long pbuffer) {
		long __functionAddress = getInstance().wglGetPbufferDCARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(pbuffer);
		}
		return nwglGetPbufferDCARB(pbuffer, __functionAddress);
	}

	// --- [ wglReleasePbufferDCARB ] ---

	/** JNI method for {@link #wglReleasePbufferDCARB(long, long)} */
	public static native int nwglReleasePbufferDCARB(long pbuffer, long hdc, long __functionAddress);

	/**
	 * Releases a device context obtained from a previous call to {@link #wglGetPbufferDCARB(long)}.
	 *
	 * @param pbuffer a pbuffer handle
	 * @param hdc     a device context handle
	 */
	public static int wglReleasePbufferDCARB(long pbuffer, long hdc) {
		long __functionAddress = getInstance().wglReleasePbufferDCARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(pbuffer);
			checkPointer(hdc);
		}
		return nwglReleasePbufferDCARB(pbuffer, hdc, __functionAddress);
	}

	// --- [ wglDestroyPbufferARB ] ---

	/** JNI method for {@link #wglDestroyPbufferARB(long)} */
	public static native int nwglDestroyPbufferARB(long pbuffer, long __functionAddress);

	/**
	 * Destroys a pbuffer.
	 * <p/>
	 * The pbuffer is destroyed once it is no longer current to any rendering context.  When a pbuffer is destroyed, any memory resources that are attached to
	 * it are freed and its handle is no longer valid.
	 *
	 * @param pbuffer a pbuffer handle
	 */
	public static int wglDestroyPbufferARB(long pbuffer) {
		long __functionAddress = getInstance().wglDestroyPbufferARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(pbuffer);
		}
		return nwglDestroyPbufferARB(pbuffer, __functionAddress);
	}

	// --- [ wglQueryPbufferARB ] ---

	/** JNI method for {@link #wglQueryPbufferARB(long, int, ByteBuffer)} */
	public static native int nwglQueryPbufferARB(long pbuffer, int attribute, long value, long __functionAddress);

	/**
	 * Queries an attribute associated with a specific pbuffer.
	 *
	 * @param pbuffer   a pbuffer handle
	 * @param attribute the attribute to query. One of:<p/>{@link #WGL_PBUFFER_WIDTH_ARB}, {@link #WGL_PBUFFER_HEIGHT_ARB}, {@link #WGL_PBUFFER_LOST_ARB}
	 * @param value     the attribute value
	 */
	public static int wglQueryPbufferARB(long pbuffer, int attribute, ByteBuffer value) {
		long __functionAddress = getInstance().wglQueryPbufferARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(pbuffer);
			checkBuffer(value, 1 << 2);
		}
		return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #wglQueryPbufferARB(long, int, ByteBuffer)} */
	public static int wglQueryPbufferARB(long pbuffer, int attribute, IntBuffer value) {
		long __functionAddress = getInstance().wglQueryPbufferARB;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(pbuffer);
			checkBuffer(value, 1);
		}
		return nwglQueryPbufferARB(pbuffer, attribute, memAddress(value), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLARBPbuffer;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_ARB_pbuffer") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.wglCreatePbufferARB) &&
			GL.isFunctionSupported(funcs.wglGetPbufferDCARB) &&
			GL.isFunctionSupported(funcs.wglReleasePbufferDCARB) &&
			GL.isFunctionSupported(funcs.wglDestroyPbufferARB) &&
			GL.isFunctionSupported(funcs.wglQueryPbufferARB);

		return GL.checkExtension("WGL_ARB_pbuffer", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLARBPbuffer}. */
	public static final class Functions implements FunctionMap {

		public final long
			wglCreatePbufferARB,
			wglGetPbufferDCARB,
			wglReleasePbufferDCARB,
			wglDestroyPbufferARB,
			wglQueryPbufferARB;

		public Functions(FunctionProvider provider) {
			wglCreatePbufferARB = provider.getFunctionAddress("wglCreatePbufferARB");
			wglGetPbufferDCARB = provider.getFunctionAddress("wglGetPbufferDCARB");
			wglReleasePbufferDCARB = provider.getFunctionAddress("wglReleasePbufferDCARB");
			wglDestroyPbufferARB = provider.getFunctionAddress("wglDestroyPbufferARB");
			wglQueryPbufferARB = provider.getFunctionAddress("wglQueryPbufferARB");
		}

	}

}