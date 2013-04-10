/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to <X11/extensions/Xrandr.h>. */
public final class Xrandr {

	/** Event selection bits */
	public static final int
		RRScreenChangeNotifyMask   = 1 << 0,
		RRCrtcChangeNotifyMask     = 1 << 1,
		RROutputChangeNotifyMask   = 1 << 2,
		RROutputPropertyNotifyMask = 1 << 3;

	/** Event codes */
	public static final int
		RRScreenChangeNotify = 0x0,
		RRNotify             = 0x1;

	/** RRNotify Subcodes */
	public static final int
		RRNotify_CrtcChange     = 0x0,
		RRNotify_OutputChange   = 0x1,
		RRNotify_OutputProperty = 0x2;

	/** used in the rotation field; rotation and reflection in 0.1 proto. */
	public static final short
		RR_Rotate_0   = 0x1,
		RR_Rotate_90  = 0x2,
		RR_Rotate_180 = 0x4,
		RR_Rotate_270 = 0x8;

	/** new in 1.0 protocol, to allow reflection of screen */
	public static final short
		RR_Reflect_X = 0x10,
		RR_Reflect_Y = 0x20;

	/** Config status */
	public static final int
		RRSetConfigSuccess           = 0x0,
		RRSetConfigInvalidConfigTime = 0x1,
		RRSetConfigInvalidTime       = 0x2,
		RRSetConfigFailed            = 0x3;

	/** Connection status */
	public static final int
		RR_Connected         = 0x0,
		RR_Disconnected      = 0x1,
		RR_UnknownConnection = 0x2;

	/** Error codes */
	public static final int
		BadRROutput = 0x0,
		BadRRCrtc   = 0x1,
		BadRRMode   = 0x2;

	/** new in 1.2 protocol */
	public static final int
		RR_HSyncPositive  = 0x1,
		RR_HSyncNegative  = 0x2,
		RR_VSyncPositive  = 0x4,
		RR_VSyncNegative  = 0x8,
		RR_Interlace      = 0x10,
		RR_DoubleScan     = 0x20,
		RR_CSync          = 0x40,
		RR_CSyncPositive  = 0x80,
		RR_CSyncNegative  = 0x100,
		RR_HSkewPresent   = 0x200,
		RR_BCast          = 0x400,
		RR_PixelMultiplex = 0x800,
		RR_DoubleClock    = 0x1000,
		RR_ClockDivideBy2 = 0x2000;

	private Xrandr() {}

	// --- [ XRRQueryExtension ] ---

	/** JNI method for {@link #XRRQueryExtension} */
	public static native int nXRRQueryExtension(long display, long event_base_return, long error_base_return);

