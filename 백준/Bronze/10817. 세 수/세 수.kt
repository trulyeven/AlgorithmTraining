fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var num = ArrayList(readln().split(' ').map { it.toInt() })
    print(num.sorted()[1])
}