/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libffi;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.system.libffi.LibFFIConstants.*;

/**
 * Native bindings to the <a href="https://sourceware.org/libffi">libffi</a> library.
 * <p/>
 * The foreign function interface provides a mechanism by which a function can generate a call to another function at runtime without requiring knowledge
 * of the called function's interface at compile time. This enables use of native libraries that LWJGL does not provide bindings for.
 * <p/>
 * libffi assumes that you have a pointer to the function you wish to call and that you know the number and types of arguments to pass it, as well as the
 * return type of the function.
 * <p/>
 * The first thing you must do is create an {@link ffi_cif} object that matches the signature of the function you wish to call. This is a separate step
 * because it is common to make multiple calls using a single {@link ffi_cif}. The {@code cif} in {@code ffi_cif} stands for Call InterFace. To prepare a
 * call interface object, use the function {@link #ffi_prep_cif prep_cif}. To call a function using an initialized {@code ffi_cif}, use the {@link #ffi_call call} function.
 * <p/>
 * <strong>LWJGL note</strong>: The closure and raw APIs are not exposed.
 */
public final class LibFFI {

	/** Types used to create custom {@link ffi_cif}. */
	public static final int
		FFI_TYPE_VOID       = 0x0,
		FFI_TYPE_INT        = 0x1,
		FFI_TYPE_FLOAT      = 0x2,
		FFI_TYPE_DOUBLE     = 0x3,
		FFI_TYPE_LONGDOUBLE = FFI_TYPE_DOUBLE(),
		FFI_TYPE_UINT8      = 0x5,
		FFI_TYPE_SINT8      = 0x6,
		FFI_TYPE_UINT16     = 0x7,
		FFI_TYPE_SINT16     = 0x8,
		FFI_TYPE_UINT32     = 0x9,
		FFI_TYPE_SINT32     = 0xA,
		FFI_TYPE_UINT64     = 0xB,
		FFI_TYPE_SINT64     = 0xC,
		FFI_TYPE_STRUCT     = 0xD,
		FFI_TYPE_POINTER    = 0xE;

	/** ABI enumeration. */
	public static final int
		FFI_SYSV        = 0x1,
		FFI_STDCALL     = 0x2,
		FFI_THISCALL    = 0x3,
		FFI_FASTCALL    = 0x4,
		FFI_MS_CDECL    = 0x5,
		FFI_WIN64       = 0x1,
		FFI_UNIX64      = 0x2,
		FFI_DEFAULT_ABI = FFI_DEFAULT_ABI();

	/** Status codes. */
	public static final int
		FFI_OK          = 0x0,
		FFI_BAD_TYPEDEF = 0x1,
		FFI_BAD_ABI     = 0x2;

	/** Data types. These are the addresses of libffi's predefined {@link ffi_type} structs. */
	public static final long
		ffi_type_void       = ffi_type_void(),
		ffi_type_uint8      = ffi_type_uint8(),
		ffi_type_sint8      = ffi_type_sint8(),
		ffi_type_uint16     = ffi_type_uint16(),
		ffi_type_sint16     = ffi_type_sint16(),
		ffi_type_uint32     = ffi_type_uint32(),
		ffi_type_sint32     = ffi_type_sint32(),
		ffi_type_uint64     = ffi_type_uint64(),
		ffi_type_sint64     = ffi_type_sint64(),
		ffi_type_uchar      = ffi_type_uchar(),
		ffi_type_schar      = ffi_type_schar(),
		ffi_type_sshort     = ffi_type_sshort(),
		ffi_type_ushort     = ffi_type_ushort(),
		ffi_type_uint       = ffi_type_uint(),
		ffi_type_sint       = ffi_type_sint(),
		ffi_type_ulong      = ffi_type_ulong(),
		ffi_type_slong      = ffi_type_slong(),
		ffi_type_float      = ffi_type_float(),
		ffi_type_double     = ffi_type_double(),
		ffi_type_longdouble = ffi_type_longdouble(),
		ffi_type_pointer    = ffi_type_pointer();

	private LibFFI() {}

	// --- [ ffi_prep_cif ] ---

	/** JNI method for {@link #ffi_prep_cif prep_cif} */
	@JavadocExclude
	public static native int nffi_prep_cif(long cif, int abi, int nargs, long rtype, long atypes);