	/**
	 * Returns the event and error base codes.
	 *
	 * @param display           the connection to the X server
	 * @param event_base_return the base event code
	 * @param error_base_return the base error code
	 */
	public static int XRRQueryExtension(long display, ByteBuffer event_base_return, ByteBuffer error_base_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_base_return, 1 << 2);
			checkBuffer(error_base_return, 1 << 2);
		}
		return nXRRQueryExtension(display, memAddress(event_base_return), memAddress(error_base_return));
	}

	/** Alternative version of: {@link #XRRQueryExtension} */
	public static int XRRQueryExtension(long display, IntBuffer event_base_return, IntBuffer error_base_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(event_base_return, 1);
			checkBuffer(error_base_return, 1);
		}
		return nXRRQueryExtension(display, memAddress(event_base_return), memAddress(error_base_return));
	}

	// --- [ XRRQueryVersion ] ---

	/** JNI method for {@link #XRRQueryVersion} */
	public static native int nXRRQueryVersion(long display, long major_version_return, long minor_version_return);

	/**
	 * Returns the current version of the Xrandr extension.
	 *
	 * @param display              the connection to the X server
	 * @param major_version_return the major version
	 * @param minor_version_return the minor version
	 */
	public static int XRRQueryVersion(long display, ByteBuffer major_version_return, ByteBuffer minor_version_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major_version_return, 1 << 2);
			checkBuffer(minor_version_return, 1 << 2);
		}
		return nXRRQueryVersion(display, memAddress(major_version_return), memAddress(minor_version_return));
	}

	/** Alternative version of: {@link #XRRQueryVersion} */
	public static int XRRQueryVersion(long display, IntBuffer major_version_return, IntBuffer minor_version_return) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(major_version_return, 1);
			checkBuffer(minor_version_return, 1);
		}
		return nXRRQueryVersion(display, memAddress(major_version_return), memAddress(minor_version_return));
	}

	// --- [ XRRGetScreenResources ] ---

	/** JNI method for {@link #XRRGetScreenResources} */
	public static native long nXRRGetScreenResources(long display, long w);

	/**
	 * Returns a {@link XRRScreenResources} structure for the given window.
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 */
	public static ByteBuffer XRRGetScreenResources(long display, long w) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		long __result = nXRRGetScreenResources(display, w);
		return memByteBuffer(__result, XRRScreenResources.SIZEOF);
	}

	// --- [ XRRFreeScreenResources ] ---

	/** JNI method for {@link #XRRFreeScreenResources} */
	public static native void nXRRFreeScreenResources(long resources);

	/**
	 * Frees the given {@link XRRScreenResources} structure.
	 *
	 * @param resources the {@link XRRScreenResources} structure to free
	 */
	public static void XRRFreeScreenResources(ByteBuffer resources) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(resources, XRRScreenResources.SIZEOF);
		nXRRFreeScreenResources(memAddress(resources));
	}

	// --- [ XRRGetCrtcInfo ] ---

	/** JNI method for {@link #XRRGetCrtcInfo} */
	public static native long nXRRGetCrtcInfo(long display, long resources, long crtc);

	/**
	 * Returns information about a screen in a {@link XRRCrtcInfo} structure.
	 *
	 * @param display   the connection to the X server
	 * @param resources a pointer to a {@link XRRScreenResources} structure
	 * @param crtc      the screen to query
	 */
	public static ByteBuffer XRRGetCrtcInfo(long display, ByteBuffer resources, long crtc) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(resources, XRRScreenResources.SIZEOF);
		}
		long __result = nXRRGetCrtcInfo(display, memAddress(resources), crtc);
		return memByteBuffer(__result, XRRCrtcInfo.SIZEOF);
	}

	// --- [ XRRFreeCrtcInfo ] ---

	/** JNI method for {@link #XRRFreeCrtcInfo} */
	public static native void nXRRFreeCrtcInfo(long crtcInfo);

	/**
	 * Frees a {@link XRRCrtcInfo} structure.
	 *
	 * @param crtcInfo the {@link XRRCrtcInfo} structure to free
	 */
	public static void XRRFreeCrtcInfo(ByteBuffer crtcInfo) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(crtcInfo, XRRCrtcInfo.SIZEOF);
		nXRRFreeCrtcInfo(memAddress(crtcInfo));
	}

	// --- [ XRRGetOutputInfo ] ---

	/** JNI method for {@link #XRRGetOutputInfo} */
	public static native long nXRRGetOutputInfo(long display, long resources, long output);

	/**
	 * Returns output information in a {@link XRROutputInfo} structure.
	 *
	 * @param display   the connection to the X server
	 * @param resources a pointer to a {@link XRRScreenResources} structure
	 * @param output    the output to query
	 */
	public static ByteBuffer XRRGetOutputInfo(long display, ByteBuffer resources, long output) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(resources, XRRScreenResources.SIZEOF);
		}
		long __result = nXRRGetOutputInfo(display, memAddress(resources), output);
		return memByteBuffer(__result, XRROutputInfo.SIZEOF);
	}

	// --- [ XRRFreeOutputInfo ] ---

	/** JNI method for {@link #XRRFreeOutputInfo} */
	public static native void nXRRFreeOutputInfo(long outputInfo);

	/**
	 * Frees a {@link XRROutputInfo} structure.
	 *
	 * @param outputInfo the {@link XRROutputInfo} structure to free
	 */
	public static void XRRFreeOutputInfo(ByteBuffer outputInfo) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(outputInfo, XRROutputInfo.SIZEOF);
		nXRRFreeOutputInfo(memAddress(outputInfo));
	}

	// --- [ XRRSelectInput ] ---

	/** JNI method for {@link #XRRSelectInput} */
	public static native void nXRRSelectInput(long display, long w, int mask);

	/**
	 * TODO: document
	 *
	 * @param display the connection to the X server
	 * @param w       the window
	 * @param mask    the mask
	 */
	public static void XRRSelectInput(long display, long w, int mask) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		nXRRSelectInput(display, w, mask);
	}

	// --- [ XRRUpdateConfiguration ] ---

	/** JNI method for {@link #XRRUpdateConfiguration} */
	public static native int nXRRUpdateConfiguration(long event);

	/**
	 * Intended to take RRScreenChangeNotify, or ConfigureNotify (on the root window) returns 1 if it is an event type it understands, 0 if not.
	 *
	 * @param event the event
	 */
	public static int XRRUpdateConfiguration(ByteBuffer event) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(event, XEvent.SIZEOF);
		return nXRRUpdateConfiguration(memAddress(event));
	}

	// --- [ XRRGetCrtcGammaSize ] ---

	/** JNI method for {@link #XRRGetCrtcGammaSize} */
	public static native int nXRRGetCrtcGammaSize(long display, long crtc);

	/**
	 * TODO: document
	 *
	 * @param display the connection to the X server
	 * @param crtc    
	 */
	public static int XRRGetCrtcGammaSize(long display, long crtc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		return nXRRGetCrtcGammaSize(display, crtc);
	}

	// --- [ XRRGetCrtcGamma ] ---

	/** JNI method for {@link #XRRGetCrtcGamma} */
	public static native long nXRRGetCrtcGamma(long display, long crtc);

	/**
	 * Returns the current display gamma values in a {@link XRRCrtcGamma} structure.
	 *
	 * @param display the connection to the X server
	 * @param crtc    
	 */
	public static ByteBuffer XRRGetCrtcGamma(long display, long crtc) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(display);
		long __result = nXRRGetCrtcGamma(display, crtc);
		return memByteBuffer(__result, XRRCrtcGamma.SIZEOF);
	}

	// --- [ XRRAllocGamma ] ---

	/** JNI method for {@link #XRRAllocGamma} */
	public static native long nXRRAllocGamma(int size);

	/**
	 * Allocates a {@link XRRCrtcGamma} structure of the given {@code size}.
	 *
	 * @param size the gamma size
	 */
	public static ByteBuffer XRRAllocGamma(int size) {
		long __result = nXRRAllocGamma(size);
		return memByteBuffer(__result, XRRCrtcGamma.SIZEOF);
	}

	// --- [ XRRFreeGamma ] ---

	/** JNI method for {@link #XRRFreeGamma} */
	public static native void nXRRFreeGamma(long gamma);

	/**
	 * Frees the given {@link XRRCrtcGamma} structure.
	 *
	 * @param gamma the {@link XRRCrtcGamma} structure to free
	 */
	public static void XRRFreeGamma(ByteBuffer gamma) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(gamma, XRRCrtcGamma.SIZEOF);
		nXRRFreeGamma(memAddress(gamma));
	}

	// --- [ XRRSetCrtcGamma ] ---

	/** JNI method for {@link #XRRSetCrtcGamma} */
	public static native void nXRRSetCrtcGamma(long display, long crtc, long gamma);

	/**
	 * Sets the gamma ramp
	 *
	 * @param display the connection to the X server
	 * @param crtc    
	 * @param gamma   a pointer to a {@link XRRCrtcGamma} structure that contains the gamma ramp
	 */
	public static void XRRSetCrtcGamma(long display, long crtc, ByteBuffer gamma) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(display);
			checkBuffer(gamma, XRRCrtcGamma.SIZEOF);
		}
		nXRRSetCrtcGamma(display, crtc, memAddress(gamma));
	}

}