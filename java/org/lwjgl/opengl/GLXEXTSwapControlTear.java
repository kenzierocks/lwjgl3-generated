/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.linux.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/glx_swap_control_tear.txt">GLX_EXT_swap_control_tear</a> extension.
 * <p/>
 * This extension extends the existing GLX_EXT_swap_control extension by allowing a negative {@code interval} parameter to
 * {@link GLXEXTSwapControl#glXSwapIntervalEXT SwapIntervalEXT}. The negative {@code interval} allows late swaps to occur without synchronization to the video frame. This
 * reduces the visual stutter on late frames and reduces the stall on subsequent frames.
 */
public final class GLXEXTSwapControlTear {

	/** Accepted by {@link GLX13#glXQueryDrawable QueryDrawable}: */
	public static final int
		GLX_LATE_SWAPS_TEAR_EXT = 0x20F3;

	private GLXEXTSwapControlTear() {}

}