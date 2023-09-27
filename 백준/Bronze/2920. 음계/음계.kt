fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var arr = ArrayList(readln().split(' ').map { it.toInt() })
    var acd = true
    var dcd = true
    var x :Int
    for (i in 1..arr.size-1) {
        x = arr[i] - arr[i-1]
        if (x == 1 || x == -7) {
            dcd = false
        } else if (x == -1 || x == 7) {
            acd = false
        } else {
            acd = false
            dcd = false
        }
    }
    if (acd) {
        println("ascending")
    } else if (dcd) {
        println("descending")
    } else {
        println("mixed")
    }
}