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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;

/**
 * The OpenCL 1.0 OpenGL interoperability functionality.
 * <p/>
 * OpenCL memory objects may be created from OpenGL objects if and only if the OpenCL context has been created from an OpenGL share group object or
 * context. OpenGL share groups and contexts are created using platform specific APIs such as EGL, CGL, WGL, and GLX. On MacOS X, an OpenCL context may be
 * created from an OpenGL share group object using the OpenCL platform extension <strong>cl_apple_gl_sharing</strong>. On other platforms including
 * Microsoft Windows, Linux/Unix and others, an OpenCL context may be created from an OpenGL context using the Khronos platform extension
 * <strong>cl_khr_gl_sharing</strong>.
 * <p/>
 * Any supported OpenGL object defined within the GL share group object, or the share group associated with the GL context from which the CL context is
 * created, may be shared, with the exception of the default OpenGL objects (i.e. objects named zero), which may not be shared.
 * <h3>Lifetime of Shared Objects</h3>
 * An OpenCL memory object created from an OpenGL object (hereinafter refered to as a “shared CL/GL object”) remains valid as long as the corresponding GL
 * object has not been deleted. If the GL object is deleted through the GL API (e.g. {@link GL15#glDeleteBuffers DeleteBuffers}, {@link GL11#glDeleteTextures DeleteTextures}, or
 * {@link GL30#glDeleteRenderbuffers DeleteRenderbuffers}), subsequent use of the CL buffer or image object will result in undefined behavior, including but not limited to
 * possible CL errors and data corruption, but may not result in program termination.
 * <p/>
 * The CL context and corresponding command-queues are dependent on the existence of the GL share group object, or the share group associated with the GL
 * context from which the CL context is created. If the GL share group object or all GL contexts in the share group are destroyed, any use of the CL
 * context or command-queue(s) will result in undefined behavior, which may include program termination. Applications should destroy the CL
 * command-queue(s) and CL context before destroying the corresponding GL share group or contexts.
 * <h3>Synchronizing OpenCL and OpenGL Access to Shared Objects</h3>
 * The application is responsible for maintaining the proper order of operations if the CL and GL contexts are in separate threads.
 * <p/>
 * If a GL context is bound to a thread other than the one in which {@link #clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} is called, changes to any of the objects in
 * {@code mem_objects} may not be visible to that context without additional steps being taken by the application. For an OpenGL 3.1 (or later) context,
 * the requirements are described in Appendix D ("Shared Objects and Multiple Contexts") of the OpenGL 3.1 Specification. For prior versions of OpenGL, the
 * requirements are implementation dependent.
 * <p/>
 * Attempting to access the data store of an OpenGL object after it has been acquired by OpenCL and before it has been released will result in undefined
 * behavior. Similarly, attempting to access a shared CL/GL object from OpenCL before it has been acquired by the OpenCL command queue, or after it has
 * been released, will result in undefined behavior.
 */
public final class CL10GL {

	/** Error Codes */
	public static final int
		CL_INVALID_GL_OBJECT = -60,
		CL_INVALID_MIP_LEVEL = -62;

	/** cl_gl_object_type */
	public static final int
		CL_GL_OBJECT_BUFFER       = 0x2000,
		CL_GL_OBJECT_TEXTURE2D    = 0x2001,
		CL_GL_OBJECT_TEXTURE3D    = 0x2002,
		CL_GL_OBJECT_RENDERBUFFER = 0x2003;

	/** cl_gl_texture_info */
	public static final int
		CL_GL_TEXTURE_TARGET = 0x2004,
		CL_GL_MIPMAP_LEVEL   = 0x2005;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateFromGLBuffer,
		CreateFromGLTexture2D,
		CreateFromGLTexture3D,
		CreateFromGLRenderbuffer,
		GetGLObjectInfo,
		GetGLTextureInfo,
		EnqueueAcquireGLObjects,
		EnqueueReleaseGLObjects;

