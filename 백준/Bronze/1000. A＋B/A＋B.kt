fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (a, b) = readln().split(' ').map { it.toInt() }
    println(a+b)
}