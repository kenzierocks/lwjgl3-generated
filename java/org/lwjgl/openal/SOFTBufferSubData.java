/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** bindings to AL_SOFT_buffer_sub_data extension. */
public final class SOFTBufferSubData {

	/** Accepted by the @{code paramName} parameter of alGetSourceiv and alGetSourcefv. */
	public static final int
		AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
		AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

	private SOFTBufferSubData() {}

	// --- [ alBufferSubDataSOFT ] ---

	/** JNI method for {@link #alBufferSubDataSOFT(int, int, ByteBuffer, int, int)} */
	public static native void nalBufferSubDataSOFT(int buffer, int format, long data, int offset, int length, long __functionAddress);

	/**
	 * To update a section of buffered sample data, use the function alBufferSubDataSOFT.
	 * The named @{code buffer} may be attached to a source (either queued or by the
	 * AL_BUFFER property), and the source does not need to be stopped, paused,
	 * or in an initial state to be modified.
	 * <p/>
	 * The @{code offset} value is the number of bytes from the start of the original
	 * data, and @{code length} is the number of bytes of the original data, to modify.
	 * If either @{code offset} or @{code length} are negative, or if the sum of @{code offset} and
	 * @{code length} reaches beyond the end of the buffer, an AL_INVALID_VALUE error
	 * is generated. For compressed formats, @{code length} and @{code offset} must be block
	 * aligned. Complex compressed formats (such as those with no constant block
	 * alignment), may not be modified and will result in an AL_INVALID_ENUM
	 * error.
	 * <p/>
	 * The specified @{code format} is the sample format of the passed @{code data}. The
	 * passed format must exactly match the format passed to alBufferData, or an
	 * AL_INVALID_ENUM error is generated.
	 * <p/>
	 * <p/>
	 * When modifying a playing source's buffer, an application must take care to
	 * not modify the section that is currently being played. The read-only
	 * source attributes
	 * <p/>
	 * AL_BYTE_RW_OFFSETS_SOFT
	 * AL_SAMPLE_RW_OFFSETS_SOFT
	 * <p/>
	 * may be used to retrieve the read and write cursor offsets. Behavior is
	 * undefined if an attempt is made to modify buffer data between the read and
	 * write offsets.
	 *
	 * @param buffer ID of the buffer to modify
	 * @param format sample format of the passed data
	 * @param data   existing buffer data to write to
	 * @param offset number of bytes from the start of the original data
	 * @param length number of bytes of the original data, to modify
	 */
	public static void alBufferSubDataSOFT(int buffer, int format, ByteBuffer data, int offset, int length) {
		long __functionAddress = getInstance().alBufferSubDataSOFT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, length, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return AL.getCapabilities().__SOFTBufferSubData;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_SOFT_buffer_sub_data") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  funcs.alBufferSubDataSOFT != 0L;

		return AL.checkExtension("AL_SOFT_buffer_sub_data", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code SOFTBufferSubData}. */
	public static final class Functions implements FunctionMap {

		public final long alBufferSubDataSOFT;

		public Functions(FunctionProvider provider) {
			alBufferSubDataSOFT = provider.getFunctionAddress("alBufferSubDataSOFT");
		}

	}

}