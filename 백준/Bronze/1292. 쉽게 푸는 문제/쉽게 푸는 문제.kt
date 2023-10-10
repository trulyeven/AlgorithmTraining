fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (a, b) = readln().split(' ').map { it.toInt() }
    val arr = ArrayList<Int>()
    for (i in 1..b) {
        for (j in 1..i) {
            if (arr.size == b) {
                break
            }
            arr.add(i)
        }
    }
    println(arr.subList(a-1, b).sum())
}