	/**
	 * Prepares an {@link ffi_cif} structure for use with {@link #ffi_call call}.
	 *
	 * @param cif    the {@link ffi_cif} structure to prepare
	 * @param abi    the calling convention to use. One of:<p/>{@link #FFI_SYSV SYSV}, {@link #FFI_STDCALL STDCALL}, {@link #FFI_THISCALL THISCALL}, {@link #FFI_FASTCALL FASTCALL}, {@link #FFI_MS_CDECL MS_CDECL}, {@link #FFI_WIN64 WIN64}, {@link #FFI_UNIX64 UNIX64}, {@link #FFI_DEFAULT_ABI DEFAULT_ABI}
	 * @param nargs  the number of arguments
	 * @param rtype  points to an {@link ffi_type} that describes the data type, size and alignment of the return value
	 * @param atypes an array of {@code nargs} pointers to {@link ffi_type} structs that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static int ffi_prep_cif(ByteBuffer cif, int abi, int nargs, ByteBuffer rtype, ByteBuffer atypes) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			if ( atypes != null ) checkBuffer(atypes, nargs << POINTER_SHIFT);
			checkBuffer(rtype, ffi_type.SIZEOF);
		}
		return nffi_prep_cif(memAddress(cif), abi, nargs, memAddress(rtype), memAddressSafe(atypes));
	}

	/** Alternative version of: {@link #ffi_prep_cif prep_cif} */
	public static int ffi_prep_cif(ByteBuffer cif, int abi, ByteBuffer rtype, PointerBuffer atypes) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			checkBuffer(rtype, ffi_type.SIZEOF);
		}
		return nffi_prep_cif(memAddress(cif), abi, atypes == null ? 0 : atypes.remaining(), memAddress(rtype), memAddressSafe(atypes));
	}

	// --- [ ffi_prep_cif_var ] ---

	/** JNI method for {@link #ffi_prep_cif_var prep_cif_var} */
	@JavadocExclude
	public static native int nffi_prep_cif_var(long cif, int abi, int nfixedargs, int ntotalargs, long rtype, long atypes);

	/**
	 * Prepares an {@link ffi_cif} structure for use with {@link #ffi_call call} for variadic functions.
	 *
	 * @param cif        the {@link ffi_cif} structure to prepare
	 * @param abi        the calling convention to use. One of:<p/>{@link #FFI_SYSV SYSV}, {@link #FFI_STDCALL STDCALL}, {@link #FFI_THISCALL THISCALL}, {@link #FFI_FASTCALL FASTCALL}, {@link #FFI_MS_CDECL MS_CDECL}, {@link #FFI_WIN64 WIN64}, {@link #FFI_UNIX64 UNIX64}, {@link #FFI_DEFAULT_ABI DEFAULT_ABI}
	 * @param nfixedargs the number of fixed (non-variadic) arguments
	 * @param ntotalargs the total number of arguments
	 * @param rtype      points to an {@link ffi_type} that describes the data type, size and alignment of the return value
	 * @param atypes     an array of {@code ntotalargs} pointers to {@link ffi_type} structs that describe the data type, size and alignment of each argument
	 *
	 * @return Upon successful completion, {@code ffi_prep_cif} returns {@link #FFI_OK OK}. It will return {@link #FFI_BAD_TYPEDEF BAD_TYPEDEF} if {@code cif} is {@code NULL} or
	 *         {@code atypes} or {@code rtype} is malformed. If {@code abi} does not refer to a valid ABI, {@link #FFI_BAD_ABI BAD_ABI} will be returned.
	 */
	public static int ffi_prep_cif_var(ByteBuffer cif, int abi, int nfixedargs, int ntotalargs, ByteBuffer rtype, ByteBuffer atypes) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			checkBuffer(atypes, ntotalargs << POINTER_SHIFT);
			checkBuffer(rtype, ffi_type.SIZEOF);
		}
		return nffi_prep_cif_var(memAddress(cif), abi, nfixedargs, ntotalargs, memAddress(rtype), memAddress(atypes));
	}

	/** Alternative version of: {@link #ffi_prep_cif_var prep_cif_var} */
	public static int ffi_prep_cif_var(ByteBuffer cif, int abi, int nfixedargs, ByteBuffer rtype, PointerBuffer atypes) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			checkBuffer(rtype, ffi_type.SIZEOF);
		}
		return nffi_prep_cif_var(memAddress(cif), abi, nfixedargs, atypes.remaining(), memAddress(rtype), memAddress(atypes));
	}

	// --- [ ffi_call ] ---

	/** JNI method for {@link #ffi_call call} */
	@JavadocExclude
	public static native void nffi_call(long cif, long fn, long rvalue, long avalue);

	/**
	 * Provides a simple mechanism for invoking a function without requiring knowledge of the function's interface at compile time.
	 *
	 * @param cif    a {@link ffi_cif} structure. It must be initialized with {@link #ffi_prep_cif prep_cif} or {@link #ffi_prep_cif_var prep_cif_var} before it is used with {@code ffi_call}.
	 * @param fn     the function to call
	 * @param rvalue a pointer to storage in which to place the returned value. The storage must be sizeof(ffi_arg) or larger for non-floating point types. For
	 *               smaller-sized return value types, the ffi_arg or ffi_sarg integral type must be used to hold the return value.
	 * @param avalue an array of pointers from which the argument values are retrieved
	 */
	public static void ffi_call(ByteBuffer cif, long fn, ByteBuffer rvalue, ByteBuffer avalue) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			checkPointer(fn);
		}
		nffi_call(memAddress(cif), fn, memAddressSafe(rvalue), memAddressSafe(avalue));
	}

	/** Alternative version of: {@link #ffi_call call} */
	public static void ffi_call(ByteBuffer cif, long fn, ByteBuffer rvalue, PointerBuffer avalue) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(cif, ffi_cif.SIZEOF);
			checkPointer(fn);
		}
		nffi_call(memAddress(cif), fn, memAddressSafe(rvalue), memAddressSafe(avalue));
	}

}