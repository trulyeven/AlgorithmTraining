fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var n = readln().toInt()
    var num = ArrayList(readln().split(' ').map { it.toInt() })
    var snum = num.sorted()
    var sum = 0
    for (i in 0..n-1) {
        sum += snum[i]*(n-i)
    }
    print(sum)
}