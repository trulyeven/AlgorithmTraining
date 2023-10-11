fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var num = 1000 - readln().toInt()
    var cnt = 0
    val arr = arrayOf(500, 100, 50, 10, 5, 1)
    for (i in arr) {
        if (num >= i) {
            cnt += num / i
            num %= i
        }
    }
    println(cnt)
}