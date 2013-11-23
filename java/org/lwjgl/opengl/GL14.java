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

/** The core OpenGL 1.4 functionality. */
public final class GL14 {

	/** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
	public static final int
		GL_GENERATE_MIPMAP = 0x8191;

	/** Accepted by the {@code target} parameter of Hint, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_GENERATE_MIPMAP_HINT = 0x8192;

	/** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
	public static final int
		GL_CONSTANT_COLOR           = 0x8001,
		GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
		GL_CONSTANT_ALPHA           = 0x8003,
		GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_COLOR = 0x8005;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_ADD = 0x8006,
		GL_MIN      = 0x8007,
		GL_MAX      = 0x8008;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_EQUATION = 0x8009;

	/** Accepted by the {@code mode} parameter of BlendEquation. */
	public static final int
		GL_FUNC_SUBTRACT         = 0x800A,
		GL_FUNC_REVERSE_SUBTRACT = 0x800B;

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D. */
	public static final int
		GL_DEPTH_COMPONENT16 = 0x81A5,
		GL_DEPTH_COMPONENT24 = 0x81A6,
		GL_DEPTH_COMPONENT32 = 0x81A7;

	/** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
	public static final int
		GL_TEXTURE_DEPTH_SIZE = 0x884A;

	/** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_DEPTH_TEXTURE_MODE = 0x884B;

	/** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_COMPARE_MODE = 0x884C,
		GL_TEXTURE_COMPARE_FUNC = 0x884D;

	/**
	 * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, and TexParameteriv when the {@code pname} parameter is
	 * TEXTURE_COMPARE_MODE.
	 */
	public static final int
		GL_COMPARE_R_TO_TEXTURE = 0x884E;

	/** Accepted by the {@code pname} parameter of Fogi and Fogf. */
	public static final int
		GL_FOG_COORDINATE_SOURCE = 0x8450;

	/** Accepted by the {@code param} parameter of Fogi and Fogf. */
	public static final int
		GL_FOG_COORDINATE = 0x8451,
		GL_FRAGMENT_DEPTH = 0x8452;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_FOG_COORDINATE      = 0x8453,
		GL_FOG_COORDINATE_ARRAY_TYPE   = 0x8454,
		GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int
		GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;

	/** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
	public static final int
		GL_FOG_COORDINATE_ARRAY = 0x8457;

	/** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get. */
	public static final int
		GL_POINT_SIZE_MIN             = 0x8126,
		GL_POINT_SIZE_MAX             = 0x8127,
		GL_POINT_FADE_THRESHOLD_SIZE  = 0x8128,
		GL_POINT_DISTANCE_ATTENUATION = 0x8129;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_COLOR_SUM = 0x8458;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_SECONDARY_COLOR      = 0x8459,
		GL_SECONDARY_COLOR_ARRAY_SIZE   = 0x845A,
		GL_SECONDARY_COLOR_ARRAY_TYPE   = 0x845B,
		GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int
		GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;

	/** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
	public static final int
		GL_SECONDARY_COLOR_ARRAY = 0x845E;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_BLEND_DST_RGB   = 0x80C8,
		GL_BLEND_SRC_RGB   = 0x80C9,
		GL_BLEND_DST_ALPHA = 0x80CA,
		GL_BLEND_SRC_ALPHA = 0x80CB;

	/** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp. */
	public static final int
		GL_INCR_WRAP = 0x8507,
		GL_DECR_WRAP = 0x8508;

	/** Accepted by the {@code target} parameters of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, Texenviv, and TexEnvfv. */
	public static final int
		GL_TEXTURE_FILTER_CONTROL = 0x8500;

	/**
	 * When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of
	 * {@code pname} may be.
	 */
	public static final int
		GL_TEXTURE_LOD_BIAS = 0x8501;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

	/**
	 * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
	 * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
	 */
	public static final int
		GL_MIRRORED_REPEAT = 0x8370;

	/** Function address. */
	@JavadocExclude
	public final long
		BlendColor,
		BlendEquation,
		FogCoordf,
		FogCoordd,
		FogCoordfv,
		FogCoorddv,
		FogCoordPointer,
		MultiDrawArrays,
		MultiDrawElements,
		PointParameterf,
		PointParameteri,
		PointParameterfv,
		PointParameteriv,
		SecondaryColor3b,
		SecondaryColor3s,
		SecondaryColor3i,
		SecondaryColor3f,
		SecondaryColor3d,
		SecondaryColor3ub,
		SecondaryColor3us,
		SecondaryColor3ui,
		SecondaryColor3bv,
		SecondaryColor3sv,
		SecondaryColor3iv,
		SecondaryColor3fv,
		SecondaryColor3dv,
		SecondaryColor3ubv,
		SecondaryColor3usv,
		SecondaryColor3uiv,
		SecondaryColorPointer,
		BlendFuncSeparate,
		WindowPos2i,
		WindowPos2s,
		WindowPos2f,
		WindowPos2d,
		WindowPos2iv,
		WindowPos2sv,
		WindowPos2fv,
		WindowPos2dv,
		WindowPos3i,
		WindowPos3s,
		WindowPos3f,
		WindowPos3d,
		WindowPos3iv,
		WindowPos3sv,
		WindowPos3fv,
		WindowPos3dv;

