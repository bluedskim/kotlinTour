fun main() {
//    You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
    val SUPORTTED = setOf("HTTP", "HTTPS", "FTP")
    val requestd = "smtp"
    val issupported : Boolean = requestd.uppercase() in SUPORTTED;
    println("Support for $requestd: $issupported")
}
