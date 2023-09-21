fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (n, k) = readln().split(' ').map { it.toInt() }
    var arr = arrayListOf<Int>()
    for (i in 1..n) {
        arr.add(readln().toInt())
    }
    var cnt = 0
    for (i in arr.size - 1 downTo 0) {
        if (k / arr[i] > 0) {
            cnt += k / arr[i]
            k %= arr[i]
        }
    }
    println(cnt)
}