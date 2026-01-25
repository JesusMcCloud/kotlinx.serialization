@file:Suppress("unused")
@file:OptIn(ExperimentalUnsignedTypes::class)

package kotlinx.serialization.cbor

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.cbor.internal.CborArraySerializer



/**
 * Class representing CBOR array consisting of CBOR elements.
 *
 * Since this class also implements [List] interface, you can use
 * traditional methods like [List.get] or [List.size] to obtain CBOR elements.
 */
@Serializable(with = CborArraySerializer::class)
@ExperimentalSerializationApi
public class CborArray(
    private val content: List<CborElement>,
    vararg tags: ULong
) : CborElement(tags), List<CborElement> by content {

    public override fun equals(other: Any?): Boolean =
        other is CborArray && other.content == content && other.tags.contentEquals(tags)

    public override fun hashCode(): Int = content.hashCode() * 31 + tags.contentHashCode()

    override fun toString(): String {
        return "CborArray(" +
            "tags=${tags.joinToString(prefix = "[", postfix = "]")}, " +
            "content=$content" +
            ")"
    }

}
