fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var a: Int = 64
    var x = readln().toInt()
    var cnt: Int = 0

    while (x != 0) {
        while (a > x) {
            a /= 2
        }
            x -= a
            cnt += 1
    }
    println(cnt)
}