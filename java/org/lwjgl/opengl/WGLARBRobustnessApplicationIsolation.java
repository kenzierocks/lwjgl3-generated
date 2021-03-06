/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/wgl_robustness_isolation.txt">WGL_ARB_robustness_application_isolation</a> extension.
 * <p/>
 * GL_ARB_robustness and WGL_ARB_create_context_robustness allow creating an OpenGL context supporting graphics reset notification behavior.
 * WGL_ARB_robustness_application_isolation provides stronger guarantees about the possible side-effects of a graphics reset.
 */
public final class WGLARBRobustnessApplicationIsolation {

	/**
	 * Accepted as a bit in the attribute value for {@link WGLARBCreateContext#WGL_CONTEXT_FLAGS_ARB} in the {@code attribList} argument to
	 * {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB}.
	 */
	public static final int
		WGL_CONTEXT_RESET_ISOLATION_BIT_ARB = 0x8;

	private WGLARBRobustnessApplicationIsolation() {}

}