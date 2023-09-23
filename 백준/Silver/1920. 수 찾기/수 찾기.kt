fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var n = readln().toInt()
    val arr = readln().split(' ').map { it.toInt() }.toSet()
    var m = readln().toInt()
    val srh = readln().split(' ').map { it.toInt() }
    for (i in srh) {
        println(if (arr.contains(i)) 1 else 0)
    }
}