fun main() {
    val likes: Array<Int> = arrayOf(1, 2, 10, 11, 21, 111, 250, 311, 512, 6071)

    for (amount in likes) {
        val amountStr = amount.toString()
        val length = amountStr.length
        var result = ""

        if (amountStr[length - 1] == '1') {
            if (length == 1 || amountStr[length - 2] != '1') {
                result = "человеку"
            }
        }
        if (result.isBlank()) result = "людям"

        println("Понравилось $amount $result")
    }
}