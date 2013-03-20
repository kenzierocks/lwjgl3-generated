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
import static org.lwjgl.system.APIUtil.*;

/** Native bindings to the OpenGL 1.2 optional imaging subset. */
public final class ARBImaging {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ColorTable, CopyColorTable, ColorTableParameteriv, ColorTableParameterfv,
	 * GetColorTable, GetColorTableParameteriv, and GetColorTableParameterfv.
	 */
	public static final int
		GL_COLOR_TABLE                   = 0x80D0,
		GL_POST_CONVOLUTION_COLOR_TABLE  = 0x80D1,
		GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;

	/** Accepted by the {@code target} parameter of ColorTable, GetColorTableParameteriv, and GetColorTableParameterfv. */
	public static final int
		GL_PROXY_COLOR_TABLE                   = 0x80D3,
		GL_PROXY_POST_CONVOLUTION_COLOR_TABLE  = 0x80D4,
		GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;

	/**
	 * Accepted by the {@code pname} parameter of ColorTableParameteriv, ColorTableParameterfv, GetColorTableParameteriv, and
	 * GetColorTableParameterfv.
	 */
	public static final int
		GL_COLOR_TABLE_SCALE = 0x80D6,
		GL_COLOR_TABLE_BIAS  = 0x80D7;

	/** Accepted by the {@code pname} parameter of GetColorTableParameteriv and GetColorTableParameterfv. */
	public static final int
		GL_COLOR_TABLE_FORMAT         = 0x80D8,
		GL_COLOR_TABLE_WIDTH          = 0x80D9,
		GL_COLOR_TABLE_RED_SIZE       = 0x80DA,
		GL_COLOR_TABLE_GREEN_SIZE     = 0x80DB,
		GL_COLOR_TABLE_BLUE_SIZE      = 0x80DC,
		GL_COLOR_TABLE_ALPHA_SIZE     = 0x80DD,
		GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE,
		GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;

	/** ErrorCode */
	public static final int
		GL_TABLE_TOO_LARGE = 0x8031;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ConvolutionFilter1D, CopyConvolutionFilter1D, GetConvolutionFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int
		GL_CONVOLUTION_1D = 0x8010;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ConvolutionFilter2D, CopyConvolutionFilter2D, GetConvolutionFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int
		GL_CONVOLUTION_2D = 0x8011;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of SeparableFilter2D, SeparableFilter2D, GetSeparableFilter, ConvolutionParameteri,
	 * ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int
		GL_SEPARABLE_2D = 0x8012;

	/**
	 * Accepted by the {@code pname} parameter of ConvolutionParameteri, ConvolutionParameterf, ConvolutionParameteriv, ConvolutionParameterfv,
	 * GetConvolutionParameteriv, and GetConvolutionParameterfv.
	 */
	public static final int
		GL_CONVOLUTION_BORDER_MODE = 0x8013;

	/** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
	public static final int
		GL_CONVOLUTION_FILTER_SCALE = 0x8014,
		GL_CONVOLUTION_FILTER_BIAS  = 0x8015;

	/**
	 * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
	 * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
	 */
	public static final int
		GL_REDUCE = 0x8016;

	/** Accepted by the {@code pname} parameter of GetConvolutionParameteriv and GetConvolutionParameterfv. */
	public static final int
		GL_CONVOLUTION_FORMAT     = 0x8017,
		GL_CONVOLUTION_WIDTH      = 0x8018,
		GL_CONVOLUTION_HEIGHT     = 0x8019,
		GL_MAX_CONVOLUTION_WIDTH  = 0x801A,
		GL_MAX_CONVOLUTION_HEIGHT = 0x801B;

	/**
	 * Accepted by the {@code pname} parameter of PixelTransferi, PixelTransferf, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv,
	 * and GetDoublev.
	 */
	public static final int
		GL_POST_CONVOLUTION_RED_SCALE   = 0x801C,
		GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D,
		GL_POST_CONVOLUTION_BLUE_SCALE  = 0x801E,
		GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F,
		GL_POST_CONVOLUTION_RED_BIAS    = 0x8020,
		GL_POST_CONVOLUTION_GREEN_BIAS  = 0x8021,
		GL_POST_CONVOLUTION_BLUE_BIAS   = 0x8022,
		GL_POST_CONVOLUTION_ALPHA_BIAS  = 0x8023;

	/**
	 * Accepted by the {@code param} parameter of ConvolutionParameteri, and ConvolutionParameterf, and by the {@code params} parameter of
	 * ConvolutionParameteriv and ConvolutionParameterfv, when the {@code pname} parameter is CONVOLUTION_BORDER_MODE.
	 */
	public static final int
		GL_CONSTANT_BORDER  = 0x8151,
		GL_REPLICATE_BORDER = 0x8153;

	/** Accepted by the {@code pname} parameter of ConvolutionParameteriv, ConvolutionParameterfv, GetConvolutionParameteriv, and GetConvolutionParameterfv. */
	public static final int
		GL_CONVOLUTION_BORDER_COLOR = 0x8154;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_COLOR_MATRIX                 = 0x80B1,
		GL_COLOR_MATRIX_STACK_DEPTH     = 0x80B2,
		GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;

	/** Accepted by the {@code pname} parameter of PixelTransfer*, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_POST_COLOR_MATRIX_RED_SCALE   = 0x80B4,
		GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5,
		GL_POST_COLOR_MATRIX_BLUE_SCALE  = 0x80B6,
		GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7,
		GL_POST_COLOR_MATRIX_RED_BIAS    = 0x80B8,
		GL_POST_COLOR_MATRIX_GREEN_BIAS  = 0x80B9,
		GL_POST_COLOR_MATRIX_BLUE_BIAS   = 0x80BA,
		GL_POST_COLOR_MATRIX_ALPHA_BIAS  = 0x80BB;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of Histogram, ResetHistogram, GetHistogram, GetHistogramParameteriv, and
	 * GetHistogramParameterfv.
	 */
	public static final int
		GL_HISTOGRAM = 0x8024;

	/** Accepted by the {@code target} parameter of Histogram, GetHistogramParameteriv, and GetHistogramParameterfv. */
	public static final int
		GL_PROXY_HISTOGRAM = 0x8025;

