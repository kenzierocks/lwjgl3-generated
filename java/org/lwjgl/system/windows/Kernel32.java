/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Optional functionality loaded dynamically from <strong>kernel32.dll</strong>.
 * <p/>
 * Features must be detected on a function-by-function basis. The pointers in the {@link Functions} instance will have a zero (0L) value when a particular
 * function is not supported in the Windows version we're running.
 */
public final class Kernel32 {

	private Kernel32() {}

	// --- [ SetThreadAffinityMask ] ---

	/** JNI method for {@link #SetThreadAffinityMask} */
	public static native long nSetThreadAffinityMask(long thread, long threadAffinityMask, long __functionAddress);

	/**
	 * Sets a processor affinity mask for the specified thread.
	 * <p/>
	 * A thread affinity mask is a bit vector in which each bit represents a logical processor that a thread is allowed to run on. A thread affinity mask must
	 * be a subset of the process affinity mask for the containing process of a thread. A thread can only run on the processors its process can run on.
	 * Therefore, the thread affinity mask cannot specify a 1 bit for a processor when the process affinity mask specifies a 0 bit for that processor.
	 * <p/>
	 * Setting an affinity mask for a process or thread can result in threads receiving less processor time, as the system is restricted from running the
	 * threads on certain processors. In most cases, it is better to let the system select an available processor.
	 * <p/>
	 * If the new thread affinity mask does not specify the processor that is currently running the thread, the thread is rescheduled on one of the allowable
	 * processors.
	 *
	 * @param thread             a handle to the thread whose affinity mask is to be set
	 * @param threadAffinityMask the affinity mask for the thread
	 * @param __functionAddress  the DLL function address
	 */
	public static long SetThreadAffinityMask(long thread, long threadAffinityMask, long __functionAddress) {
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkPointer(thread);
		}
		return nSetThreadAffinityMask(thread, threadAffinityMask, __functionAddress);
	}

	/** The {@link FunctionMap} class for {@code Kernel32}. */
	public static final class Functions implements FunctionMap {

		public final long SetThreadAffinityMask;

		public Functions(FunctionProvider provider) {
			SetThreadAffinityMask = provider.getFunctionAddress("SetThreadAffinityMask");
		}

	}

}