fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    var x = readln().toInt()
    var cnt: Int = 0

    for (i in 1..x) {
        if (i < 100) {
            cnt++
        } else {
            var a = i.toString()
            if (a[0]-a[1] == a[1]-a[2]) {
                cnt++
            }
        }
    }
    println(cnt)
}