	/** Accepted by the {@code pname} parameter of GetHistogramParameteriv and GetHistogramParameterfv. */
	public static final int
		GL_HISTOGRAM_WIDTH          = 0x8026,
		GL_HISTOGRAM_FORMAT         = 0x8027,
		GL_HISTOGRAM_RED_SIZE       = 0x8028,
		GL_HISTOGRAM_GREEN_SIZE     = 0x8029,
		GL_HISTOGRAM_BLUE_SIZE      = 0x802A,
		GL_HISTOGRAM_ALPHA_SIZE     = 0x802B,
		GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C,
		GL_HISTOGRAM_SINK           = 0x802D;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of Minmax, ResetMinmax, GetMinmax, GetMinmaxParameteriv, and GetMinmaxParameterfv.
	 */
	public static final int
		GL_MINMAX = 0x802E;

	/** Accepted by the {@code pname} parameter of GetMinmaxParameteriv and GetMinmaxParameterfv. */
	public static final int
		GL_MINMAX_FORMAT = 0x802F,
		GL_MINMAX_SINK   = 0x8030;

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

	private ARBImaging() {}

	// --- [ glColorTable ] ---

	/** JNI method for {@link #glColorTable(int, int, int, int, int, ByteBuffer)} */
	public static native void nglColorTable(int target, int internalformat, int width, int format, int type, long table, long __functionAddress);

