fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val arr = ArrayList(readln().split(' ').map { it.toInt() })
    val result = arr[0] * arr[1] - arr[2]
    println(if (result < 0) 0 else result)
}