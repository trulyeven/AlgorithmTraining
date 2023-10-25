fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val arr = readln().toCharArray().sortedDescending()
    if (arr.sumOf { it.toString().toInt() } % 3 == 0) {
        val zeroCnt = arr.count { it == '0' }
        if (zeroCnt > 0) {
            val result = arr.subList(0, arr.size - zeroCnt).joinToString("")
            println("${result}${"0".repeat(zeroCnt)}")
        } else {
            println("-1")
        }
    } else {
        println("-1")
    }
}