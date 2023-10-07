fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var arr = ArrayList<Int>()
    for (i in 1..5) {
        var x = readln().toInt()
        if (x < 40) x = 40
        arr.add(x)
    }
    println(arr.sum()/5)
}