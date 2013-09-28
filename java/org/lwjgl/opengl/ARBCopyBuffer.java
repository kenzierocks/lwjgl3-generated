/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/copy_buffer.txt">ARB_copy_buffer</a> extension. */
public final class ARBCopyBuffer {

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
	 * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData:
	 */
	public static final int
		GL_COPY_READ_BUFFER  = 0x8F36,
		GL_COPY_WRITE_BUFFER = 0x8F37;

	private ARBCopyBuffer() {}

	// --- [ glCopyBufferSubData ] ---

	/** JNI method for {@link #glCopyBufferSubData glCopyBufferSubData} */
	public static native void nglCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size, long __functionAddress);

	/**
	 * Copies all or part of one buffer object's data store to the data store of another buffer object.
	 * <p/>
	 * An INVALID_VALUE error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
	 * bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.
	 * <p/>
	 * An INVALID_VALUE error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
	 * and [writeoffset, writeoffset+size) overlap.
	 * <p/>
	 * An INVALID_OPERATION error is generated if zero is bound to readtarget or writetarget.
	 * <p/>
	 * An INVALID_OPERATION error is generated if the buffer objects bound to either readtarget or writetarget are mapped.
	 *
	 * @param readTarget  the source buffer object target. One of:. One of:<p/>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link #GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}
	 * @param writeTarget the destination buffer object target
	 * @param readOffset  the source buffer object offset, in bytes
	 * @param writeOffset the destination buffer object offset, in bytes
	 * @param size        the number of bytes to copy
	 */
	public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().glCopyBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	@JavadocExclude
	public static Functions getInstance() {
		return GL.getCapabilities().__ARBCopyBuffer;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_copy_buffer") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  GL.isFunctionSupported(funcs.glCopyBufferSubData);

		return GL.checkExtension("GL_ARB_copy_buffer", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code ARBCopyBuffer}. */
	@JavadocExclude
	public static final class Functions implements FunctionMap {

		public final long glCopyBufferSubData;

		public Functions(FunctionProvider provider) {
			glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
		}

	}

}