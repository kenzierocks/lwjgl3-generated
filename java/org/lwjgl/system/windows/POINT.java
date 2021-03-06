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

/** Defines the x- and y- coordinates of a point. */
public final class POINT {

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

	private POINT() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int x,
		int y
	) {
		ByteBuffer point = malloc();

		x(point, x);
		y(point, y);

		return point;
	}

	public static void x(ByteBuffer point, int x) { point.putInt(point.position() + X, x); }
	public static void y(ByteBuffer point, int y) { point.putInt(point.position() + Y, y); }

	public static int x(ByteBuffer point) { return point.getInt(point.position() + X); }
	public static int y(ByteBuffer point) { return point.getInt(point.position() + Y); }

}