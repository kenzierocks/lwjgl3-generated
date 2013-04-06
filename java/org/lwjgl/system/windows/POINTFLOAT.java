/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class POINTFLOAT {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		X = offsets.get(0);
		Y = offsets.get(1);
	}

	private POINTFLOAT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		float x,
		float y
	) {
		ByteBuffer pointfloat = malloc();

		xSet(pointfloat, x);
		ySet(pointfloat, y);

		return pointfloat;
	}

	public static void xSet(ByteBuffer pointfloat, float x) { pointfloat.putFloat(pointfloat.position() + X, x); }
	public static void ySet(ByteBuffer pointfloat, float y) { pointfloat.putFloat(pointfloat.position() + Y, y); }

	public static float xGet(ByteBuffer pointfloat) { return pointfloat.getFloat(pointfloat.position() + X); }
	public static float yGet(ByteBuffer pointfloat) { return pointfloat.getFloat(pointfloat.position() + Y); }

}