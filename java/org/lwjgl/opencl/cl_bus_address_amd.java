/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD}. */
public final class cl_bus_address_amd {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SURFACE_BUS_ADDRESS,
		MARKER_BUS_ADDRESS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		SURFACE_BUS_ADDRESS = offsets.get(0);
		MARKER_BUS_ADDRESS = offsets.get(1);
	}

	private cl_bus_address_amd() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long surface_bus_address,
		long marker_bus_address
	) {
		ByteBuffer struct = malloc();

		surface_bus_addressSet(struct, surface_bus_address);
		marker_bus_addressSet(struct, marker_bus_address);

		return struct;
	}

	public static void surface_bus_addressSet(ByteBuffer struct, long surface_bus_address) { struct.putLong(struct.position() + SURFACE_BUS_ADDRESS, surface_bus_address); }
	public static void marker_bus_addressSet(ByteBuffer struct, long marker_bus_address) { struct.putLong(struct.position() + MARKER_BUS_ADDRESS, marker_bus_address); }

	public static long surface_bus_addressGet(ByteBuffer struct) { return struct.getLong(struct.position() + SURFACE_BUS_ADDRESS); }
	public static long marker_bus_addressGet(ByteBuffer struct) { return struct.getLong(struct.position() + MARKER_BUS_ADDRESS); }

}