	@JavadocExclude
	public CL10GL(FunctionProviderLocal provider) {
		CreateFromGLBuffer = provider.getFunctionAddress("clCreateFromGLBuffer");
		CreateFromGLTexture2D = provider.getFunctionAddress("clCreateFromGLTexture2D");
		CreateFromGLTexture3D = provider.getFunctionAddress("clCreateFromGLTexture3D");
		CreateFromGLRenderbuffer = provider.getFunctionAddress("clCreateFromGLRenderbuffer");
		GetGLObjectInfo = provider.getFunctionAddress("clGetGLObjectInfo");
		GetGLTextureInfo = provider.getFunctionAddress("clGetGLTextureInfo");
		EnqueueAcquireGLObjects = provider.getFunctionAddress("clEnqueueAcquireGLObjects");
		EnqueueReleaseGLObjects = provider.getFunctionAddress("clEnqueueReleaseGLObjects");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link CL10GL} instance for the CL platform or device that corresponds to the given {@link CLObject}. */
	public static CL10GL getInstance(CLObject object) {
		return object.getCapabilities().__CL10GL;
	}

	static CL10GL create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenCL10GL") ) return null;

		CL10GL funcs = new CL10GL(provider);

		boolean supported = 
			funcs.CreateFromGLBuffer != 0L &&
			funcs.CreateFromGLTexture2D != 0L &&
			funcs.CreateFromGLTexture3D != 0L &&
			funcs.CreateFromGLRenderbuffer != 0L &&
			funcs.GetGLObjectInfo != 0L &&
			funcs.GetGLTextureInfo != 0L &&
			funcs.EnqueueAcquireGLObjects != 0L &&
			funcs.EnqueueReleaseGLObjects != 0L;

