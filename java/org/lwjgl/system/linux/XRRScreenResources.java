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

/** Xrandr screen resources struct. */
public final class XRRScreenResources {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIMESTAMP,
		CONFIGTIMESTAMP,
		NCRTC,
		CRTCS,
		NOUTPUT,
		OUTPUTS,
		NMODE,
		MODES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		TIMESTAMP = offsets.get(0);
		CONFIGTIMESTAMP = offsets.get(1);
		NCRTC = offsets.get(2);
		CRTCS = offsets.get(3);
		NOUTPUT = offsets.get(4);
		OUTPUTS = offsets.get(5);
		NMODE = offsets.get(6);
		MODES = offsets.get(7);
	}

	private XRRScreenResources() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long timestamp,
		long configTimestamp,
		int ncrtc,
		long crtcs,
		int noutput,
		long outputs,
		int nmode,
		long modes
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestamp(xrrscreenresources, timestamp);
		configTimestamp(xrrscreenresources, configTimestamp);
		ncrtc(xrrscreenresources, ncrtc);
		crtcs(xrrscreenresources, crtcs);
		noutput(xrrscreenresources, noutput);
		outputs(xrrscreenresources, outputs);
		nmode(xrrscreenresources, nmode);
		modes(xrrscreenresources, modes);

		return xrrscreenresources;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long timestamp,
		long configTimestamp,
		int ncrtc,
		ByteBuffer crtcs,
		int noutput,
		ByteBuffer outputs,
		int nmode,
		ByteBuffer modes
	) {
		ByteBuffer xrrscreenresources = malloc();

		timestamp(xrrscreenresources, timestamp);
		configTimestamp(xrrscreenresources, configTimestamp);
		ncrtc(xrrscreenresources, ncrtc);
		crtcs(xrrscreenresources, crtcs);
		noutput(xrrscreenresources, noutput);
		outputs(xrrscreenresources, outputs);
		nmode(xrrscreenresources, nmode);
		modes(xrrscreenresources, modes);

		return xrrscreenresources;
	}

	public static void timestamp(ByteBuffer xrrscreenresources, long timestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP, timestamp); }
	public static void configTimestamp(ByteBuffer xrrscreenresources, long configTimestamp) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP, configTimestamp); }
	public static void ncrtc(ByteBuffer xrrscreenresources, int ncrtc) { xrrscreenresources.putInt(xrrscreenresources.position() + NCRTC, ncrtc); }
	public static void crtcs(ByteBuffer xrrscreenresources, long crtcs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + CRTCS, crtcs); }
	public static void crtcs(ByteBuffer xrrscreenresources, ByteBuffer crtcs) { crtcs(xrrscreenresources, memAddress(crtcs)); }
	public static void noutput(ByteBuffer xrrscreenresources, int noutput) { xrrscreenresources.putInt(xrrscreenresources.position() + NOUTPUT, noutput); }
	public static void outputs(ByteBuffer xrrscreenresources, long outputs) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + OUTPUTS, outputs); }
	public static void outputs(ByteBuffer xrrscreenresources, ByteBuffer outputs) { outputs(xrrscreenresources, memAddress(outputs)); }
	public static void nmode(ByteBuffer xrrscreenresources, int nmode) { xrrscreenresources.putInt(xrrscreenresources.position() + NMODE, nmode); }
	public static void modes(ByteBuffer xrrscreenresources, long modes) { PointerBuffer.put(xrrscreenresources, xrrscreenresources.position() + MODES, modes); }
	public static void modes(ByteBuffer xrrscreenresources, ByteBuffer modes) { modes(xrrscreenresources, memAddress(modes)); }

	public static long timestamp(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + TIMESTAMP); }
	public static long configTimestamp(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CONFIGTIMESTAMP); }
	public static int ncrtc(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NCRTC); }
	public static long crtcs(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + CRTCS); }
	public static ByteBuffer crtcs(ByteBuffer xrrscreenresources, int size) { long address = crtcs(xrrscreenresources); return address == NULL ? null : memByteBuffer(address, size); }
	public static int noutput(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NOUTPUT); }
	public static long outputs(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + OUTPUTS); }
	public static ByteBuffer outputs(ByteBuffer xrrscreenresources, int size) { long address = outputs(xrrscreenresources); return address == NULL ? null : memByteBuffer(address, size); }
	public static int nmode(ByteBuffer xrrscreenresources) { return xrrscreenresources.getInt(xrrscreenresources.position() + NMODE); }
	public static long modes(ByteBuffer xrrscreenresources) { return PointerBuffer.get(xrrscreenresources, xrrscreenresources.position() + MODES); }
	public static ByteBuffer modesb(ByteBuffer xrrscreenresources) { return memByteBuffer(modes(xrrscreenresources), XRRModeInfo.SIZEOF); }

}