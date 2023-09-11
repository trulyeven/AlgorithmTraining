fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var n = readln().toInt()
    for (i in n downTo 1) println(i)
}