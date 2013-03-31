/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;

/** The OpenCL 1.2 OpenGL interoperability functionality. */
public final class CL12GL {

	/** cl_gl_object_type */
	public static final int
		CL_GL_OBJECT_TEXTURE_2D_ARRAY = 0x200E,
		CL_GL_OBJECT_TEXTURE1D        = 0x200F,
		CL_GL_OBJECT_TEXTURE1D_ARRAY  = 0x2010,
		CL_GL_OBJECT_TEXTURE_BUFFER   = 0x2011;

	private CL12GL() {}

	// --- [ clCreateFromGLTexture ] ---

	/** JNI method for {@link #clCreateFromGLTexture} */
	public static native long nclCreateFromGLTexture(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret, long __functionAddress);

	/**
	 * Creates one of the following:
	 * <ul>
	 * <li>an OpenCL 2D image object from an OpenGL 2D texture object or a single face of an OpenGL cubemap texture object,</li>
	 * <li>an OpenCL 2D image array object from an OpenGL 2D texture array object,</li>
	 * <li>an OpenCL 1D image object from an OpenGL 1D texture object,</li>
	 * <li>an OpenCL 1D image buffer object from an OpenGL texture buffer object,</li>
	 * <li>an OpenCL 1D image array object from an OpenGL 1D texture array object,</li>
	 * <li>an OpenCL 3D image object from an OpenGL 3D texture object.</li>
	 * </ul>
	 * <p/>
	 * If the state of a GL texture object is modified through the GL API (e.g. {@link GL11#glTexImage2D}, {@link GL12#glTexImage3D} or the values of the
	 * texture parameters {@link GL12#GL_TEXTURE_BASE_LEVEL} or {@link GL12#GL_TEXTURE_MAX_LEVEL} are modified) while there exists a corresponding CL image
	 * object, subsequent use of the CL image object will result in undefined behavior.
	 * <p/>
	 * The {@link CL10#clRetainMemObject} and {@link CL10#clReleaseMemObject} functions can be used to retain and release the image objects.
	 *
	 * @param context        a valid OpenCL context created from an OpenGL context
	 * @param flags          a bit-field that is used to specify usage information. One of:<p/>{@link CL10#CL_MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE}
	 * @param texture_target defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter. One of:<p/>{@link GL11#GL_TEXTURE_1D}, {@link GL30#GL_TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_BUFFER}, {@link GL11#GL_TEXTURE_2D}, {@link GL30#GL_TEXTURE_2D_ARRAY,}, {@link GL12#GL_TEXTURE_3D}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z}, {@link GL31#GL_TEXTURE_RECTANGLE}
	 * @param miplevel       the mipmap level to be used. Implementations may return {@link CL10#CL_INVALID_OPERATION} for {@code miplevel} values &gt; 0. If
	 *                       {@code texture_target} is {@link GL31#GL_TEXTURE_BUFFER}, {@code miplevel} must be 0.
	 * @param texture        the name of a GL 1D, 2D, 3D, 1D array, 2D array, cubemap, rectangle or buffer texture object. The texture object must be a complete texture as per
	 *                       OpenGL rules on texture completeness. The texture format and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be
	 *                       used to create the OpenCL image memory object. Only GL texture objects with an internal format that maps to appropriate OpenCL image channel order
	 *                       and data type may be used to create the OpenCL image memory object.
	 * @param errcode_ret    will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero OpenCL image object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE} if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
	 *         values specified in the description of {@code texture_target}.</li>
	 *         <li>{@link #CL_INVALID_MIP_LEVEL} if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
	 *         OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).</li>
	 *         <li>{@link #CL_INVALID_MIP_LEVEL} if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
	 *         levels.</li>
	 *         <li>{@link #CL_INVALID_GL_OBJECT} if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
	 *         of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.</li>
	 *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR} if the OpenGL texture internal format does not map to a supported OpenCL image format.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION} if {@code texture} is a GL texture object created with a border width value greater than zero.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateFromGLTexture(CLContext context, long flags, int texture_target, int miplevel, int texture, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateFromGLTexture;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateFromGLTexture(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateFromGLTexture} */
	public static CLMem clCreateFromGLTexture(CLContext context, long flags, int texture_target, int miplevel, int texture, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).clCreateFromGLTexture;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateFromGLTexture(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL12GL;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("opencl12gl") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  funcs.clCreateFromGLTexture != 0L;

		return CL.checkExtension("opencl12gl", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL12GL}. */
	public static final class Functions implements FunctionMap {

		public final long clCreateFromGLTexture;

		public Functions(FunctionProviderLocal provider) {
			clCreateFromGLTexture = provider.getFunctionAddress("clCreateFromGLTexture");
		}

	}

}