fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var x = 1
    for (i in 0..readln().toInt()) {
        if (i != 0) x *= i
    }
    println(x)
}