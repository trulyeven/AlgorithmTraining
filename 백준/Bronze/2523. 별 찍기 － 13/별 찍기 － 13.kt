import kotlin.math.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    for (i in 1..2*n-1) {
        for (j in 1..n-abs(n-i)) {
            print("*")
        }
        println("")
    }
}