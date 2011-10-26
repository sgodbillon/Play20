package play.console

object Colors {

  import scala.Console._

  lazy val isANSISupported = {
    !System.getProperty("os.name").toLowerCase.contains("windows")
  }

  def red(str: String) = if (isANSISupported) (RED + str + RESET) else str
  def blue(str: String) = if (isANSISupported) (BLUE + str + RESET) else str
  def cyan(str: String) = if (isANSISupported) (CYAN + str + RESET) else str
  def green(str: String) = if (isANSISupported) (GREEN + str + RESET) else str
  def magenta(str: String) = if (isANSISupported) (MAGENTA + str + RESET) else str
  def white(str: String) = if (isANSISupported) (WHITE + str + RESET) else str
  def black(str: String) = if (isANSISupported) (BLACK + str + RESET) else str
  def yellow(str: String) = if (isANSISupported) (YELLOW + str + RESET) else str

}