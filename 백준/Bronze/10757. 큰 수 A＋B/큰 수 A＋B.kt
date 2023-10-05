import java.math.BigInteger

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (x, y) = readln().split(' ')
    println(BigInteger(x).add(BigInteger(y)))
}