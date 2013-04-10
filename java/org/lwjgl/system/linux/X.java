/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

/** Native bindings to X.h. */
public final class X {

	/** RESERVED RESOURCE AND CONSTANT DEFINITIONS */
	public static final int
		None            = 0x0,
		ParentRelative  = 0x1,
		CopyFromParent  = 0x0,
		PointerWindow   = 0x0,
		InputFocus      = 0x1,
		PointerRoot     = 0x1,
		AnyPropertyType = 0x0,
		AnyKey          = 0x0,
		AnyButton       = 0x0,
		AllTemporary    = 0x0,
		CurrentTime     = 0x0,
		NoSymbol        = 0x0;

	/** ERROR CODES */
	public static final int
		Success           = 0x0,
		BadRequest        = 0x1,
		BadValue          = 0x2,
		BadWindow         = 0x3,
		BadPixmap         = 0x4,
		BadAtom           = 0x5,
		BadCursor         = 0x6,
		BadFont           = 0x7,
		BadMatch          = 0x8,
		BadDrawable       = 0x9,
		BadAccess         = 0xA,
		BadAlloc          = 0xB,
		BadColor          = 0xC,
		BadGC             = 0xD,
		BadIDChoice       = 0xE,
		BadName           = 0xF,
		BadLength         = 0x10,
		BadImplementation = 0x11;

	/** Window attributes for CreateWindow and ChangeWindowAttributes */
	public static final int
		CWBackPixmap       = 1 << 0,
		CWBackPixel        = 1 << 1,
		CWBorderPixmap     = 1 << 2,
		CWBorderPixel      = 1 << 3,
		CWBitGravity       = 1 << 4,
		CWWinGravity       = 1 << 5,
		CWBackingStore     = 1 << 6,
		CWBackingPlanes    = 1 << 7,
		CWBackingPixel     = 1 << 8,
		CWOverrideRedirect = 1 << 9,
		CWSaveUnder        = 1 << 10,
		CWEventMask        = 1 << 11,
		CWDontPropagate    = 1 << 12,
		CWColormap         = 1 << 13,
		CWCursor           = 1 << 14;

	/** Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names. */
	public static final int
		NoEventMask              = 0x0,
		KeyPressMask             = 1 << 0,
		KeyReleaseMask           = 1 << 1,
		ButtonPressMask          = 1 << 2,
		ButtonReleaseMask        = 1 << 3,
		EnterWindowMask          = 1 << 4,
		LeaveWindowMask          = 1 << 5,
		PointerMotionMask        = 1 << 6,
		PointerMotionHintMask    = 1 << 7,
		Button1MotionMask        = 1 << 8,
		Button2MotionMask        = 1 << 9,
		Button3MotionMask        = 1 << 10,
		Button4MotionMask        = 1 << 11,
		Button5MotionMask        = 1 << 12,
		ButtonMotionMask         = 1 << 13,
		KeymapStateMask          = 1 << 14,
		ExposureMask             = 1 << 15,
		VisibilityChangeMask     = 1 << 16,
		StructureNotifyMask      = 1 << 17,
		ResizeRedirectMask       = 1 << 18,
		SubstructureNotifyMask   = 1 << 19,
		SubstructureRedirectMask = 1 << 20,
		FocusChangeMask          = 1 << 21,
		PropertyChangeMask       = 1 << 22,
		ColormapChangeMask       = 1 << 23,
		OwnerGrabButtonMask      = 1 << 24;

	/** Window classes used by {@link Xlib#XCreateWindow}. */
	public static final int
		InputOutput = 0x1,
		InputOnly   = 0x2;

	/** GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes */
	public static final int
		GrabModeSync  = 0x0,
		GrabModeAsync = 0x1;

	/** GrabPointer, GrabKeyboard reply status */
	public static final int
		GrabSuccess     = 0x0,
		AlreadyGrabbed  = 0x1,
		GrabInvalidTime = 0x2,
		GrabNotViewable = 0x3,
		GrabFrozen      = 0x4;

