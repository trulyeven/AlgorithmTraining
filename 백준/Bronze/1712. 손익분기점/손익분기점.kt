fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var num = ArrayList(readln().split(' ').map { it.toInt() })
    var cnt: Int
    if (num[1] >= num[2]) {
        cnt = -1
    } else {
        cnt = num[0] / (num[2] - num[1]) + 1
    }
    print(cnt)
}