fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    var x: Int = 1
    for (i in 1..3) {
        x *= readln().toInt()
    }
    var a = x.toString()
    var arr = arrayOf(0,0,0,0,0,0,0,0,0,0)
    for (i in a) {
        arr[Character.getNumericValue(i)] += 1
    }
    for (i in arr) println(i)
}