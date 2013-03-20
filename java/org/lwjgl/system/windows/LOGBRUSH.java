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

public final class LOGBRUSH {

	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		LBSTYLE,
		LBCOLOR,
		LBHATCH;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		LBSTYLE = offsets.get(0);
		LBCOLOR = offsets.get(1);
		LBHATCH = offsets.get(2);
	}

	private LOGBRUSH() {}

	private static native int offsets(long buffer);

	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	public static void lbStyleSet(ByteBuffer struct, int lbStyle) { struct.putInt(struct.position() + LBSTYLE, lbStyle); }
	public static void lbColorSet(ByteBuffer struct, int lbColor) { struct.putInt(struct.position() + LBCOLOR, lbColor); }
	public static void lbHatchSet(ByteBuffer struct, long lbHatch) { PointerBuffer.put(struct, struct.position() + LBHATCH, lbHatch); }

	public static int lbStyleGet(ByteBuffer struct) { return struct.getInt(struct.position() + LBSTYLE); }
	public static int lbColorGet(ByteBuffer struct) { return struct.getInt(struct.position() + LBCOLOR); }
	public static long lbHatchGet(ByteBuffer struct) { return PointerBuffer.get(struct, struct.position() + LBHATCH); }

}