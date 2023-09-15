fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    for (i in 1..readln().toInt()) {
        var arr = ArrayList(readln().split(' ').map { it.toInt() })
        var cnt = 0.0
        arr.removeAt(0)
        arr.forEach {
            if (it > arr.sum()/arr.size) {
                cnt++
            }
        }
        var x = String.format("%.3f", cnt/arr.size.toFloat()*100)
        println("$x%")
    }
}