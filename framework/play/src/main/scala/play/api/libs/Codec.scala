package play.api.libs

/**
 * Utilities for Codec operations.
 */
object Codec {

  /**
   * Compute the SHA-1 of a byte array.
   *
   * @param bytes The data to compute.
   * @return SHA-1 encoded as Hex String.
   */
  def sha1(bytes: Array[Byte]): String = {
    import java.security.MessageDigest
    val digest = MessageDigest.getInstance("SHA-1")
    digest.reset()
    digest.update(bytes)
    hex(digest.digest())
  }

  /**
   * Compute the SHA-1 of a String.
   *
   * @param text The text to compute.
   * @return SHA-1 encoded as Hex String.
   */
  def sha1(text: String): String = sha1(text.getBytes)

  /**
   * Converts a byte array into a String denoting a hexadecimal representation
   */
  def hex(array: Array[Byte]): String = array.map(0xFF & _).map { "%02x".format(_) }.foldLeft("") { _ + _ }
}