		return CL.checkExtension("OpenCL10GL", funcs, supported);
	}

	// --- [ clCreateFromGLBuffer ] ---

	/** JNI method for {@link #clCreateFromGLBuffer CreateFromGLBuffer} */
	@JavadocExclude
	public static native long nclCreateFromGLBuffer(long context, long flags, int bufobj, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL buffer object from an OpenGL buffer object.
	 * <p/>
	 * The size of the GL buffer object data store at the time {@code clCreateFromGLBuffer} is called will be used as the size of buffer object returned by
	 * {@code clCreateFromGLBuffer}. If the state of a GL buffer object is modified through the GL API (e.g. {@link GL15#glBufferData BufferData}) while there exists a
	 * corresponding CL buffer object, subsequent use of the CL buffer object will result in undefined behavior.
	 * <p/>
	 * The {@link CL10#clRetainMemObject RetainMemObject} and {@link CL10#clReleaseMemObject ReleaseMemObject} functions can be used to retain and release the buffer object.
	 *
	 * @param context     a valid OpenCL context created from an OpenGL context
	 * @param flags       a bit-field that is used to specify usage information. One of:<p/>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
	 * @param bufobj      the name of a GL buffer object. The data store of the GL buffer object must have have been previously created by calling {@link GL15#glBufferData BufferData},
	 *                    although its contents need not be initialized. The size of the data store will be used to determine the size of the CL buffer object.
	 * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero OpenCL buffer object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if {@code bufobj} is not a GL buffer object or is a GL buffer object but does not have an existing data store or the
	 *         size of the buffer is 0.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateFromGLBuffer(CLContext context, long flags, int bufobj, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateFromGLBuffer(context.getPointer(), flags, bufobj, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateFromGLBuffer CreateFromGLBuffer} */
	public static CLMem clCreateFromGLBuffer(CLContext context, long flags, int bufobj, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLBuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateFromGLBuffer(context.getPointer(), flags, bufobj, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateFromGLTexture2D ] ---

	/** JNI method for {@link #clCreateFromGLTexture2D CreateFromGLTexture2D} */
	@JavadocExclude
	public static native long nclCreateFromGLTexture2D(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL 2D image object from an OpenGL 2D texture object, or a single face of an OpenGL cubemap texture object.
	 * <p/>
	 * If the state of a GL texture object is modified through the GL API (e.g. {@link GL11#glTexImage2D TexImage2D} or the values of the texture parameters
	 * {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL} or {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} are modified) while there exists a corresponding CL image object, subsequent use
	 * of the CL image object will result in undefined behavior.
	 * <p/>
	 * The {@link CL10#clRetainMemObject RetainMemObject} and {@link CL10#clReleaseMemObject ReleaseMemObject} functions can be used to retain and release the image objects.
	 *
	 * @param context        a valid OpenCL context created from an OpenGL context
	 * @param flags          a bit-field that is used to specify usage information. One of:<p/>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
	 * @param texture_target defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter. One of:<p/>{@link GL11#GL_TEXTURE_2D GL_TEXTURE_2D}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X GL_TEXTURE_CUBE_MAP_POSITIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y GL_TEXTURE_CUBE_MAP_POSITIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z GL_TEXTURE_CUBE_MAP_POSITIVE_Z}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X GL_TEXTURE_CUBE_MAP_NEGATIVE_X}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y GL_TEXTURE_CUBE_MAP_NEGATIVE_Y}, {@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z GL_TEXTURE_CUBE_MAP_NEGATIVE_Z}, {@link GL31#GL_TEXTURE_RECTANGLE GL_TEXTURE_RECTANGLE}
	 * @param miplevel       the mipmap level to be used. Implementations may return {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} for {@code miplevel} values &gt; 0.
	 * @param texture        the name of a GL 2D, cubemap or rectangle texture object. The texture object must be a complete texture as per OpenGL rules on texture completeness.
	 *                       The texture format and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be used to create the 2D image object.
	 *                       Only GL texture objects with an internal format that maps to appropriate OpenCL image channel order and data type may be used to create a 2D image
	 *                       object.
	 * @param errcode_ret    will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero OpenCL image object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
	 *         values specified in the description of {@code texture_target}.</li>
	 *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
	 *         OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).</li>
	 *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
	 *         levels.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
	 *         of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.</li>
	 *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if the OpenGL texture internal format does not map to a supported OpenCL image format.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code texture} is a GL texture object created with a border width value greater than zero.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateFromGLTexture2D(CLContext context, long flags, int texture_target, int miplevel, int texture, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLTexture2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateFromGLTexture2D(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateFromGLTexture2D CreateFromGLTexture2D} */
	public static CLMem clCreateFromGLTexture2D(CLContext context, long flags, int texture_target, int miplevel, int texture, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLTexture2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateFromGLTexture2D(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateFromGLTexture3D ] ---

	/** JNI method for {@link #clCreateFromGLTexture3D CreateFromGLTexture3D} */
	@JavadocExclude
	public static native long nclCreateFromGLTexture3D(long context, long flags, int texture_target, int miplevel, int texture, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL 3D image object from an OpenGL 3D texture object.
	 * <p/>
	 * If the state of a GL texture object is modified through the GL API (e.g. {@link GL12#glTexImage3D TexImage3D} or the values of the texture parameters
	 * {@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL} or {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL} are modified) while there exists a corresponding CL image object, subsequent use
	 * of the CL image object will result in undefined behavior.
	 * <p/>
	 * The {@link CL10#clRetainMemObject RetainMemObject} and {@link CL10#clReleaseMemObject ReleaseMemObject} functions can be used to retain and release the image objects.
	 *
	 * @param context        a valid OpenCL context created from an OpenGL context
	 * @param flags          a bit-field that is used to specify usage information. One of:<p/>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
	 * @param texture_target defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter. Must be:<p/>{@link GL12#GL_TEXTURE_3D GL_TEXTURE_3D}
	 * @param miplevel       the mipmap level to be used
	 * @param texture        the name of a GL 3D texture object. The texture object must be a complete texture as per OpenGL rules on texture completeness. The texture format
	 *                       and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be used to create the 3D image object. Only GL texture
	 *                       objects with an internal format that maps to appropriate OpenCL image channel order and data type can be used to create the 3D image object.
	 * @param errcode_ret    will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero image object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
	 *         with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
	 *         values specified in the description of {@code texture_target}.</li>
	 *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
	 *         OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).</li>
	 *         <li>{@link CL10GL#CL_INVALID_MIP_LEVEL INVALID_MIP_LEVEL} if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
	 *         levels.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
	 *         of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.</li>
	 *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if the OpenGL texture internal format does not map to a supported OpenCL image format.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code texture} is a GL texture object created with a border width value greater than zero.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateFromGLTexture3D(CLContext context, long flags, int texture_target, int miplevel, int texture, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLTexture3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateFromGLTexture3D(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateFromGLTexture3D CreateFromGLTexture3D} */
	public static CLMem clCreateFromGLTexture3D(CLContext context, long flags, int texture_target, int miplevel, int texture, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLTexture3D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateFromGLTexture3D(context.getPointer(), flags, texture_target, miplevel, texture, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clCreateFromGLRenderbuffer ] ---

	/** JNI method for {@link #clCreateFromGLRenderbuffer CreateFromGLRenderbuffer} */
	@JavadocExclude
	public static native long nclCreateFromGLRenderbuffer(long context, long flags, int renderbuffer, long errcode_ret, long __functionAddress);

	/**
	 * Creates an OpenCL 2D image object from an OpenGL renderbuffer object.
	 * <p/>
	 * If the state of a GL renderbuffer object is modified through the GL API (i.e. changes to the dimensions or format used to represent pixels of the GL
	 * renderbuffer using appropriate GL API calls such as {@link GL30#glRenderbufferStorage RenderbufferStorage}) while there exists a corresponding CL image object, subsequent
	 * use of the CL image object will result in undefined behavior.
	 * <p/>
	 * The {@link CL10#clRetainMemObject RetainMemObject} and {@link CL10#clReleaseMemObject ReleaseMemObject} functions can be used to retain and release the image objects.
	 *
	 * @param context      a valid OpenCL context created from an OpenGL context
	 * @param flags        a bit-field that is used to specify usage information. One of:<p/>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
	 * @param renderbuffer the name of a GL renderbuffer object. The renderbuffer storage must be specified before the image object can be created. The {@code renderbuffer}
	 *                     format and dimensions defined by OpenGL will be used to create the 2D image object. Only GL renderbuffers with internal formats that maps to
	 *                     appropriate OpenCL image channel order and data type can be used to create the 2D image object.
	 * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
	 *
	 * @return a valid non-zero OpenCL image object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
	 *         value with one of the following error values returned in {@code errcode_ret}:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context or was not created from a GL context.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if {@code renderbuffer} is not a GL renderbuffer object or if the width or height of {@code renderbuffer} is zero.</li>
	 *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if the OpenGL renderbuffer internal format does not map to a supported OpenCL image format.</li>
	 *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code renderbuffer} is a multi-sample GL renderbuffer object.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static CLMem clCreateFromGLRenderbuffer(CLContext context, long flags, int renderbuffer, ByteBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLRenderbuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1 << 2);
		}
		return CLMem.create(nclCreateFromGLRenderbuffer(context.getPointer(), flags, renderbuffer, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	/** Alternative version of: {@link #clCreateFromGLRenderbuffer CreateFromGLRenderbuffer} */
	public static CLMem clCreateFromGLRenderbuffer(CLContext context, long flags, int renderbuffer, IntBuffer errcode_ret) {
		long __functionAddress = getInstance(context).CreateFromGLRenderbuffer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( errcode_ret != null ) checkBuffer(errcode_ret, 1);
		}
		return CLMem.create(nclCreateFromGLRenderbuffer(context.getPointer(), flags, renderbuffer, memAddressSafe(errcode_ret), __functionAddress), context);
	}

	// --- [ clGetGLObjectInfo ] ---

	/** JNI method for {@link #clGetGLObjectInfo GetGLObjectInfo} */
	@JavadocExclude
	public static native int nclGetGLObjectInfo(long memobj, long gl_object_type, long gl_object_name, long __functionAddress);

	/**
	 * Queries the OpenGL object used to create the OpenCL memory object and information about the object type i.e. whether it is a texture, renderbuffer or
	 * buffer object.
	 *
	 * @param memobj         the memory object being queried
	 * @param gl_object_type returns the type of GL object attached to {@code memobj}. If {@code gl_object_type} is {@code NULL}, it is ignored. One of:<p/>{@link #CL_GL_OBJECT_BUFFER GL_OBJECT_BUFFER}, {@link #CL_GL_OBJECT_TEXTURE2D GL_OBJECT_TEXTURE2D}, {@link #CL_GL_OBJECT_TEXTURE3D GL_OBJECT_TEXTURE3D}, {@link #CL_GL_OBJECT_RENDERBUFFER GL_OBJECT_RENDERBUFFER}, {@link CL12GL#CL_GL_OBJECT_TEXTURE_2D_ARRAY GL_OBJECT_TEXTURE_2D_ARRAY}, {@link CL12GL#CL_GL_OBJECT_TEXTURE1D GL_OBJECT_TEXTURE1D}, {@link CL12GL#CL_GL_OBJECT_TEXTURE1D_ARRAY GL_OBJECT_TEXTURE1D_ARRAY}, {@link CL12GL#CL_GL_OBJECT_TEXTURE_BUFFER GL_OBJECT_TEXTURE_BUFFER}
	 * @param gl_object_name the GL object name used to create {@code memobj}. If {@code gl_object_name} is {@code NULL}, it is ignored.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the call was executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid OpenCL memory object.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if there is no GL object associated with {@code memobj}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetGLObjectInfo(CLMem memobj, ByteBuffer gl_object_type, ByteBuffer gl_object_name) {
		long __functionAddress = getInstance(memobj).GetGLObjectInfo;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclGetGLObjectInfo(memobj.getPointer(), memAddressSafe(gl_object_type), memAddressSafe(gl_object_name), __functionAddress);
	}

	/** Alternative version of: {@link #clGetGLObjectInfo GetGLObjectInfo} */
	public static int clGetGLObjectInfo(CLMem memobj, IntBuffer gl_object_type, IntBuffer gl_object_name) {
		long __functionAddress = getInstance(memobj).GetGLObjectInfo;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclGetGLObjectInfo(memobj.getPointer(), memAddressSafe(gl_object_type), memAddressSafe(gl_object_name), __functionAddress);
	}

	// --- [ clGetGLTextureInfo ] ---

	/** JNI method for {@link #clGetGLTextureInfo GetGLTextureInfo} */
	@JavadocExclude
	public static native int nclGetGLTextureInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret, long __functionAddress);

	/**
	 * Returns additional information about the GL texture object associated with {@code memobj}.
	 *
	 * @param memobj               
	 * @param param_name           specifies what additional information about the GL texture object associated with {@code memobj} to query. One of:<p/>{@link #CL_GL_TEXTURE_TARGET GL_TEXTURE_TARGET}, {@link #CL_GL_MIPMAP_LEVEL GL_MIPMAP_LEVEL}, {@link KHRGLMSAASharing#CL_GL_NUM_SAMPLES GL_NUM_SAMPLES}
	 * @param param_value_size     the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
	 * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid OpenCL memory object.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if there is no GL texture object associated with {@code memobj}.</li>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return
	 *         type and {@code param_value} is not {@code NULL}, or if {@code param_value} and {@code param_value_size_ret} are {@code NULL}.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clGetGLTextureInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).GetGLTextureInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value != null ) checkBuffer(param_value, param_value_size);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1 << POINTER_SHIFT);
		}
		return nclGetGLTextureInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** Alternative version of: {@link #clGetGLTextureInfo GetGLTextureInfo} */
	public static int clGetGLTextureInfo(CLMem memobj, int param_name, long param_value_size, ByteBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).GetGLTextureInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetGLTextureInfo(memobj.getPointer(), param_name, param_value_size, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	/** IntBuffer version of: {@link #clGetGLTextureInfo GetGLTextureInfo} */
	public static int clGetGLTextureInfo(CLMem memobj, int param_name, IntBuffer param_value, PointerBuffer param_value_size_ret) {
		long __functionAddress = getInstance(memobj).GetGLTextureInfo;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( param_value_size_ret != null ) checkBuffer(param_value_size_ret, 1);
		}
		return nclGetGLTextureInfo(memobj.getPointer(), param_name, (param_value == null ? 0 : param_value.remaining()) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret), __functionAddress);
	}

	// --- [ clEnqueueAcquireGLObjects ] ---

	/** JNI method for {@link #clEnqueueAcquireGLObjects EnqueueAcquireGLObjects} */
	@JavadocExclude
	public static native int nclEnqueueAcquireGLObjects(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Acquire OpenCL memory objects that have been created from OpenGL objects. These objects need to be acquired before they can be used by any OpenCL
	 * commands queued to a command-queue. The OpenGL objects are acquired by the OpenCL context associated with command_queue and can therefore be used by all
	 * command-queues associated with the OpenCL context.
	 * <p/>
	 * Prior to calling {@code clEnqueueAcquireGLObjects}, the application must ensure that any pending GL operations which access the objects specified in
	 * {@code mem_objects} have completed. This may be accomplished portably by issuing and waiting for completion of a {@link GL11#glFinish Finish} command on all GL
	 * contexts with pending references to these objects. Implementations may offer more efficient synchronization methods; for example on some platforms
	 * calling {@link GL11#glFlush Flush} may be sufficient, or synchronization may be implicit within a thread, or there may be vendor-specific extensions that
	 * enable placing a fence in the GL command stream and waiting for completion of that fence in the CL command queue. Note that no synchronization methods
	 * other than {@link GL11#glFinish Finish} are portable between OpenGL implementations at this time.
	 *
	 * @param command_queue           a valid command-queue. All devices used to create the OpenCL context associated with {@code command_queue} must support acquiring shared CL/GL
	 *                                objects. This constraint is enforced at context creation time.
	 * @param num_objects             the number of memory objects to be acquired in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of CL memory objects that correspond to GL objects
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. If {@code num_objects} is 0 and {@code mem_objects} is {@code NULL} the function does nothing and returns
	 *         {@link CL10#CL_SUCCESS SUCCESS}. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_objects} is zero and {@code mem_objects} is not a {@code NULL} value or if {@code num_objects} &gt; 0 and
	 *         {@code mem_objects} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if memory objects in {@code mem_objects} are not valid OpenCL memory objects.</li>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} was not created from an OpenGL context.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if memory objects in {@code mem_objects} have not been created from a GL object(s).</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueAcquireGLObjects(CLCommandQueue command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueAcquireGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(mem_objects, num_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueAcquireGLObjects(command_queue.getPointer(), num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueAcquireGLObjects EnqueueAcquireGLObjects} */
	public static int clEnqueueAcquireGLObjects(CLCommandQueue command_queue, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueAcquireGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueAcquireGLObjects(command_queue.getPointer(), mem_objects.remaining(), memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Single value version of: {@link #clEnqueueAcquireGLObjects EnqueueAcquireGLObjects} */
	public static int clEnqueueAcquireGLObjects(CLCommandQueue command_queue, CLMem mem_object, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueAcquireGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int mem_objects = __buffer.pointerParam(mem_object);
		return nclEnqueueAcquireGLObjects(command_queue.getPointer(), 1, __buffer.address() + mem_objects, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	// --- [ clEnqueueReleaseGLObjects ] ---

	/** JNI method for {@link #clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} */
	@JavadocExclude
	public static native int nclEnqueueReleaseGLObjects(long command_queue, int num_objects, long mem_objects, int num_events_in_wait_list, long event_wait_list, long event, long __functionAddress);

	/**
	 * Releases OpenCL memory objects that have been created from OpenGL objects. These objects need to be released before they can be used by OpenGL. The
	 * OpenGL objects are released by the OpenCL context associated with {@code command_queue}.
	 * <p/>
	 * After calling {@code clEnqueueReleaseGLObjects}, the application is responsible for ensuring that any pending OpenCL operations which access the objects
	 * specified in {@code mem_objects} have completed prior to executing subsequent GL commands which reference these objects. This may be accomplished
	 * portably by calling {@link CL10#clWaitForEvents WaitForEvents} with the event object returned by {@code clEnqueueReleaseGLObjects}, or by calling {@link CL10#clFinish Finish}.
	 * Some implementations may offer more efficient methods.
	 *
	 * @param command_queue           a valid command-queue
	 * @param num_objects             the number of memory objects to be released in {@code mem_objects}
	 * @param mem_objects             a pointer to a list of CL memory objects that correpond to GL objects
	 * @param num_events_in_wait_list the number of events in {@code event_wait_list}
	 * @param event_wait_list         a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
	 *                                does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
	 *                                {@code event_wait_list} and {@code command_queue} must be the same.
	 * @param event                   Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
	 *                                {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
	 *                                complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
	 *                                {@code event_wait_list} array.
	 *
	 * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. If {@code num_objects} is 0 and {@code mem_objects} is {@code NULL} the function does nothing and returns
	 *         {@link CL10#CL_SUCCESS SUCCESS}. Otherwise, it returns one of the following errors:
	 *         <ul>
	 *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_objects} is zero and {@code mem_objects} is not a {@code NULL} value or if {@code num_objects} &gt; 0 and
	 *         {@code mem_objects} is {@code NULL}.</li>
	 *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if memory objects in {@code mem_objects} are not valid OpenCL memory objects.</li>
	 *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
	 *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} was not created from an OpenGL context.</li>
	 *         <li>{@link CL10GL#CL_INVALID_GL_OBJECT INVALID_GL_OBJECT} if memory objects in {@code mem_objects} have not been created from a GL object(s).</li>
	 *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
	 *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
	 *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
	 *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
	 *         </ul>
	 */
	public static int clEnqueueReleaseGLObjects(CLCommandQueue command_queue, int num_objects, ByteBuffer mem_objects, int num_events_in_wait_list, ByteBuffer event_wait_list, ByteBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueReleaseGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(mem_objects, num_objects << POINTER_SHIFT);
			if ( event_wait_list != null ) checkBuffer(event_wait_list, num_events_in_wait_list << POINTER_SHIFT);
			if ( event != null ) checkBuffer(event, 1 << POINTER_SHIFT);
		}
		return nclEnqueueReleaseGLObjects(command_queue.getPointer(), num_objects, memAddress(mem_objects), num_events_in_wait_list, memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Alternative version of: {@link #clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} */
	public static int clEnqueueReleaseGLObjects(CLCommandQueue command_queue, PointerBuffer mem_objects, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueReleaseGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		return nclEnqueueReleaseGLObjects(command_queue.getPointer(), mem_objects.remaining(), memAddress(mem_objects), event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

	/** Single value version of: {@link #clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} */
	public static int clEnqueueReleaseGLObjects(CLCommandQueue command_queue, CLMem mem_object, PointerBuffer event_wait_list, PointerBuffer event) {
		long __functionAddress = getInstance(command_queue).EnqueueReleaseGLObjects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( event != null ) checkBuffer(event, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int mem_objects = __buffer.pointerParam(mem_object);
		return nclEnqueueReleaseGLObjects(command_queue.getPointer(), 1, __buffer.address() + mem_objects, event_wait_list == null ? 0 : event_wait_list.remaining(), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
	}

}