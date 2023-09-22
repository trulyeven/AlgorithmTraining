fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    for (i in 1..readln().toInt()) {
        var arr = ArrayList(readln().split(' ').map { it.toInt() })
        var x = if (arr[2]%arr[0] != 0) arr[2]%arr[0] else arr[0]
        var y = if (arr[2]%arr[0] != 0) arr[2] / arr[0] + 1 else arr[2] / arr[0]
        println("%d%02d".format(x,y))
    }
}