	/**
	 * Specifies a color lookup table.
	 *
	 * @param target         the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}, {@link #GL_PROXY_COLOR_TABLE}, {@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param internalformat the color table internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param width          the color table width
	 * @param format         the color data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type           the color data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param table          the color table data
	 */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ByteBuffer table) {
		long __functionAddress = getInstance().glColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(table, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglColorTable(target, internalformat, width, format, type, memAddress(table), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glColorTable(int, int, int, int, int, ByteBuffer)} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, long tableOffset) {
		long __functionAddress = getInstance().glColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglColorTable(target, internalformat, width, format, type, tableOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glColorTable(int, int, int, int, int, ByteBuffer)} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, ShortBuffer table) {
		long __functionAddress = getInstance().glColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(table, (width * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglColorTable(target, internalformat, width, format, type, memAddress(table), __functionAddress);
	}

	/** IntBuffer version of: {@link #glColorTable(int, int, int, int, int, ByteBuffer)} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, IntBuffer table) {
		long __functionAddress = getInstance().glColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(table, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglColorTable(target, internalformat, width, format, type, memAddress(table), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glColorTable(int, int, int, int, int, ByteBuffer)} */
	public static void glColorTable(int target, int internalformat, int width, int format, int type, FloatBuffer table) {
		long __functionAddress = getInstance().glColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(table, (width * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglColorTable(target, internalformat, width, format, type, memAddress(table), __functionAddress);
	}

	// --- [ glCopyColorTable ] ---

	/** JNI method for {@link #glCopyColorTable(int, int, int, int, int)} */
	public static native void nglCopyColorTable(int target, int internalformat, int x, int y, int width, long __functionAddress);

	/**
	 * Defines a color table in exactly the manner of {@link #glColorTable(int, int, int, int, int, ByteBuffer)}, except that the image data are taken from the framebuffer rather than from client memory.
	 *
	 * @param target         the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param internalformat the color table internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the color table width
	 */
	public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = getInstance().glCopyColorTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyColorTable(target, internalformat, x, y, width, __functionAddress);
	}

	// --- [ glColorTableParameteriv ] ---

	/** JNI method for {@link #glColorTableParameteri(int, int, ByteBuffer)} */
	public static native void nglColorTableParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Specifies the scale and bias parameters for a color table.
	 *
	 * @param target the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_COLOR_TABLE_SCALE}, {@link #GL_COLOR_TABLE_BIAS}
	 * @param params the parameter value
	 */
	public static void glColorTableParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glColorTableParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglColorTableParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glColorTableParameteri(int, int, ByteBuffer)} */
	public static void glColorTableParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glColorTableParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglColorTableParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glColorTableParameterfv ] ---

	/** JNI method for {@link #glColorTableParameterf(int, int, ByteBuffer)} */
	public static native void nglColorTableParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Float version of {@link #glColorTableParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to set
	 * @param params the parameter value
	 */
	public static void glColorTableParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glColorTableParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglColorTableParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glColorTableParameterf(int, int, ByteBuffer)} */
	public static void glColorTableParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glColorTableParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglColorTableParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glGetColorTable ] ---

	/** JNI method for {@link #glGetColorTable(int, int, int, ByteBuffer)} */
	public static native void nglGetColorTable(int target, int format, int type, long table, long __functionAddress);

	/**
	 * Returns the current contents of a color table.
	 *
	 * @param target the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param format the color data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the color data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param table  the color table data
	 */
	public static void glGetColorTable(int target, int format, int type, ByteBuffer table) {
		long __functionAddress = getInstance().glGetColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(table, glGetColorTableParameteri(target, GL_COLOR_TABLE_WIDTH) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetColorTable(target, format, type, memAddress(table), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetColorTable(int, int, int, ByteBuffer)} */
	public static void glGetColorTable(int target, int format, int type, long tableOffset) {
		long __functionAddress = getInstance().glGetColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetColorTable(target, format, type, tableOffset, __functionAddress);
	}

	/** ShortBuffer version of: {@link #glGetColorTable(int, int, int, ByteBuffer)} */
	public static void glGetColorTable(int target, int format, int type, ShortBuffer table) {
		long __functionAddress = getInstance().glGetColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(table, (glGetColorTableParameteri(target, GL_COLOR_TABLE_WIDTH) * GLChecks.getPixelBytes(format, type)) >> 1);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetColorTable(target, format, type, memAddress(table), __functionAddress);
	}

	/** IntBuffer version of: {@link #glGetColorTable(int, int, int, ByteBuffer)} */
	public static void glGetColorTable(int target, int format, int type, IntBuffer table) {
		long __functionAddress = getInstance().glGetColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(table, (glGetColorTableParameteri(target, GL_COLOR_TABLE_WIDTH) * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetColorTable(target, format, type, memAddress(table), __functionAddress);
	}

	/** FloatBuffer version of: {@link #glGetColorTable(int, int, int, ByteBuffer)} */
	public static void glGetColorTable(int target, int format, int type, FloatBuffer table) {
		long __functionAddress = getInstance().glGetColorTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(table, (glGetColorTableParameteri(target, GL_COLOR_TABLE_WIDTH) * GLChecks.getPixelBytes(format, type)) >> 2);
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetColorTable(target, format, type, memAddress(table), __functionAddress);
	}

	// --- [ glGetColorTableParameteriv ] ---

	/** JNI method for {@link #glGetColorTableParameteri(int, int, ByteBuffer)} */
	public static native void nglGetColorTableParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Returns the integer value of the specified color table parameter.
	 *
	 * @param target the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}, {@link #GL_PROXY_COLOR_TABLE}, {@link #GL_PROXY_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param pname  the parameter to query. One of:<p/>{@link #GL_COLOR_TABLE_SCALE}, {@link #GL_COLOR_TABLE_BIAS}, {@link #GL_COLOR_TABLE_FORMAT}, {@link #GL_COLOR_TABLE_WIDTH}, {@link #GL_COLOR_TABLE_RED_SIZE}, {@link #GL_COLOR_TABLE_GREEN_SIZE}, {@link #GL_COLOR_TABLE_BLUE_SIZE}, {@link #GL_COLOR_TABLE_ALPHA_SIZE}, {@link #GL_COLOR_TABLE_LUMINANCE_SIZE}, {@link #GL_COLOR_TABLE_INTENSITY_SIZE}
	 * @param params an array in which to place the returned value
	 */
	public static void glGetColorTableParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetColorTableParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetColorTableParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetColorTableParameteri(int, int, ByteBuffer)} */
	public static void glGetColorTableParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetColorTableParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetColorTableParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetColorTableParameteri(int, int, ByteBuffer)} */
	public static int glGetColorTableParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetColorTableParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetColorTableParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetColorTableParameterfv ] ---

	/** JNI method for {@link #glGetColorTableParameterf(int, int, ByteBuffer)} */
	public static native void nglGetColorTableParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Float version of {@link #glGetColorTableParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the color table target
	 * @param pname  the parameter to query
	 * @param params an array in which to place the returned value
	 */
	public static void glGetColorTableParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetColorTableParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetColorTableParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetColorTableParameterf(int, int, ByteBuffer)} */
	public static void glGetColorTableParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetColorTableParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetColorTableParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetColorTableParameterf(int, int, ByteBuffer)} */
	public static float glGetColorTableParameterf(int target, int pname) {
		long __functionAddress = getInstance().glGetColorTableParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetColorTableParameterfv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glColorSubTable ] ---

	/** JNI method for {@link #glColorSubTable(int, int, int, int, int, ByteBuffer)} */
	public static native void nglColorSubTable(int target, int start, int count, int format, int type, long data, long __functionAddress);

	/**
	 * Respecifies a portion of an existing color table.
	 *
	 * @param target the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param start  the starting index of the subregion to respecify
	 * @param count  the number of colors in the subregion to respecify
	 * @param format the color data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the color data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param data   the color table data
	 */
	public static void glColorSubTable(int target, int start, int count, int format, int type, ByteBuffer data) {
		long __functionAddress = getInstance().glColorSubTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, count * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglColorSubTable(target, start, count, format, type, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glColorSubTable(int, int, int, int, int, ByteBuffer)} */
	public static void glColorSubTable(int target, int start, int count, int format, int type, long dataOffset) {
		long __functionAddress = getInstance().glColorSubTable;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglColorSubTable(target, start, count, format, type, dataOffset, __functionAddress);
	}

	// --- [ glCopyColorSubTable ] ---

	/** JNI method for {@link #glCopyColorSubTable(int, int, int, int, int)} */
	public static native void nglCopyColorSubTable(int target, int start, int x, int y, int width, long __functionAddress);

	/**
	 * Respecifies a portion of an existing color table using image taken from the framebuffer.
	 *
	 * @param target the color table target. One of:<p/>{@link #GL_COLOR_TABLE}, {@link #GL_POST_CONVOLUTION_COLOR_TABLE}, {@link #GL_POST_COLOR_MATRIX_COLOR_TABLE}
	 * @param start  the start index of the subregion to respecify
	 * @param x      the left framebuffer pixel coordinate
	 * @param y      the lower framebuffer pixel coordinate
	 * @param width  the number of colors in the subregion to respecify
	 */
	public static void glCopyColorSubTable(int target, int start, int x, int y, int width) {
		long __functionAddress = getInstance().glCopyColorSubTable;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyColorSubTable(target, start, x, y, width, __functionAddress);
	}

	// --- [ glConvolutionFilter1D ] ---

	/** JNI method for {@link #glConvolutionFilter1D(int, int, int, int, int, ByteBuffer)} */
	public static native void nglConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long data, long __functionAddress);

	/**
	 * Defines a one-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<p/>{@link #GL_CONVOLUTION_1D}
	 * @param internalformat the filter internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param format         the filter data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, ByteBuffer data) {
		long __functionAddress = getInstance().glConvolutionFilter1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglConvolutionFilter1D(target, internalformat, width, format, type, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glConvolutionFilter1D(int, int, int, int, int, ByteBuffer)} */
	public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, long dataOffset) {
		long __functionAddress = getInstance().glConvolutionFilter1D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglConvolutionFilter1D(target, internalformat, width, format, type, dataOffset, __functionAddress);
	}

	// --- [ glConvolutionFilter2D ] ---

	/** JNI method for {@link #glConvolutionFilter2D(int, int, int, int, int, int, ByteBuffer)} */
	public static native void nglConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long data, long __functionAddress);

	/**
	 * Defines a two-dimensional convolution filter.
	 *
	 * @param target         the convolution target. Must be:<p/>{@link #GL_CONVOLUTION_2D}
	 * @param internalformat the filter internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param data           the filter data
	 */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer data) {
		long __functionAddress = getInstance().glConvolutionFilter2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(data, width * height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, memAddress(data), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glConvolutionFilter2D(int, int, int, int, int, int, ByteBuffer)} */
	public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, long dataOffset) {
		long __functionAddress = getInstance().glConvolutionFilter2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglConvolutionFilter2D(target, internalformat, width, height, format, type, dataOffset, __functionAddress);
	}

	// --- [ glCopyConvolutionFilter1D ] ---

	/** JNI method for {@link #glCopyConvolutionFilter1D(int, int, int, int, int)} */
	public static native void nglCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width, long __functionAddress);

	/**
	 * Defines a one-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D(int, int, int, int, int, ByteBuffer)}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<p/>{@link #GL_CONVOLUTION_1D}
	 * @param internalformat the filter internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 */
	public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
		long __functionAddress = getInstance().glCopyConvolutionFilter1D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyConvolutionFilter1D(target, internalformat, x, y, width, __functionAddress);
	}

	// --- [ glCopyConvolutionFilter2D ] ---

	/** JNI method for {@link #glCopyConvolutionFilter2D(int, int, int, int, int, int)} */
	public static native void nglCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height, long __functionAddress);

	/**
	 * Defines a two-dimensional filter in exactly the manner of {@link #glConvolutionFilter1D(int, int, int, int, int, ByteBuffer)}, except that image data are taken from the framebuffer, rather than from
	 * client memory.
	 *
	 * @param target         the convolution target. Must be:<p/>{@link #GL_CONVOLUTION_2D}
	 * @param internalformat the filter internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param x              the left framebuffer pixel coordinate
	 * @param y              the lower framebuffer pixel coordinate
	 * @param width          the filter width
	 * @param height         the filter height
	 */
	public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
		long __functionAddress = getInstance().glCopyConvolutionFilter2D;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyConvolutionFilter2D(target, internalformat, x, y, width, height, __functionAddress);
	}

	// --- [ glGetConvolutionFilter ] ---

	/** JNI method for {@link #glGetConvolutionFilter(int, int, int, ByteBuffer)} */
	public static native void nglGetConvolutionFilter(int target, int format, int type, long image, long __functionAddress);

	/**
	 * Returns the contents of a convolution filter.
	 *
	 * @param target the convolution target. One of:<p/>{@link #GL_CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D}
	 * @param format the filter data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the filter data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param image  the filter data
	 */
	public static void glGetConvolutionFilter(int target, int format, int type, ByteBuffer image) {
		long __functionAddress = getInstance().glGetConvolutionFilter;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(image, glGetConvolutionParameteri(target, GL_CONVOLUTION_WIDTH) * (target == GL_CONVOLUTION_1D ? 1 : glGetConvolutionParameteri(target, GL_CONVOLUTION_HEIGHT)) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetConvolutionFilter(target, format, type, memAddress(image), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetConvolutionFilter(int, int, int, ByteBuffer)} */
	public static void glGetConvolutionFilter(int target, int format, int type, long imageOffset) {
		long __functionAddress = getInstance().glGetConvolutionFilter;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetConvolutionFilter(target, format, type, imageOffset, __functionAddress);
	}

	// --- [ glSeparableFilter2D ] ---

	/** JNI method for {@link #glSeparableFilter2D(int, int, int, int, int, int, ByteBuffer, ByteBuffer)} */
	public static native void nglSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long row, long column, long __functionAddress);

	/**
	 * Specifies a two-dimensional separable convolution filter.
	 *
	 * @param target         the filter target. Must be:<p/>{@link #GL_SEPARABLE_2D}
	 * @param internalformat the filter internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param width          the filter width
	 * @param height         the filter height
	 * @param format         the filter data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type           the filter data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param row            the horizontal filter data
	 * @param column         the vertical filter data
	 */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, ByteBuffer column) {
		long __functionAddress = getInstance().glSeparableFilter2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(row, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
			checkBuffer(column, height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, false);
		}
		nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), memAddress(column), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glSeparableFilter2D(int, int, int, int, int, int, ByteBuffer, ByteBuffer)} */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, long rowOffset, ByteBuffer column) {
		long __functionAddress = getInstance().glSeparableFilter2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(column, height * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglSeparableFilter2D(target, internalformat, width, height, format, type, rowOffset, memAddress(column), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glSeparableFilter2D(int, int, int, int, int, int, ByteBuffer, ByteBuffer)} */
	public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, ByteBuffer row, long columnOffset) {
		long __functionAddress = getInstance().glSeparableFilter2D;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(row, width * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88EF, true);
			GLChecks.ensureBufferObject(0x88EF, true);
		}
		nglSeparableFilter2D(target, internalformat, width, height, format, type, memAddress(row), columnOffset, __functionAddress);
	}

	// --- [ glGetSeparableFilter ] ---

	/** JNI method for {@link #glGetSeparableFilter(int, int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static native void nglGetSeparableFilter(int target, int format, int type, long row, long column, long span, long __functionAddress);

	/**
	 * Returns the current contents of a separable convolution filter.
	 *
	 * @param target the filter target. Must be:<p/>{@link #GL_SEPARABLE_2D}
	 * @param format the filter data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the filter data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param row    an array in which to return the filter row
	 * @param column an array in which to return the filter column
	 * @param span   unused
	 */
	public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
		long __functionAddress = getInstance().glGetSeparableFilter;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(row, glGetConvolutionParameteri(target, GL_CONVOLUTION_WIDTH) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(column, glGetConvolutionParameteri(target, GL_CONVOLUTION_HEIGHT) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetSeparableFilter(target, format, type, memAddress(row), memAddress(column), memAddressSafe(span), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetSeparableFilter(int, int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static void glGetSeparableFilter(int target, int format, int type, long rowOffset, ByteBuffer column, ByteBuffer span) {
		long __functionAddress = getInstance().glGetSeparableFilter;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(column, glGetConvolutionParameteri(target, GL_CONVOLUTION_HEIGHT) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetSeparableFilter(target, format, type, rowOffset, memAddress(column), memAddressSafe(span), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetSeparableFilter(int, int, int, ByteBuffer, ByteBuffer, ByteBuffer)} */
	public static void glGetSeparableFilter(int target, int format, int type, ByteBuffer row, long columnOffset, ByteBuffer span) {
		long __functionAddress = getInstance().glGetSeparableFilter;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(row, glGetConvolutionParameteri(target, GL_CONVOLUTION_WIDTH) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, true);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetSeparableFilter(target, format, type, memAddress(row), columnOffset, memAddressSafe(span), __functionAddress);
	}

	// --- [ glConvolutionParameteri ] ---

	/** JNI method for {@link #glConvolutionParameteri(int, int, int)} */
	public static native void nglConvolutionParameteri(int target, int pname, int param, long __functionAddress);

	/**
	 * Specifies the scale and bias of a convolution filter.
	 *
	 * @param target the filter target. One of:<p/>{@link #GL_CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D}, {@link #GL_SEPARABLE_2D}
	 * @param pname  the parameter to set. Must be:<p/>{@link #GL_CONVOLUTION_BORDER_MODE}
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameteri(int target, int pname, int param) {
		long __functionAddress = getInstance().glConvolutionParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameteri(target, pname, param, __functionAddress);
	}

	// --- [ glConvolutionParameteriv ] ---

	/** JNI method for {@link #glConvolutionParameteri(int, int, ByteBuffer)} */
	public static native void nglConvolutionParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Pointer version of {@link #glConvolutionParameteri(int, int, int)}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_CONVOLUTION_FILTER_SCALE}, {@link #GL_CONVOLUTION_FILTER_BIAS}, {@link #GL_CONVOLUTION_BORDER_COLOR}
	 * @param params the parameter value
	 */
	public static void glConvolutionParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglConvolutionParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glConvolutionParameteri(int, int, ByteBuffer)} */
	public static void glConvolutionParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglConvolutionParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glConvolutionParameterf ] ---

	/** JNI method for {@link #glConvolutionParameterf(int, int, float)} */
	public static native void nglConvolutionParameterf(int target, int pname, float param, long __functionAddress);

	/**
	 * Float version of {@link #glConvolutionParameteri(int, int, int)}
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set
	 * @param param  the parameter value
	 */
	public static void glConvolutionParameterf(int target, int pname, float param) {
		long __functionAddress = getInstance().glConvolutionParameterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglConvolutionParameterf(target, pname, param, __functionAddress);
	}

	// --- [ glConvolutionParameterfv ] ---

	/** JNI method for {@link #glConvolutionParameterf(int, int, ByteBuffer)} */
	public static native void nglConvolutionParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Pointer version of {@link #glConvolutionParameterf(int, int, float)}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to set. One of:<p/>{@link #GL_CONVOLUTION_FILTER_SCALE}, {@link #GL_CONVOLUTION_FILTER_BIAS}, {@link #GL_CONVOLUTION_BORDER_COLOR}
	 * @param params the parameter value
	 */
	public static void glConvolutionParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglConvolutionParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glConvolutionParameterf(int, int, ByteBuffer)} */
	public static void glConvolutionParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglConvolutionParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	// --- [ glGetConvolutionParameteriv ] ---

	/** JNI method for {@link #glGetConvolutionParameteri(int, int, ByteBuffer)} */
	public static native void nglGetConvolutionParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Returns the value of a convolution filter parameter.
	 *
	 * @param target the filter target. One of:<p/>{@link #GL_CONVOLUTION_1D}, {@link #GL_CONVOLUTION_2D}, {@link #GL_SEPARABLE_2D}
	 * @param pname  the parameter to query. One of:<p/>{@link #GL_CONVOLUTION_FORMAT}, {@link #GL_CONVOLUTION_WIDTH}, {@link #GL_CONVOLUTION_HEIGHT}, {@link #GL_MAX_CONVOLUTION_WIDTH}, {@link #GL_MAX_CONVOLUTION_HEIGHT}
	 * @param params an array in which to return the parameter value
	 */
	public static void glGetConvolutionParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetConvolutionParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetConvolutionParameteri(int, int, ByteBuffer)} */
	public static void glGetConvolutionParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetConvolutionParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetConvolutionParameteri(int, int, ByteBuffer)} */
	public static int glGetConvolutionParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetConvolutionParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetConvolutionParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetConvolutionParameterfv ] ---

	/** JNI method for {@link #glGetConvolutionParameterf(int, int, ByteBuffer)} */
	public static native void nglGetConvolutionParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Float version of {@link #glGetConvolutionParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the filter target
	 * @param pname  the parameter to query
	 * @param params an array in which to return the parameter value
	 */
	public static void glGetConvolutionParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4 << 2);
		}
		nglGetConvolutionParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetConvolutionParameterf(int, int, ByteBuffer)} */
	public static void glGetConvolutionParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		nglGetConvolutionParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetConvolutionParameterf(int, int, ByteBuffer)} */
	public static float glGetConvolutionParameterf(int target, int pname) {
		long __functionAddress = getInstance().glGetConvolutionParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetConvolutionParameterfv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glHistogram ] ---

	/** JNI method for {@link #glHistogram(int, int, int, boolean)} */
	public static native void nglHistogram(int target, int width, int internalformat, boolean sink, long __functionAddress);

	/**
	 * Specifies the histogram table.
	 *
	 * @param target         the histogram target. One of:<p/>{@link #GL_HISTOGRAM}, {@link #GL_PROXY_HISTOGRAM}
	 * @param width          the histogram width
	 * @param internalformat the histogram internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param sink           whether pixel groups will be consumed by the histogram operation ({@link GL11#GL_TRUE}) or passed on to the minmax operation ({@link GL11#GL_FALSE})
	 */
	public static void glHistogram(int target, int width, int internalformat, boolean sink) {
		long __functionAddress = getInstance().glHistogram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglHistogram(target, width, internalformat, sink, __functionAddress);
	}

	// --- [ glResetHistogram ] ---

	/** JNI method for {@link #glResetHistogram(int)} */
	public static native void nglResetHistogram(int target, long __functionAddress);

	/**
	 * Resets all counters of all elements of the histogram table to zero.
	 *
	 * @param target the histogram target. Must be:<p/>{@link #GL_HISTOGRAM}
	 */
	public static void glResetHistogram(int target) {
		long __functionAddress = getInstance().glResetHistogram;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglResetHistogram(target, __functionAddress);
	}

	// --- [ glGetHistogram ] ---

	/** JNI method for {@link #glGetHistogram(int, boolean, int, int, ByteBuffer)} */
	public static native void nglGetHistogram(int target, boolean reset, int format, int type, long values, long __functionAddress);

	/**
	 * Returns the current contents of the histogram table.
	 *
	 * @param target the histogram target. Must be:<p/>{@link #GL_HISTOGRAM}
	 * @param reset  if {@link GL11#GL_TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the pixel data types. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param values the pixel data
	 */
	public static void glGetHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
		long __functionAddress = getInstance().glGetHistogram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(values, glGetHistogramParameteri(GL_HISTOGRAM, GL_HISTOGRAM_WIDTH) * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetHistogram(target, reset, format, type, memAddress(values), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetHistogram(int, boolean, int, int, ByteBuffer)} */
	public static void glGetHistogram(int target, boolean reset, int format, int type, long valuesOffset) {
		long __functionAddress = getInstance().glGetHistogram;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetHistogram(target, reset, format, type, valuesOffset, __functionAddress);
	}

	// --- [ glGetHistogramParameteriv ] ---

	/** JNI method for {@link #glGetHistogramParameteri(int, int, ByteBuffer)} */
	public static native void nglGetHistogramParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Returns the integer values of the specified histogram parameter
	 *
	 * @param target the histogram target. Must be:<p/>{@link #GL_HISTOGRAM}
	 * @param pname  the parameter to query. One of:<p/>{@link #GL_HISTOGRAM_WIDTH}, {@link #GL_HISTOGRAM_FORMAT}, {@link #GL_HISTOGRAM_RED_SIZE}, {@link #GL_HISTOGRAM_GREEN_SIZE}, {@link #GL_HISTOGRAM_BLUE_SIZE}, {@link #GL_HISTOGRAM_ALPHA_SIZE}, {@link #GL_HISTOGRAM_LUMINANCE_SIZE}, {@link #GL_HISTOGRAM_SINK}
	 * @param params an array in which to return the parameter values
	 */
	public static void glGetHistogramParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetHistogramParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetHistogramParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetHistogramParameteri(int, int, ByteBuffer)} */
	public static void glGetHistogramParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetHistogramParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetHistogramParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetHistogramParameteri(int, int, ByteBuffer)} */
	public static int glGetHistogramParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetHistogramParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetHistogramParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetHistogramParameterfv ] ---

	/** JNI method for {@link #glGetHistogramParameterf(int, int, ByteBuffer)} */
	public static native void nglGetHistogramParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Float version of {@link #glGetHistogramParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the histogram target
	 * @param pname  the parameter to query
	 * @param params an array in which to place the returned value
	 */
	public static void glGetHistogramParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetHistogramParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetHistogramParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetHistogramParameterf(int, int, ByteBuffer)} */
	public static void glGetHistogramParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetHistogramParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetHistogramParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetHistogramParameterf(int, int, ByteBuffer)} */
	public static float glGetHistogramParameterf(int target, int pname) {
		long __functionAddress = getInstance().glGetHistogramParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetHistogramParameterfv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glMinmax ] ---

	/** JNI method for {@link #glMinmax(int, int, boolean)} */
	public static native void nglMinmax(int target, int internalformat, boolean sink, long __functionAddress);

	/**
	 * Specifies the minmax table.
	 *
	 * @param target         the minmax target. Must be:<p/>{@link #GL_MINMAX}
	 * @param internalformat the minmax table internal format. One of:<p/>{@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL30#GL_RG8}, {@link GL31#GL_RG8_SNORM}, {@link GL11#GL_R3_G3_B2}, {@link GL11#GL_RGB4}, {@link GL11#GL_RGB5}, {@link GL41#GL_RGB565}, {@link GL11#GL_RGB8}, {@link GL31#GL_RGB8_SNORM}, {@link GL11#GL_RGB10}, {@link GL11#GL_RGB12}, {@link GL11#GL_RGB16}, {@link GL31#GL_RGB16_SNORM}, {@link GL11#GL_RGBA2}, {@link GL11#GL_RGBA4}, {@link GL11#GL_RGB5_A1}, {@link GL11#GL_RGBA8}, {@link GL31#GL_RGBA8_SNORM}, {@link GL11#GL_RGB10_A2}, {@link GL11#GL_RGBA12}, {@link GL11#GL_RGBA16}, {@link GL31#GL_RGBA16_SNORM}, {@link GL21#GL_SRGB8}, {@link GL21#GL_SRGB8_ALPHA8}, {@link GL30#GL_RGB16F}, {@link GL30#GL_RGBA16F}, {@link GL30#GL_RGB32F}, {@link GL30#GL_RGBA32F}, {@link GL30#GL_R11F_G11F_B10F}, {@link GL11#GL_ALPHA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}, {@link GL11#GL_INTENSITY}, {@link GL11#GL_ALPHA4}, {@link GL11#GL_ALPHA8}, {@link GL11#GL_ALPHA12}, {@link GL11#GL_ALPHA16}, {@link GL11#GL_LUMINANCE4}, {@link GL11#GL_LUMINANCE8}, {@link GL11#GL_LUMINANCE12}, {@link GL11#GL_LUMINANCE16}, {@link GL11#GL_LUMINANCE4_ALPHA4}, {@link GL11#GL_LUMINANCE6_ALPHA2}, {@link GL11#GL_LUMINANCE8_ALPHA8}, {@link GL11#GL_LUMINANCE12_ALPHA4}, {@link GL11#GL_LUMINANCE12_ALPHA12}, {@link GL11#GL_LUMINANCE16_ALPHA16}, {@link GL11#GL_INTENSITY4}, {@link GL11#GL_INTENSITY8}, {@link GL11#GL_INTENSITY12}, {@link GL11#GL_INTENSITY16}, {@link GL21#GL_SLUMINANCE}, {@link GL21#GL_SLUMINANCE8_ALPHA8}
	 * @param sink           whether pixel groups will be consumed by the minmax operation ({@link GL11#GL_TRUE}) or passed on to final conversion ({@link GL11#GL_FALSE})
	 */
	public static void glMinmax(int target, int internalformat, boolean sink) {
		long __functionAddress = getInstance().glMinmax;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMinmax(target, internalformat, sink, __functionAddress);
	}

	// --- [ glResetMinmax ] ---

	/** JNI method for {@link #glResetMinmax(int)} */
	public static native void nglResetMinmax(int target, long __functionAddress);

	/**
	 * Resets all minimum and maximum values of {@code target} to to their maximum and minimum representable values, respectively.
	 *
	 * @param target the minmax target. Must be:<p/>{@link #GL_MINMAX}
	 */
	public static void glResetMinmax(int target) {
		long __functionAddress = getInstance().glResetMinmax;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglResetMinmax(target, __functionAddress);
	}

	// --- [ glGetMinmax ] ---

	/** JNI method for {@link #glGetMinmax(int, boolean, int, int, ByteBuffer)} */
	public static native void nglGetMinmax(int target, boolean reset, int format, int type, long values, long __functionAddress);

	/**
	 * Returns the current contents of the minmax table.
	 *
	 * @param target the minmax target. Must be:<p/>{@link #GL_MINMAX}
	 * @param reset  If {@link GL11#GL_TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<p/>{@link GL11#GL_RED}, {@link GL11#GL_GREEN}, {@link GL11#GL_BLUE}, {@link GL11#GL_ALPHA}, {@link GL11#GL_RGB}, {@link GL11#GL_RGBA}, {@link GL12#GL_BGR}, {@link GL12#GL_BGRA}, {@link GL11#GL_LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA}
	 * @param type   the pixel data type. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_SHORT}, {@link GL11#GL_UNSIGNED_INT}, {@link GL11#GL_INT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param values an array in which to place the minmax values
	 */
	public static void glGetMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
		long __functionAddress = getInstance().glGetMinmax;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 2 * GLChecks.getPixelBytes(format, type));
			GLChecks.ensureBufferObject(0x88ED, false);
		}
		nglGetMinmax(target, reset, format, type, memAddress(values), __functionAddress);
	}

	/** Buffer object offset version of: {@link #glGetMinmax(int, boolean, int, int, ByteBuffer)} */
	public static void glGetMinmax(int target, boolean reset, int format, int type, long valuesOffset) {
		long __functionAddress = getInstance().glGetMinmax;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(0x88ED, true);
		}
		nglGetMinmax(target, reset, format, type, valuesOffset, __functionAddress);
	}

	// --- [ glGetMinmaxParameteriv ] ---

	/** JNI method for {@link #glGetMinmaxParameteri(int, int, ByteBuffer)} */
	public static native void nglGetMinmaxParameteriv(int target, int pname, long params, long __functionAddress);

	/**
	 * Returns the integer value of the specified minmax parameter.
	 *
	 * @param target the minmax target. Must be:<p/>{@link #GL_MINMAX}
	 * @param pname  the parameter to query
	 * @param params an array in which to place the returned value
	 */
	public static void glGetMinmaxParameteri(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetMinmaxParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetMinmaxParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMinmaxParameteri(int, int, ByteBuffer)} */
	public static void glGetMinmaxParameter(int target, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetMinmaxParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetMinmaxParameteriv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMinmaxParameteri(int, int, ByteBuffer)} */
	public static int glGetMinmaxParameteri(int target, int pname) {
		long __functionAddress = getInstance().glGetMinmaxParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetMinmaxParameteriv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetMinmaxParameterfv ] ---

	/** JNI method for {@link #glGetMinmaxParameterf(int, int, ByteBuffer)} */
	public static native void nglGetMinmaxParameterfv(int target, int pname, long params, long __functionAddress);

	/**
	 * Float version of {@link #glGetMinmaxParameteri(int, int, ByteBuffer)}.
	 *
	 * @param target the minmax target. Must be:<p/>{@link #GL_MINMAX}
	 * @param pname  the parameter to query
	 * @param params an array in which to place the returned value
	 */
	public static void glGetMinmaxParameterf(int target, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetMinmaxParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetMinmaxParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetMinmaxParameterf(int, int, ByteBuffer)} */
	public static void glGetMinmaxParameter(int target, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetMinmaxParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetMinmaxParameterfv(target, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetMinmaxParameterf(int, int, ByteBuffer)} */
	public static float glGetMinmaxParameterf(int target, int pname) {
		long __functionAddress = getInstance().glGetMinmaxParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetMinmaxParameterfv(target, pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glBlendColor ] ---

	/** JNI method for {@link #glBlendColor(float, float, float, float)} */
	public static native void nglBlendColor(float red, float green, float blue, float alpha, long __functionAddress);

	/**
	 * Specifies the constant color C<sub>c</sub> to be used in blending.
	 *
	 * @param red   the red color component
	 * @param green the green color component
	 * @param blue  the blue color component
	 * @param alpha the alpha color component
	 */
	public static void glBlendColor(float red, float green, float blue, float alpha) {
		long __functionAddress = getInstance().glBlendColor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendColor(red, green, blue, alpha, __functionAddress);
	}

	// --- [ glBlendEquation ] ---

	/** JNI method for {@link #glBlendEquation(int)} */
	public static native void nglBlendEquation(int mode, long __functionAddress);

	/**
	 * Controls the blend equations used for per-fragment blending.
	 *
	 * @param mode the blend equation. One of:<p/>{@link #GL_FUNC_ADD}, {@link #GL_FUNC_SUBTRACT}, {@link #GL_FUNC_REVERSE_SUBTRACT}, {@link #GL_MIN}, {@link #GL_MAX}
	 */
	public static void glBlendEquation(int mode) {
		long __functionAddress = getInstance().glBlendEquation;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBlendEquation(mode, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__ARBImaging;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("GL_ARB_imaging") ) return null;

		Functions funcs = new Functions(provider, fc);

		boolean supported = 
			GL.isFunctionSupported(funcs.glColorTable, fc) &&
			GL.isFunctionSupported(funcs.glCopyColorTable, fc) &&
			GL.isFunctionSupported(funcs.glColorTableParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glColorTableParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glGetColorTable, fc) &&
			GL.isFunctionSupported(funcs.glGetColorTableParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glGetColorTableParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glColorSubTable, fc) &&
			GL.isFunctionSupported(funcs.glCopyColorSubTable, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionFilter1D, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionFilter2D, fc) &&
			GL.isFunctionSupported(funcs.glCopyConvolutionFilter1D, fc) &&
			GL.isFunctionSupported(funcs.glCopyConvolutionFilter2D, fc) &&
			GL.isFunctionSupported(funcs.glGetConvolutionFilter, fc) &&
			GL.isFunctionSupported(funcs.glSeparableFilter2D, fc) &&
			GL.isFunctionSupported(funcs.glGetSeparableFilter, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionParameteri, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionParameterf, fc) &&
			GL.isFunctionSupported(funcs.glConvolutionParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glGetConvolutionParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glGetConvolutionParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glHistogram, fc) &&
			GL.isFunctionSupported(funcs.glResetHistogram, fc) &&
			GL.isFunctionSupported(funcs.glGetHistogram, fc) &&
			GL.isFunctionSupported(funcs.glGetHistogramParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glGetHistogramParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glMinmax, fc) &&
			GL.isFunctionSupported(funcs.glResetMinmax, fc) &&
			GL.isFunctionSupported(funcs.glGetMinmax, fc) &&
			GL.isFunctionSupported(funcs.glGetMinmaxParameteriv, fc) &&
			GL.isFunctionSupported(funcs.glGetMinmaxParameterfv, fc) &&
			GL.isFunctionSupported(funcs.glBlendColor) &&
			GL.isFunctionSupported(funcs.glBlendEquation);

		return GL.checkExtension("GL_ARB_imaging", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code ARBImaging}. */
	public static final class Functions implements FunctionMap {

		public final long
			glColorTable,
			glCopyColorTable,
			glColorTableParameteriv,
			glColorTableParameterfv,
			glGetColorTable,
			glGetColorTableParameteriv,
			glGetColorTableParameterfv,
			glColorSubTable,
			glCopyColorSubTable,
			glConvolutionFilter1D,
			glConvolutionFilter2D,
			glCopyConvolutionFilter1D,
			glCopyConvolutionFilter2D,
			glGetConvolutionFilter,
			glSeparableFilter2D,
			glGetSeparableFilter,
			glConvolutionParameteri,
			glConvolutionParameteriv,
			glConvolutionParameterf,
			glConvolutionParameterfv,
			glGetConvolutionParameteriv,
			glGetConvolutionParameterfv,
			glHistogram,
			glResetHistogram,
			glGetHistogram,
			glGetHistogramParameteriv,
			glGetHistogramParameterfv,
			glMinmax,
			glResetMinmax,
			glGetMinmax,
			glGetMinmaxParameteriv,
			glGetMinmaxParameterfv,
			glBlendColor,
			glBlendEquation;

		public Functions(FunctionProvider provider, boolean fc) {
			glColorTable = GL.getFunctionAddress(provider, "glColorTable", fc);
			glCopyColorTable = GL.getFunctionAddress(provider, "glCopyColorTable", fc);
			glColorTableParameteriv = GL.getFunctionAddress(provider, "glColorTableParameteriv", fc);
			glColorTableParameterfv = GL.getFunctionAddress(provider, "glColorTableParameterfv", fc);
			glGetColorTable = GL.getFunctionAddress(provider, "glGetColorTable", fc);
			glGetColorTableParameteriv = GL.getFunctionAddress(provider, "glGetColorTableParameteriv", fc);
			glGetColorTableParameterfv = GL.getFunctionAddress(provider, "glGetColorTableParameterfv", fc);
			glColorSubTable = GL.getFunctionAddress(provider, "glColorSubTable", fc);
			glCopyColorSubTable = GL.getFunctionAddress(provider, "glCopyColorSubTable", fc);
			glConvolutionFilter1D = GL.getFunctionAddress(provider, "glConvolutionFilter1D", fc);
			glConvolutionFilter2D = GL.getFunctionAddress(provider, "glConvolutionFilter2D", fc);
			glCopyConvolutionFilter1D = GL.getFunctionAddress(provider, "glCopyConvolutionFilter1D", fc);
			glCopyConvolutionFilter2D = GL.getFunctionAddress(provider, "glCopyConvolutionFilter2D", fc);
			glGetConvolutionFilter = GL.getFunctionAddress(provider, "glGetConvolutionFilter", fc);
			glSeparableFilter2D = GL.getFunctionAddress(provider, "glSeparableFilter2D", fc);
			glGetSeparableFilter = GL.getFunctionAddress(provider, "glGetSeparableFilter", fc);
			glConvolutionParameteri = GL.getFunctionAddress(provider, "glConvolutionParameteri", fc);
			glConvolutionParameteriv = GL.getFunctionAddress(provider, "glConvolutionParameteriv", fc);
			glConvolutionParameterf = GL.getFunctionAddress(provider, "glConvolutionParameterf", fc);
			glConvolutionParameterfv = GL.getFunctionAddress(provider, "glConvolutionParameterfv", fc);
			glGetConvolutionParameteriv = GL.getFunctionAddress(provider, "glGetConvolutionParameteriv", fc);
			glGetConvolutionParameterfv = GL.getFunctionAddress(provider, "glGetConvolutionParameterfv", fc);
			glHistogram = GL.getFunctionAddress(provider, "glHistogram", fc);
			glResetHistogram = GL.getFunctionAddress(provider, "glResetHistogram", fc);
			glGetHistogram = GL.getFunctionAddress(provider, "glGetHistogram", fc);
			glGetHistogramParameteriv = GL.getFunctionAddress(provider, "glGetHistogramParameteriv", fc);
			glGetHistogramParameterfv = GL.getFunctionAddress(provider, "glGetHistogramParameterfv", fc);
			glMinmax = GL.getFunctionAddress(provider, "glMinmax", fc);
			glResetMinmax = GL.getFunctionAddress(provider, "glResetMinmax", fc);
			glGetMinmax = GL.getFunctionAddress(provider, "glGetMinmax", fc);
			glGetMinmaxParameteriv = GL.getFunctionAddress(provider, "glGetMinmaxParameteriv", fc);
			glGetMinmaxParameterfv = GL.getFunctionAddress(provider, "glGetMinmaxParameterfv", fc);
			glBlendColor = provider.getFunctionAddress("glBlendColor");
			glBlendEquation = provider.getFunctionAddress("glBlendEquation");
		}

	}

}