/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_create_context.txt">WGL_ARB_create_context_profile</a> extension.
 * <p/>
 * Add an attribute to {@link WGLARBCreateContext}, specifying the GL profile requested for a context of OpenGL 3.2 or later.
 */
public final class WGLARBCreateContextProfile {

	/** Accepted as an attribute name in {@code attribList}. */
	public static final int
		WGL_CONTEXT_PROFILE_MASK_ARB = 0x9126;

	/** Accepted as bits in the attribute value for {@link #WGL_CONTEXT_PROFILE_MASK_ARB CONTEXT_PROFILE_MASK_ARB} in {@code attribList}. */
	public static final int
		WGL_CONTEXT_CORE_PROFILE_BIT_ARB          = 0x1,
		WGL_CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB = 0x2;

	private WGLARBCreateContextProfile() {}

}