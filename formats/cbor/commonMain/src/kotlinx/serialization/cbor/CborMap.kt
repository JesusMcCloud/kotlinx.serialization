@file:Suppress("unused")
@file:OptIn(ExperimentalUnsignedTypes::class)

package kotlinx.serialization.cbor

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.cbor.internal.CborMapSerializer


/**
 * Class representing CBOR map, consisting of key-value pairs, where both key and value are arbitrary [CborElement]
 *
 * Since this class also implements [Map] interface, you can use
 * traditional methods like [Map.get] or [Map.getValue] to obtain CBOR elements.
 */
@Serializable(with = CborMapSerializer::class)
@ExperimentalSerializationApi
public class CborMap(
    /*internal for extension helpers*/
    internal val content: Map<CborElement, CborElement>,
    vararg tags: ULong
) : CborElement(tags), Map<CborElement, CborElement> by content {

    public override fun equals(other: Any?): Boolean =
        other is CborMap && other.content == content && other.tags.contentEquals(tags)

    public override fun hashCode(): Int = content.hashCode() * 31 + tags.contentHashCode()

    override fun toString(): String {
        return "CborMap(" +
            "tags=${tags.joinToString(prefix = "[", postfix = "]")}, " +
            "content=$content" +
            ")"
    }

    public operator fun get(key: String): CborElement? = content[CborString(key)]
    public fun getValue(key: String): CborElement = content.getValue(CborString(key))

    public operator fun get(key: Long): CborElement? = content[CborInt(key)]
    public fun getValue(key: Long): CborElement = content.getValue(CborInt(key))

    public operator fun get(key: Int): CborElement? = content[CborInt(key.toLong())]
    public fun getValue(key: Int): CborElement = content.getValue(CborInt(key.toLong()))

}
