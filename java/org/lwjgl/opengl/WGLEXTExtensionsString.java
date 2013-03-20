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

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/wgl_extensions_string.txt">WGL_EXT_extensions_string</a> extension. */
public final class WGLEXTExtensionsString {

	private WGLEXTExtensionsString() {}

	// --- [ wglGetExtensionsStringEXT ] ---

	/** JNI method for {@link #wglGetExtensionsStringEXT()} */
	public static native long nwglGetExtensionsStringEXT(long __functionAddress);

	/**
	 * Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be NULL terminated and
	 * will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
	 * empty string is returned.
	 */
	public static String wglGetExtensionsStringEXT() {
		long __functionAddress = getInstance().wglGetExtensionsStringEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		long __result = nwglGetExtensionsStringEXT(__functionAddress);
		return memDecodeASCII(memByteBufferNT1(__result));
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__WGLEXTExtensionsString;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("WGL_EXT_extensions_string") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.wglGetExtensionsStringEXT);

		return GL.checkExtension("WGL_EXT_extensions_string", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code WGLEXTExtensionsString}. */
	public static final class Functions implements FunctionMap {

		public final long wglGetExtensionsStringEXT;

		public Functions(FunctionProvider provider) {
			wglGetExtensionsStringEXT = provider.getFunctionAddress("wglGetExtensionsStringEXT");
		}

	}

}