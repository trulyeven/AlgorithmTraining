fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (x, y) = readln().split(' ').map { it.toInt() }
    println(GCD(x, y))
    println(LCM(x, y))
}

fun GCD(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}

fun LCM(a: Int, b: Int): Int {
    return a * b / GCD(a, b)
}