	/** SCREEN SAVER STUFF */
	public static final int
		DontPreferBlanking    = 0x0,
		PreferBlanking        = 0x1,
		DefaultBlanking       = 0x2,
		DisableScreenSaver    = 0x0,
		DisableScreenInterval = 0x0,
		DontAllowExposures    = 0x0,
		AllowExposures        = 0x1,
		DefaultExposures      = 0x2,
		ScreenSaverReset      = 0x0,
		ScreenSaverActive     = 0x1;

	/** Used in {@link Xlib#XSetInputFocus}, {@link Xlib#XGetInputFocus}. */
	public static final int
		RevertToNone        = None,
		RevertToPointerRoot = PointerRoot,
		RevertToParent      = 0x2;

	/** Property modes */
	public static final int
		PropModeReplace = 0x0,
		PropModePrepend = 0x1,
		PropModeAppend  = 0x2;

	/** graphics functions, as in GC.alu */
	public static final int
		GXclear        = 0x0,
		GXand          = 0x1,
		GXandReverse   = 0x2,
		GXcopy         = 0x3,
		GXandInverted  = 0x4,
		GXnoop         = 0x5,
		GXxor          = 0x6,
		GXor           = 0x7,
		GXnor          = 0x8,
		GXequiv        = 0x9,
		GXinvert       = 0xA,
		GXorReverse    = 0xB,
		GXcopyInverted = 0xC,
		GXorInverted   = 0xD,
		GXnand         = 0xE,
		GXset          = 0xF;

	/** LineStyle */
	public static final int
		LineSolid      = 0x0,
		LineOnOffDash  = 0x1,
		LineDoubleDash = 0x2;

	/** capStyle */
	public static final int
		CapNotLast    = 0x0,
		CapButt       = 0x1,
		CapRound      = 0x2,
		CapProjecting = 0x3;

	/** joinStyle */
	public static final int
		JoinMiter = 0x0,
		JoinRound = 0x1,
		JoinBevel = 0x2;

	/** fillStyle */
	public static final int
		FillSolid          = 0x0,
		FillTiled          = 0x1,
		FillStippled       = 0x2,
		FillOpaqueStippled = 0x3;

	/** fillRule */
	public static final int
		EvenOddRule = 0x0,
		WindingRule = 0x1;

	/** subwindow mode */
	public static final int
		ClipByChildren   = 0x0,
		IncludeInferiors = 0x1;

	/** SetClipRectangles ordering */
	public static final int
		Unsorted = 0x0,
		YSorted  = 0x1,
		YXSorted = 0x2,
		YXBanded = 0x3;

	/** CoordinateMode for drawing routines */
	public static final int
		CoordModeOrigin   = 0x0,
		CoordModePrevious = 0x1;

	/** Polygon shapes */
	public static final int
		Complex   = 0x0,
		Nonconvex = 0x1,
		Convex    = 0x2;

	/** Arc modes for PolyFillArc */
	public static final int
		ArcChord    = 0x0,
		ArcPieSlice = 0x1;

	/** GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges */
	public static final int
		GCFunction          = 1<<0,
		GCPlaneMask         = 1<<1,
		GCForeground        = 1<<2,
		GCBackground        = 1<<3,
		GCLineWidth         = 1<<4,
		GCLineStyle         = 1<<5,
		GCCapStyle          = 1<<6,
		GCJoinStyle         = 1<<7,
		GCFillStyle         = 1<<8,
		GCFillRule          = 1<<9,
		GCTile              = 1<<10,
		GCStipple           = 1<<11,
		GCTileStipXOrigin   = 1<<12,
		GCTileStipYOrigin   = 1<<13,
		GCFont              = 1<<14,
		GCSubwindowMode     = 1<<15,
		GCGraphicsExposures = 1<<16,
		GCClipXOrigin       = 1<<17,
		GCClipYOrigin       = 1<<18,
		GCClipMask          = 1<<19,
		GCDashOffset        = 1<<20,
		GCDashList          = 1<<21,
		GCArcMode           = 1<<22,
		GCLastBit           = 0x16;

	private X() {}

}