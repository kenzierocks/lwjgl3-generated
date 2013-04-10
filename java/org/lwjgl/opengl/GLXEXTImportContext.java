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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/import_context.txt">GLX_EXT_import_context</a> extension.
 * <p/>
 * This extension allows multiple X clients to share an indirect rendering context.
 * <p/>
 * Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.
 */
public final class GLXEXTImportContext {

	/** Accepted by the {@code attribute} parameter of {@link #glXQueryContextInfoEXT}: */
	public static final int
		GLX_SHARE_CONTEXT_EXT = 0x800A,
		GLX_VISUAL_ID_EXT     = 0x800B,
		GLX_SCREEN_EXT        = 0x800C;

	private GLXEXTImportContext() {}

	// --- [ glXGetCurrentDisplayEXT ] ---

	/** JNI method for {@link #glXGetCurrentDisplayEXT} */
	public static native long nglXGetCurrentDisplayEXT(long __functionAddress);

	/** Returns the display associated with the current context. */
	public static long glXGetCurrentDisplayEXT() {
		long __functionAddress = getInstance().glXGetCurrentDisplayEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglXGetCurrentDisplayEXT(__functionAddress);
	}

	// --- [ glXQueryContextInfoEXT ] ---

	/** JNI method for {@link #glXQueryContextInfoEXT} */
	public static native int nglXQueryContextInfoEXT(long display, long context, int attribute, long value, long __functionAddress);

	/**
	 * Obtains the value of a context's attribute.
	 *
	 * @param display   the connection to the X server
	 * @param context   the context being queried
	 * @param attribute the attribute to query
	 * @param value     returns the attribute value
	 */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, ByteBuffer value) {
		long __functionAddress = getInstance().glXQueryContextInfoEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
			checkBuffer(value, 1 << 2);
		}
		return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glXQueryContextInfoEXT} */
	public static int glXQueryContextInfoEXT(long display, long context, int attribute, IntBuffer value) {
		long __functionAddress = getInstance().glXQueryContextInfoEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
			checkBuffer(value, 1);
		}
		return nglXQueryContextInfoEXT(display, context, attribute, memAddress(value), __functionAddress);
	}

	// --- [ glXGetContextIDEXT ] ---

	/** JNI method for {@link #glXGetContextIDEXT} */
	public static native long nglXGetContextIDEXT(long context, long __functionAddress);

	/**
	 * Returns the XID of a GLXContext.
	 *
	 * @param context the context
	 */
	public static long glXGetContextIDEXT(long context) {
		long __functionAddress = getInstance().glXGetContextIDEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(context);
		}
		return nglXGetContextIDEXT(context, __functionAddress);
	}

	// --- [ glXImportContextEXT ] ---

	/** JNI method for {@link #glXImportContextEXT} */
	public static native long nglXImportContextEXT(long display, long contextID, long __functionAddress);

	/**
	 * May be used in place of glXCreateContext to share another process's indirect rendering context.
	 *
	 * @param display   the connection to the X server
	 * @param contextID the context XID
	 */
	public static long glXImportContextEXT(long display, long contextID) {
		long __functionAddress = getInstance().glXImportContextEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
		}
		return nglXImportContextEXT(display, contextID, __functionAddress);
	}

	// --- [ glXFreeContextEXT ] ---

	/** JNI method for {@link #glXFreeContextEXT} */
	public static native void nglXFreeContextEXT(long display, long context, long __functionAddress);

	/**
	 * Frees the client-side part of a GLXContext that was created  with {@link #glXImportContextEXT}.
	 *
	 * @param display the connection to the X server
	 * @param context the context to free
	 */
	public static void glXFreeContextEXT(long display, long context) {
		long __functionAddress = getInstance().glXFreeContextEXT;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(display);
			checkPointer(context);
		}
		nglXFreeContextEXT(display, context, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GLXEXTImportContext;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GLX_EXT_import_context") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glXGetCurrentDisplayEXT) &&
			GL.isFunctionSupported(funcs.glXQueryContextInfoEXT) &&
			GL.isFunctionSupported(funcs.glXGetContextIDEXT) &&
			GL.isFunctionSupported(funcs.glXImportContextEXT) &&
			GL.isFunctionSupported(funcs.glXFreeContextEXT);

		return GL.checkExtension("GLX_EXT_import_context", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GLXEXTImportContext}. */
	public static final class Functions implements FunctionMap {

		public final long
			glXGetCurrentDisplayEXT,
			glXQueryContextInfoEXT,
			glXGetContextIDEXT,
			glXImportContextEXT,
			glXFreeContextEXT;

		public Functions(FunctionProvider provider) {
			glXGetCurrentDisplayEXT = provider.getFunctionAddress("glXGetCurrentDisplayEXT");
			glXQueryContextInfoEXT = provider.getFunctionAddress("glXQueryContextInfoEXT");
			glXGetContextIDEXT = provider.getFunctionAddress("glXGetContextIDEXT");
			glXImportContextEXT = provider.getFunctionAddress("glXImportContextEXT");
			glXFreeContextEXT = provider.getFunctionAddress("glXFreeContextEXT");
		}

	}

}