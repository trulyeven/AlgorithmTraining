import kotlin.math.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val r = readln().toDouble()
    println("%05f".format(PI*r*r))
    println("%05f".format(2*r*r))
}