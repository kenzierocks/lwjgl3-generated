/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Xrandr CrtcGamma struct. */
public final class XRRCrtcGamma {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SIZE,
		RED,
		GREEN,
		BLUE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		SIZE = offsets.get(0);
		RED = offsets.get(1);
		GREEN = offsets.get(2);
		BLUE = offsets.get(3);
	}

	private XRRCrtcGamma() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int size,
		long red,
		long green,
		long blue
	) {
		ByteBuffer xrrcrtcgamma = malloc();

		size(xrrcrtcgamma, size);
		red(xrrcrtcgamma, red);
		green(xrrcrtcgamma, green);
		blue(xrrcrtcgamma, blue);

		return xrrcrtcgamma;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int size,
		ByteBuffer red,
		ByteBuffer green,
		ByteBuffer blue
	) {
		ByteBuffer xrrcrtcgamma = malloc();

		size(xrrcrtcgamma, size);
		red(xrrcrtcgamma, red);
		green(xrrcrtcgamma, green);
		blue(xrrcrtcgamma, blue);

		return xrrcrtcgamma;
	}

	public static void size(ByteBuffer xrrcrtcgamma, int size) { xrrcrtcgamma.putInt(xrrcrtcgamma.position() + SIZE, size); }
	public static void red(ByteBuffer xrrcrtcgamma, long red) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + RED, red); }
	public static void red(ByteBuffer xrrcrtcgamma, ByteBuffer red) { red(xrrcrtcgamma, memAddress(red)); }
	public static void green(ByteBuffer xrrcrtcgamma, long green) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN, green); }
	public static void green(ByteBuffer xrrcrtcgamma, ByteBuffer green) { green(xrrcrtcgamma, memAddress(green)); }
	public static void blue(ByteBuffer xrrcrtcgamma, long blue) { PointerBuffer.put(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE, blue); }
	public static void blue(ByteBuffer xrrcrtcgamma, ByteBuffer blue) { blue(xrrcrtcgamma, memAddress(blue)); }

	public static int size(ByteBuffer xrrcrtcgamma) { return xrrcrtcgamma.getInt(xrrcrtcgamma.position() + SIZE); }
	public static long red(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + RED); }
	public static ByteBuffer red(ByteBuffer xrrcrtcgamma, int size) { long address = red(xrrcrtcgamma); return address == NULL ? null : memByteBuffer(address, size); }
	public static long green(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + GREEN); }
	public static ByteBuffer green(ByteBuffer xrrcrtcgamma, int size) { long address = green(xrrcrtcgamma); return address == NULL ? null : memByteBuffer(address, size); }
	public static long blue(ByteBuffer xrrcrtcgamma) { return PointerBuffer.get(xrrcrtcgamma, xrrcrtcgamma.position() + BLUE); }
	public static ByteBuffer blue(ByteBuffer xrrcrtcgamma, int size) { long address = blue(xrrcrtcgamma); return address == NULL ? null : memByteBuffer(address, size); }

}