	@JavadocExclude
	public GL14(FunctionProvider provider, boolean fc) {
		BlendColor = provider.getFunctionAddress("glBlendColor");
		BlendEquation = provider.getFunctionAddress("glBlendEquation");
		FogCoordf = GL.getFunctionAddress(provider, "glFogCoordf", fc);
		FogCoordd = GL.getFunctionAddress(provider, "glFogCoordd", fc);
		FogCoordfv = GL.getFunctionAddress(provider, "glFogCoordfv", fc);
		FogCoorddv = GL.getFunctionAddress(provider, "glFogCoorddv", fc);
		FogCoordPointer = GL.getFunctionAddress(provider, "glFogCoordPointer", fc);
		MultiDrawArrays = provider.getFunctionAddress("glMultiDrawArrays");
		MultiDrawElements = provider.getFunctionAddress("glMultiDrawElements");
		PointParameterf = provider.getFunctionAddress("glPointParameterf");
		PointParameteri = provider.getFunctionAddress("glPointParameteri");
		PointParameterfv = provider.getFunctionAddress("glPointParameterfv");
		PointParameteriv = provider.getFunctionAddress("glPointParameteriv");
		SecondaryColor3b = GL.getFunctionAddress(provider, "glSecondaryColor3b", fc);
		SecondaryColor3s = GL.getFunctionAddress(provider, "glSecondaryColor3s", fc);
		SecondaryColor3i = GL.getFunctionAddress(provider, "glSecondaryColor3i", fc);
		SecondaryColor3f = GL.getFunctionAddress(provider, "glSecondaryColor3f", fc);
		SecondaryColor3d = GL.getFunctionAddress(provider, "glSecondaryColor3d", fc);
		SecondaryColor3ub = GL.getFunctionAddress(provider, "glSecondaryColor3ub", fc);
		SecondaryColor3us = GL.getFunctionAddress(provider, "glSecondaryColor3us", fc);
		SecondaryColor3ui = GL.getFunctionAddress(provider, "glSecondaryColor3ui", fc);
		SecondaryColor3bv = GL.getFunctionAddress(provider, "glSecondaryColor3bv", fc);
		SecondaryColor3sv = GL.getFunctionAddress(provider, "glSecondaryColor3sv", fc);
		SecondaryColor3iv = GL.getFunctionAddress(provider, "glSecondaryColor3iv", fc);
		SecondaryColor3fv = GL.getFunctionAddress(provider, "glSecondaryColor3fv", fc);
		SecondaryColor3dv = GL.getFunctionAddress(provider, "glSecondaryColor3dv", fc);
		SecondaryColor3ubv = GL.getFunctionAddress(provider, "glSecondaryColor3ubv", fc);
		SecondaryColor3usv = GL.getFunctionAddress(provider, "glSecondaryColor3usv", fc);
		SecondaryColor3uiv = GL.getFunctionAddress(provider, "glSecondaryColor3uiv", fc);
		SecondaryColorPointer = GL.getFunctionAddress(provider, "glSecondaryColorPointer", fc);
		BlendFuncSeparate = provider.getFunctionAddress("glBlendFuncSeparate");
		WindowPos2i = GL.getFunctionAddress(provider, "glWindowPos2i", fc);
		WindowPos2s = GL.getFunctionAddress(provider, "glWindowPos2s", fc);
		WindowPos2f = GL.getFunctionAddress(provider, "glWindowPos2f", fc);
		WindowPos2d = GL.getFunctionAddress(provider, "glWindowPos2d", fc);
		WindowPos2iv = GL.getFunctionAddress(provider, "glWindowPos2iv", fc);
		WindowPos2sv = GL.getFunctionAddress(provider, "glWindowPos2sv", fc);
		WindowPos2fv = GL.getFunctionAddress(provider, "glWindowPos2fv", fc);
		WindowPos2dv = GL.getFunctionAddress(provider, "glWindowPos2dv", fc);
		WindowPos3i = GL.getFunctionAddress(provider, "glWindowPos3i", fc);
		WindowPos3s = GL.getFunctionAddress(provider, "glWindowPos3s", fc);
		WindowPos3f = GL.getFunctionAddress(provider, "glWindowPos3f", fc);
		WindowPos3d = GL.getFunctionAddress(provider, "glWindowPos3d", fc);
		WindowPos3iv = GL.getFunctionAddress(provider, "glWindowPos3iv", fc);
		WindowPos3sv = GL.getFunctionAddress(provider, "glWindowPos3sv", fc);
		WindowPos3fv = GL.getFunctionAddress(provider, "glWindowPos3fv", fc);
		WindowPos3dv = GL.getFunctionAddress(provider, "glWindowPos3dv", fc);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL14} instance for the current context. */
	public static GL14 getInstance() {
		return GL.getCapabilities().__GL14;
	}

