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

/** XInput2 modifier state. */
public final class XIModifierState {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		BASE,
		LATCHED,
		LOCKED,
		EFFECTIVE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		BASE = offsets.get(0);
		LATCHED = offsets.get(1);
		LOCKED = offsets.get(2);
		EFFECTIVE = offsets.get(3);
	}

	private XIModifierState() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int base,
		int latched,
		int locked,
		int effective
	) {
		ByteBuffer ximodifierstate = malloc();

		baseSet(ximodifierstate, base);
		latchedSet(ximodifierstate, latched);
		lockedSet(ximodifierstate, locked);
		effectiveSet(ximodifierstate, effective);

		return ximodifierstate;
	}

	public static void baseSet(ByteBuffer ximodifierstate, int base) { ximodifierstate.putInt(ximodifierstate.position() + BASE, base); }
	public static void latchedSet(ByteBuffer ximodifierstate, int latched) { ximodifierstate.putInt(ximodifierstate.position() + LATCHED, latched); }
	public static void lockedSet(ByteBuffer ximodifierstate, int locked) { ximodifierstate.putInt(ximodifierstate.position() + LOCKED, locked); }
	public static void effectiveSet(ByteBuffer ximodifierstate, int effective) { ximodifierstate.putInt(ximodifierstate.position() + EFFECTIVE, effective); }

	public static int baseGet(ByteBuffer ximodifierstate) { return ximodifierstate.getInt(ximodifierstate.position() + BASE); }
	public static int latchedGet(ByteBuffer ximodifierstate) { return ximodifierstate.getInt(ximodifierstate.position() + LATCHED); }
	public static int lockedGet(ByteBuffer ximodifierstate) { return ximodifierstate.getInt(ximodifierstate.position() + LOCKED); }
	public static int effectiveGet(ByteBuffer ximodifierstate) { return ximodifierstate.getInt(ximodifierstate.position() + EFFECTIVE); }

}