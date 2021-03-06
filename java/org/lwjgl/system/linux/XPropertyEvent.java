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

/** Property event. */
public final class XPropertyEvent {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		WINDOW,
		ATOM,
		TIME,
		STATE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		WINDOW = offsets.get(4);
		ATOM = offsets.get(5);
		TIME = offsets.get(6);
		STATE = offsets.get(7);
	}

	private XPropertyEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		long window,
		long atom,
		long time,
		int state
	) {
		ByteBuffer xpropertyevent = malloc();

		type(xpropertyevent, type);
		serial(xpropertyevent, serial);
		send_event(xpropertyevent, send_event);
		display(xpropertyevent, display);
		window(xpropertyevent, window);
		atom(xpropertyevent, atom);
		time(xpropertyevent, time);
		state(xpropertyevent, state);

		return xpropertyevent;
	}

	public static void type(ByteBuffer xpropertyevent, int type) { xpropertyevent.putInt(xpropertyevent.position() + TYPE, type); }
	public static void serial(ByteBuffer xpropertyevent, long serial) { PointerBuffer.put(xpropertyevent, xpropertyevent.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer xpropertyevent, int send_event) { xpropertyevent.putInt(xpropertyevent.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer xpropertyevent, long display) { PointerBuffer.put(xpropertyevent, xpropertyevent.position() + DISPLAY, display); }
	public static void window(ByteBuffer xpropertyevent, long window) { PointerBuffer.put(xpropertyevent, xpropertyevent.position() + WINDOW, window); }
	public static void atom(ByteBuffer xpropertyevent, long atom) { PointerBuffer.put(xpropertyevent, xpropertyevent.position() + ATOM, atom); }
	public static void time(ByteBuffer xpropertyevent, long time) { PointerBuffer.put(xpropertyevent, xpropertyevent.position() + TIME, time); }
	public static void state(ByteBuffer xpropertyevent, int state) { xpropertyevent.putInt(xpropertyevent.position() + STATE, state); }

	public static int type(ByteBuffer xpropertyevent) { return xpropertyevent.getInt(xpropertyevent.position() + TYPE); }
	public static long serial(ByteBuffer xpropertyevent) { return PointerBuffer.get(xpropertyevent, xpropertyevent.position() + SERIAL); }
	public static int send_event(ByteBuffer xpropertyevent) { return xpropertyevent.getInt(xpropertyevent.position() + SEND_EVENT); }
	public static long display(ByteBuffer xpropertyevent) { return PointerBuffer.get(xpropertyevent, xpropertyevent.position() + DISPLAY); }
	public static long window(ByteBuffer xpropertyevent) { return PointerBuffer.get(xpropertyevent, xpropertyevent.position() + WINDOW); }
	public static long atom(ByteBuffer xpropertyevent) { return PointerBuffer.get(xpropertyevent, xpropertyevent.position() + ATOM); }
	public static long time(ByteBuffer xpropertyevent) { return PointerBuffer.get(xpropertyevent, xpropertyevent.position() + TIME); }
	public static int state(ByteBuffer xpropertyevent) { return xpropertyevent.getInt(xpropertyevent.position() + STATE); }

}