	static GL14 create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL14") ) return null;

		GL14 funcs = new GL14(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.FogCoordf, funcs.FogCoordd, funcs.FogCoordfv, funcs.FogCoorddv, funcs.FogCoordPointer, funcs.SecondaryColor3b, funcs.SecondaryColor3s, 
			funcs.SecondaryColor3i, funcs.SecondaryColor3f, funcs.SecondaryColor3d, funcs.SecondaryColor3ub, funcs.SecondaryColor3us, funcs.SecondaryColor3ui, 
			funcs.SecondaryColor3bv, funcs.SecondaryColor3sv, funcs.SecondaryColor3iv, funcs.SecondaryColor3fv, funcs.SecondaryColor3dv, 
			funcs.SecondaryColor3ubv, funcs.SecondaryColor3usv, funcs.SecondaryColor3uiv, funcs.SecondaryColorPointer, funcs.WindowPos2i, funcs.WindowPos2s, 
			funcs.WindowPos2f, funcs.WindowPos2d, funcs.WindowPos2iv, funcs.WindowPos2sv, funcs.WindowPos2fv, funcs.WindowPos2dv, funcs.WindowPos3i, 
			funcs.WindowPos3s, funcs.WindowPos3f, funcs.WindowPos3d, funcs.WindowPos3iv, funcs.WindowPos3sv, funcs.WindowPos3fv, funcs.WindowPos3dv
		)) && checkFunctions(
			funcs.BlendColor, funcs.BlendEquation, funcs.MultiDrawArrays, funcs.MultiDrawElements, funcs.PointParameterf, funcs.PointParameteri, 
			funcs.PointParameterfv, funcs.PointParameteriv, funcs.BlendFuncSeparate
		);

		return GL.checkExtension("OpenGL14", funcs, supported);
	}

	// --- [ glBlendColor ] ---

	/** JNI method for {@link #glBlendColor BlendColor} */
	@JavadocExclude
	public static native void nglBlendColor(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendColor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the constant color C<sub>c</sub> to be used in blending.
	 *
	 * @param red   the red color component
	 * @param green the green color component
	 * @param blue  the blue color component
	 * @param alpha the alpha color component
	 */
	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().BlendColor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glBlendEquation ] ---

	/** JNI method for {@link #glBlendEquation BlendEquation} */
	@JavadocExclude
	public static native void nglBlendEquation(int mode, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendEquation.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Controls the blend equations used for per-fragment blending.
	 *
	 * @param mode the blend equation. One of:<p/>{@link #GL_FUNC_ADD FUNC_ADD}, {@link #GL_FUNC_SUBTRACT FUNC_SUBTRACT}, {@link #GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}, {@link #GL_MIN MIN}, {@link #GL_MAX MAX}
	 */
	public static void glBlendEquation(int mode) {
		long __functionAddress = getInstance().BlendEquation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendEquation(mode, __functionAddress);
	}

	// --- [ glFogCoordf ] ---

	/** JNI method for {@link #glFogCoordf FogCoordf} */
	@JavadocExclude
	public static native void nglFogCoordf(float coord, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glFogCoordf.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the current fog coordinate.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordf(float coord) {
		long __functionAddress = getInstance().FogCoordf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogCoordf(coord, __functionAddress);
	}

	// --- [ glFogCoordd ] ---

	/** JNI method for {@link #glFogCoordd FogCoordd} */
	@JavadocExclude
	public static native void nglFogCoordd(double coord, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glFogCoordd.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glFogCoordf FogCoordf}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordd(double coord) {
		long __functionAddress = getInstance().FogCoordd;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglFogCoordd(coord, __functionAddress);
	}

	// --- [ glFogCoordfv ] ---

	/** JNI method for {@link #glFogCoordf(ByteBuffer) glFogCoordf} */
	@JavadocExclude
	public static native void nglFogCoordfv(long coord, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glFogCoord.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glFogCoordf FogCoordf}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordf(ByteBuffer coord) {
		long __functionAddress = getInstance().FogCoordfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1 << 2);
		}
		nglFogCoordfv(memAddress(coord), __functionAddress);
	}

	/** Alternative version of: {@link #glFogCoordf(ByteBuffer) glFogCoordf} */
	public static void glFogCoord(FloatBuffer coord) {
		long __functionAddress = getInstance().FogCoordfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1);
		}
		nglFogCoordfv(memAddress(coord), __functionAddress);
	}

	// --- [ glFogCoorddv ] ---

	/** JNI method for {@link #glFogCoordd(ByteBuffer) glFogCoordd} */
	@JavadocExclude
	public static native void nglFogCoorddv(long coord, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glFogCoord.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glFogCoordd FogCoordd}.
	 *
	 * @param coord the fog coordinate value
	 */
	public static void glFogCoordd(ByteBuffer coord) {
		long __functionAddress = getInstance().FogCoorddv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1 << 3);
		}
		nglFogCoorddv(memAddress(coord), __functionAddress);
	}

	/** Alternative version of: {@link #glFogCoordd(ByteBuffer) glFogCoordd} */
	public static void glFogCoord(DoubleBuffer coord) {
		long __functionAddress = getInstance().FogCoorddv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coord, 1);
		}
		nglFogCoorddv(memAddress(coord), __functionAddress);
	}

	// --- [ glFogCoordPointer ] ---

	/** JNI method for {@link #glFogCoordPointer FogCoordPointer} */
	@JavadocExclude
	public static native void nglFogCoordPointer(int type, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glFogCoordPointer.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Specifies the location and organization of a fog coordinate array.
	 *
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the fog coordinate array data
	 */
	public static void glFogCoordPointer(int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().FogCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglFogCoordPointer(type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glFogCoordPointer FogCoordPointer} */
	public static void glFogCoordPointer(int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().FogCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		}
		nglFogCoordPointer(type, stride, pointerOffset, __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glFogCoordPointer FogCoordPointer} */
	public static void glFogCoordPointer(int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().FogCoordPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglFogCoordPointer(GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glMultiDrawArrays ] ---

	/** JNI method for {@link #glMultiDrawArrays MultiDrawArrays} */
	@JavadocExclude
	public static native void nglMultiDrawArrays(int mode, long first, long count, int primcount, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiDrawArrays.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple sets of primitives from array data.
	 *
	 * @param mode      the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param first     an array of starting indices in the enabled arrays
	 * @param count     an array of the number of indices to be rendered
	 * @param primcount the size of {@code first} and {@code count}
	 */
	public static void glMultiDrawArrays(int mode, ByteBuffer first, ByteBuffer count, int primcount) {
		long __functionAddress = getInstance().MultiDrawArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(first, primcount << 2);
			checkBuffer(count, primcount << 2);
		}
		nglMultiDrawArrays(mode, memAddress(first), memAddress(count), primcount, __functionAddress);
	}

	/** Alternative version of: {@link #glMultiDrawArrays MultiDrawArrays} */
	public static void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count) {
		long __functionAddress = getInstance().MultiDrawArrays;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, first.remaining());
		}
		nglMultiDrawArrays(mode, memAddress(first), memAddress(count), first.remaining(), __functionAddress);
	}

	// --- [ glMultiDrawElements ] ---

	/** JNI method for {@link #glMultiDrawElements MultiDrawElements} */
	@JavadocExclude
	public static native void nglMultiDrawElements(int mode, long count, int type, long indices, int primcount, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiDrawElements.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Renders multiple sets of primitives by specifying indices of array data elements.
	 * <p/>
	 * <b>LWJGL note</b>: Use {@link MemoryUtil#memAddress} to retrieve pointers to the index buffers.
	 *
	 * @param mode      the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count     an array of the elements counts
	 * @param type      the type of the values in indices. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices   a pointer to the location where the indices are stored
	 * @param primcount the size of the {@code count} array
	 */
	public static void glMultiDrawElements(int mode, ByteBuffer count, int type, ByteBuffer indices, int primcount) {
		long __functionAddress = getInstance().MultiDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(count, primcount << 2);
			checkBuffer(indices, primcount << POINTER_SHIFT);
		}
		nglMultiDrawElements(mode, memAddress(count), type, memAddress(indices), primcount, __functionAddress);
	}

	/** Alternative version of: {@link #glMultiDrawElements MultiDrawElements} */
	public static void glMultiDrawElements(int mode, IntBuffer count, int type, PointerBuffer indices) {
		long __functionAddress = getInstance().MultiDrawElements;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count.remaining());
		}
		nglMultiDrawElements(mode, memAddress(count), type, memAddress(indices), count.remaining(), __functionAddress);
	}

	// --- [ glPointParameterf ] ---

	/** JNI method for {@link #glPointParameterf PointParameterf} */
	@JavadocExclude
	public static native void nglPointParameterf(int pname, float param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPointParameterf.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Sets the float value of a pointer parameter.
	 *
	 * @param pname the parameter to set. One of:<p/>{@link #GL_POINT_SIZE_MIN POINT_SIZE_MIN}, {@link #GL_POINT_SIZE_MAX POINT_SIZE_MAX}, {@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}, {@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}
	 * @param param the parameter value
	 */
	public static void glPointParameterf(int pname, float param) {
		long __functionAddress = getInstance().PointParameterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPointParameterf(pname, param, __functionAddress);
	}

	// --- [ glPointParameteri ] ---

	/** JNI method for {@link #glPointParameteri PointParameteri} */
	@JavadocExclude
	public static native void nglPointParameteri(int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPointParameteri.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Integer version of {@link #glPointParameterf PointParameterf}.
	 *
	 * @param pname the parameter to set. One of:<p/>{@link #GL_POINT_SIZE_MIN POINT_SIZE_MIN}, {@link #GL_POINT_SIZE_MAX POINT_SIZE_MAX}, {@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}, {@link #GL_POINT_DISTANCE_ATTENUATION POINT_DISTANCE_ATTENUATION}
	 * @param param the parameter value
	 */
	public static void glPointParameteri(int pname, int param) {
		long __functionAddress = getInstance().PointParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPointParameteri(pname, param, __functionAddress);
	}

	// --- [ glPointParameterfv ] ---

	/** JNI method for {@link #glPointParameterf(int, ByteBuffer) glPointParameterf} */
	@JavadocExclude
	public static native void nglPointParameterfv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPointParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glPointParameterf PointParameterf}.
	 *
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glPointParameterf(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().PointParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglPointParameterfv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glPointParameterf(int, ByteBuffer) glPointParameterf} */
	public static void glPointParameter(int pname, FloatBuffer params) {
		long __functionAddress = getInstance().PointParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglPointParameterfv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glPointParameteriv ] ---

	/** JNI method for {@link #glPointParameteri(int, ByteBuffer) glPointParameteri} */
	@JavadocExclude
	public static native void nglPointParameteriv(int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPointParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glPointParameteri PointParameteri}.
	 *
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glPointParameteri(int pname, ByteBuffer params) {
		long __functionAddress = getInstance().PointParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglPointParameteriv(pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glPointParameteri(int, ByteBuffer) glPointParameteri} */
	public static void glPointParameter(int pname, IntBuffer params) {
		long __functionAddress = getInstance().PointParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglPointParameteriv(pname, memAddress(params), __functionAddress);
	}

	// --- [ glSecondaryColor3b ] ---

	/** JNI method for {@link #glSecondaryColor3b SecondaryColor3b} */
	@JavadocExclude
	public static native void nglSecondaryColor3b(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3b.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Sets the R, G, and B components of the current secondary color. The alpha component is set to 1.0.
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3b(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().SecondaryColor3b;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3b(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3s ] ---

	/** JNI method for {@link #glSecondaryColor3s SecondaryColor3s} */
	@JavadocExclude
	public static native void nglSecondaryColor3s(short red, short green, short blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3s(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3s(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3i ] ---

	/** JNI method for {@link #glSecondaryColor3i SecondaryColor3i} */
	@JavadocExclude
	public static native void nglSecondaryColor3i(int red, int green, int blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Integer version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3i(int red, int green, int blue) {
		long __functionAddress = getInstance().SecondaryColor3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3i(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3f ] ---

	/** JNI method for {@link #glSecondaryColor3f SecondaryColor3f} */
	@JavadocExclude
	public static native void nglSecondaryColor3f(float red, float green, float blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Float version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3f(float red, float green, float blue) {
		long __functionAddress = getInstance().SecondaryColor3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3f(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3d ] ---

	/** JNI method for {@link #glSecondaryColor3d SecondaryColor3d} */
	@JavadocExclude
	public static native void nglSecondaryColor3d(double red, double green, double blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3d(double red, double green, double blue) {
		long __functionAddress = getInstance().SecondaryColor3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3d(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3ub ] ---

	/** JNI method for {@link #glSecondaryColor3ub SecondaryColor3ub} */
	@JavadocExclude
	public static native void nglSecondaryColor3ub(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3ub.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Unsigned version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ub(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().SecondaryColor3ub;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3ub(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3us ] ---

	/** JNI method for {@link #glSecondaryColor3us SecondaryColor3us} */
	@JavadocExclude
	public static native void nglSecondaryColor3us(short red, short green, short blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3us.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Unsigned short version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3us(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3us;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3us(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3ui ] ---

	/** JNI method for {@link #glSecondaryColor3ui SecondaryColor3ui} */
	@JavadocExclude
	public static native void nglSecondaryColor3ui(int red, int green, int blue, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3ui.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Unsigned int version of {@link #glSecondaryColor3b SecondaryColor3b}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ui(int red, int green, int blue) {
		long __functionAddress = getInstance().SecondaryColor3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColor3ui(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3bv ] ---

	/** JNI method for {@link #glSecondaryColor3b(ByteBuffer) glSecondaryColor3b} */
	@JavadocExclude
	public static native void nglSecondaryColor3bv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3b.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Byte pointer version of {@link #glSecondaryColor3b SecondaryColor3b}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3b(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3bv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3bv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3sv ] ---

	/** JNI method for {@link #glSecondaryColor3s(ByteBuffer) glSecondaryColor3s} */
	@JavadocExclude
	public static native void nglSecondaryColor3sv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3s SecondaryColor3s}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3s(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglSecondaryColor3sv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3s(ByteBuffer) glSecondaryColor3s} */
	public static void glSecondaryColor3(ShortBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3sv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3iv ] ---

	/** JNI method for {@link #glSecondaryColor3i(ByteBuffer) glSecondaryColor3i} */
	@JavadocExclude
	public static native void nglSecondaryColor3iv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3i SecondaryColor3i}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3i(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglSecondaryColor3iv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3i(ByteBuffer) glSecondaryColor3i} */
	public static void glSecondaryColor3(IntBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3iv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3fv ] ---

	/** JNI method for {@link #glSecondaryColor3f(ByteBuffer) glSecondaryColor3f} */
	@JavadocExclude
	public static native void nglSecondaryColor3fv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3f(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglSecondaryColor3fv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3f(ByteBuffer) glSecondaryColor3f} */
	public static void glSecondaryColor3(FloatBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3fv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3dv ] ---

	/** JNI method for {@link #glSecondaryColor3d(ByteBuffer) glSecondaryColor3d} */
	@JavadocExclude
	public static native void nglSecondaryColor3dv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3d SecondaryColor3d}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3d(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 3);
		}
		nglSecondaryColor3dv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3d(ByteBuffer) glSecondaryColor3d} */
	public static void glSecondaryColor3(DoubleBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3dv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3ubv ] ---

	/** JNI method for {@link #glSecondaryColor3ub(ByteBuffer) glSecondaryColor3ub} */
	@JavadocExclude
	public static native void nglSecondaryColor3ubv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3ub.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3ub SecondaryColor3ub}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ub(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3ubv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3ubv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3usv ] ---

	/** JNI method for {@link #glSecondaryColor3us(ByteBuffer) glSecondaryColor3us} */
	@JavadocExclude
	public static native void nglSecondaryColor3usv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3us SecondaryColor3us}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3us(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 1);
		}
		nglSecondaryColor3usv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3us(ByteBuffer) glSecondaryColor3us} */
	public static void glSecondaryColor3u(ShortBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3usv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3usv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColor3uiv ] ---

	/** JNI method for {@link #glSecondaryColor3ui(ByteBuffer) glSecondaryColor3ui} */
	@JavadocExclude
	public static native void nglSecondaryColor3uiv(long v, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColor3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColor3ui SecondaryColor3ui}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ui(ByteBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3 << 2);
		}
		nglSecondaryColor3uiv(memAddress(v), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColor3ui(ByteBuffer) glSecondaryColor3ui} */
	public static void glSecondaryColor3u(IntBuffer v) {
		long __functionAddress = getInstance().SecondaryColor3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		nglSecondaryColor3uiv(memAddress(v), __functionAddress);
	}

	// --- [ glSecondaryColorPointer ] ---

	/** JNI method for {@link #glSecondaryColorPointer SecondaryColorPointer} */
	@JavadocExclude
	public static native void nglSecondaryColorPointer(int size, int type, int stride, long pointer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glSecondaryColorPointer.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<p/>3, {@link GL12#GL_BGRA BGRA}
	 * @param type    the data type of the values stored in the array. One of:<p/>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().SecondaryColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglSecondaryColorPointer(size, type, stride, memAddress(pointer), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glSecondaryColorPointer SecondaryColorPointer} */
	public static void glSecondaryColorPointer(int size, int type, int stride, long pointerOffset) {
		long __functionAddress = getInstance().SecondaryColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		}
		nglSecondaryColorPointer(size, type, stride, pointerOffset, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glSecondaryColorPointer SecondaryColorPointer} */
	public static void glSecondaryColorPointer(int size, boolean unsigned, int stride, ByteBuffer pointer) {
		long __functionAddress = getInstance().SecondaryColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglSecondaryColorPointer(size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, stride, memAddress(pointer), __functionAddress);
	}

	/** GL_FLOAT version of: {@link #glSecondaryColorPointer SecondaryColorPointer} */
	public static void glSecondaryColorPointer(int size, int stride, FloatBuffer pointer) {
		long __functionAddress = getInstance().SecondaryColorPointer;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		nglSecondaryColorPointer(size, GL11.GL_FLOAT, stride, memAddress(pointer), __functionAddress);
	}

	// --- [ glBlendFuncSeparate ] ---

	/** JNI method for {@link #glBlendFuncSeparate BlendFuncSeparate} */
	@JavadocExclude
	public static native void nglBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBlendFuncSeparate.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies pixel arithmetic for RGB and alpha components separately.
	 *
	 * @param sfactorRGB   how the red, green, and blue blending factors are computed. The initial value is GL_ONE.
	 * @param dfactorRGB   how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO.
	 * @param sfactorAlpha how the alpha source blending factor is computed. The initial value is GL_ONE.
	 * @param dfactorAlpha how the alpha destination blending factor is computed. The initial value is GL_ZERO.
	 */
	public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
		long __functionAddress = getInstance().BlendFuncSeparate;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha, __functionAddress);
	}

	// --- [ glWindowPos2i ] ---

	/** JNI method for {@link #glWindowPos2i WindowPos2i} */
	@JavadocExclude
	public static native void nglWindowPos2i(int x, int y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Alternate way to set the current raster position. {@code z} is implictly set to 0.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2i(int x, int y) {
		long __functionAddress = getInstance().WindowPos2i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos2i(x, y, __functionAddress);
	}

	// --- [ glWindowPos2s ] ---

	/** JNI method for {@link #glWindowPos2s WindowPos2s} */
	@JavadocExclude
	public static native void nglWindowPos2s(short x, short y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2s(short x, short y) {
		long __functionAddress = getInstance().WindowPos2s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos2s(x, y, __functionAddress);
	}

	// --- [ glWindowPos2f ] ---

	/** JNI method for {@link #glWindowPos2f WindowPos2f} */
	@JavadocExclude
	public static native void nglWindowPos2f(float x, float y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Float version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2f(float x, float y) {
		long __functionAddress = getInstance().WindowPos2f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos2f(x, y, __functionAddress);
	}

	// --- [ glWindowPos2d ] ---

	/** JNI method for {@link #glWindowPos2d WindowPos2d} */
	@JavadocExclude
	public static native void nglWindowPos2d(double x, double y, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 */
	public static void glWindowPos2d(double x, double y) {
		long __functionAddress = getInstance().WindowPos2d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos2d(x, y, __functionAddress);
	}

	// --- [ glWindowPos2iv ] ---

	/** JNI method for {@link #glWindowPos2i(ByteBuffer) glWindowPos2i} */
	@JavadocExclude
	public static native void nglWindowPos2iv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos2i WindowPos2i}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2i(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2 << 2);
		}
		nglWindowPos2iv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos2i(ByteBuffer) glWindowPos2i} */
	public static void glWindowPos2(IntBuffer p) {
		long __functionAddress = getInstance().WindowPos2iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		nglWindowPos2iv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos2sv ] ---

	/** JNI method for {@link #glWindowPos2s(ByteBuffer) glWindowPos2s} */
	@JavadocExclude
	public static native void nglWindowPos2sv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos2s WindowPos2s}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2s(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2 << 1);
		}
		nglWindowPos2sv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos2s(ByteBuffer) glWindowPos2s} */
	public static void glWindowPos2(ShortBuffer p) {
		long __functionAddress = getInstance().WindowPos2sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		nglWindowPos2sv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos2fv ] ---

	/** JNI method for {@link #glWindowPos2f(ByteBuffer) glWindowPos2f} */
	@JavadocExclude
	public static native void nglWindowPos2fv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos2f WindowPos2f}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2f(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2 << 2);
		}
		nglWindowPos2fv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos2f(ByteBuffer) glWindowPos2f} */
	public static void glWindowPos2(FloatBuffer p) {
		long __functionAddress = getInstance().WindowPos2fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		nglWindowPos2fv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos2dv ] ---

	/** JNI method for {@link #glWindowPos2d(ByteBuffer) glWindowPos2d} */
	@JavadocExclude
	public static native void nglWindowPos2dv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos2.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos2d WindowPos2d}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos2d(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2 << 3);
		}
		nglWindowPos2dv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos2d(ByteBuffer) glWindowPos2d} */
	public static void glWindowPos2(DoubleBuffer p) {
		long __functionAddress = getInstance().WindowPos2dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 2);
		}
		nglWindowPos2dv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos3i ] ---

	/** JNI method for {@link #glWindowPos3i WindowPos3i} */
	@JavadocExclude
	public static native void nglWindowPos3i(int x, int y, int z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3i.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Alternate way to set the current raster position.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3i(int x, int y, int z) {
		long __functionAddress = getInstance().WindowPos3i;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos3i(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3s ] ---

	/** JNI method for {@link #glWindowPos3s WindowPos3s} */
	@JavadocExclude
	public static native void nglWindowPos3s(short x, short y, short z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3s.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Short version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3s(short x, short y, short z) {
		long __functionAddress = getInstance().WindowPos3s;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos3s(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3f ] ---

	/** JNI method for {@link #glWindowPos3f WindowPos3f} */
	@JavadocExclude
	public static native void nglWindowPos3f(float x, float y, float z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3f.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Float version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3f(float x, float y, float z) {
		long __functionAddress = getInstance().WindowPos3f;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos3f(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3d ] ---

	/** JNI method for {@link #glWindowPos3d WindowPos3d} */
	@JavadocExclude
	public static native void nglWindowPos3d(double x, double y, double z, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3d.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Double version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param x the x value
	 * @param y the y value
	 * @param z the z value
	 */
	public static void glWindowPos3d(double x, double y, double z) {
		long __functionAddress = getInstance().WindowPos3d;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglWindowPos3d(x, y, z, __functionAddress);
	}

	// --- [ glWindowPos3iv ] ---

	/** JNI method for {@link #glWindowPos3i(ByteBuffer) glWindowPos3i} */
	@JavadocExclude
	public static native void nglWindowPos3iv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos3i WindowPos3i}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3i(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3 << 2);
		}
		nglWindowPos3iv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos3i(ByteBuffer) glWindowPos3i} */
	public static void glWindowPos3(IntBuffer p) {
		long __functionAddress = getInstance().WindowPos3iv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		nglWindowPos3iv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos3sv ] ---

	/** JNI method for {@link #glWindowPos3s(ByteBuffer) glWindowPos3s} */
	@JavadocExclude
	public static native void nglWindowPos3sv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos3s WindowPos3s}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3s(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3 << 1);
		}
		nglWindowPos3sv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos3s(ByteBuffer) glWindowPos3s} */
	public static void glWindowPos3(ShortBuffer p) {
		long __functionAddress = getInstance().WindowPos3sv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		nglWindowPos3sv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos3fv ] ---

	/** JNI method for {@link #glWindowPos3f(ByteBuffer) glWindowPos3f} */
	@JavadocExclude
	public static native void nglWindowPos3fv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos3f WindowPos3f}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3f(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3 << 2);
		}
		nglWindowPos3fv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos3f(ByteBuffer) glWindowPos3f} */
	public static void glWindowPos3(FloatBuffer p) {
		long __functionAddress = getInstance().WindowPos3fv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		nglWindowPos3fv(memAddress(p), __functionAddress);
	}

	// --- [ glWindowPos3dv ] ---

	/** JNI method for {@link #glWindowPos3d(ByteBuffer) glWindowPos3d} */
	@JavadocExclude
	public static native void nglWindowPos3dv(long p, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glWindowPos3.xml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em>
	 * <p/>
	 * Pointer version of {@link #glWindowPos3d WindowPos3d}.
	 *
	 * @param p the position value
	 */
	public static void glWindowPos3d(ByteBuffer p) {
		long __functionAddress = getInstance().WindowPos3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3 << 3);
		}
		nglWindowPos3dv(memAddress(p), __functionAddress);
	}

	/** Alternative version of: {@link #glWindowPos3d(ByteBuffer) glWindowPos3d} */
	public static void glWindowPos3(DoubleBuffer p) {
		long __functionAddress = getInstance().WindowPos3dv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(p, 3);
		}
		nglWindowPos3dv(memAddress(p), __functionAddress);
	}

}