@file:Suppress("unused")
@file:OptIn(ExperimentalUnsignedTypes::class)

package kotlinx.serialization.cbor

import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
private fun cborElementOf(value: Nothing?): CborElement = CborNull()

@ExperimentalSerializationApi
private fun cborElementOf(value: Boolean): CborElement = CborBoolean(value)

@ExperimentalSerializationApi
private fun cborElementOf(value: Byte): CborElement = CborInt(value.toLong())

@ExperimentalSerializationApi
private fun cborElementOf(value: Short): CborElement = CborInt(value.toLong())

@ExperimentalSerializationApi
private fun cborElementOf(value: Int): CborElement = CborInt(value.toLong())

@ExperimentalSerializationApi
private fun cborElementOf(value: Long): CborElement = CborInt(value)

@ExperimentalSerializationApi
private fun cborElementOf(value: UByte): CborElement = CborInt(value.toULong())

@ExperimentalSerializationApi
private fun cborElementOf(value: UShort): CborElement = CborInt(value.toULong())

@ExperimentalSerializationApi
private fun cborElementOf(value: UInt): CborElement = CborInt(value.toULong())

@ExperimentalSerializationApi
private fun cborElementOf(value: ULong): CborElement = CborInt(value)

@ExperimentalSerializationApi
private fun cborElementOf(value: Char): CborElement = CborInt(value.code.toLong())

@ExperimentalSerializationApi
private fun cborElementOf(value: Float): CborElement = CborFloat(value.toDouble())

@ExperimentalSerializationApi
private fun cborElementOf(value: Double): CborElement = CborFloat(value)

@ExperimentalSerializationApi
private fun cborElementOf(value: String): CborElement = CborString(value)

@ExperimentalSerializationApi
private fun cborElementOf(value: ByteArray): CborElement = CborByteString(value)

@ExperimentalSerializationApi
private fun cborKeyOf(key: String): CborElement = CborString(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Byte): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Short): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Int): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Long): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: UByte): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: UShort): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: UInt): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: ULong): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Char): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Boolean): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Float): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: Double): CborElement = cborElementOf(key)

@ExperimentalSerializationApi
private fun cborKeyOf(key: ByteArray): CborElement = cborElementOf(key)

/**
 * Adds the given [element] to a mutable CBOR array content list.
 */
@ExperimentalSerializationApi
public fun MutableList<CborElement>.addCbor(element: CborElement): Boolean = add(element)

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Boolean): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Byte): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Short): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Int): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Long): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: UByte): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: UShort): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: UInt): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: ULong): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Char): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Float): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Double): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: String): Boolean = add(cborElementOf(value))

@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: ByteArray): Boolean = add(cborElementOf(value))

@Suppress("UNUSED_PARAMETER") // allows to call `add(null)`
@ExperimentalSerializationApi
public fun MutableList<CborElement>.add(value: Nothing?): Boolean = add(cborElementOf(value))

/**
 * Puts the given [element] into a mutable CBOR map content map.
 *
 * Returns the previous value associated with [key], or `null` if the key was not present.
 */
@ExperimentalSerializationApi
public fun CborMap.putCbor(key: CborElement, element: CborElement): CborElement? = put(key, element)

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Boolean): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Byte): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Short): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Int): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Long): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: UByte): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: UShort): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: UInt): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: ULong): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Char): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Float): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Double): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: String): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: ByteArray): CborElement? = put(key, cborElementOf(value))

@Suppress("UNUSED_PARAMETER") // allows to call `put(key, null)`
@ExperimentalSerializationApi
public fun CborMap.put(key: CborElement, value: Nothing?): CborElement? = put(key, cborElementOf(value))

@ExperimentalSerializationApi
public fun CborMap.put(key: String, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Boolean): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Byte): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Short): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Int): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Long): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: UByte): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: UShort): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: UInt): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: ULong): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Char): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Float): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Double): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: String): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: ByteArray): CborElement? = put(cborKeyOf(key), value)

@Suppress("UNUSED_PARAMETER") // allows to call `put(key, null)`
@ExperimentalSerializationApi
public fun CborMap.put(key: String, value: Nothing?): CborElement? = put(cborKeyOf(key), value)

@ExperimentalSerializationApi
public fun CborMap.put(key: Byte, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Short, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Int, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Long, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: UByte, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: UShort, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: UInt, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: ULong, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Char, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Boolean, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Float, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: Double, element: CborElement): CborElement? = put(cborKeyOf(key), element)

@ExperimentalSerializationApi
public fun CborMap.put(key: ByteArray, element: CborElement): CborElement? = put(cborKeyOf(key), element)

