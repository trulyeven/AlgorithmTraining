fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val arr = arrayListOf(1,2,4)
    for (i in 3..9) {
        arr.add(arr[i-1] + arr[i-2] + arr[i-3])
    }
    repeat(n) {
        println(arr[readln().toInt()-1])
    }
}