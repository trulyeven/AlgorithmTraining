fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    for (i in 1..readln().toInt()) {
        var x = readln()
        var cnt = 0
        var osum = 0
        for (j in x) {
            if (j == 'O') {
                osum++
            } else {
                osum = 0
            }
            cnt += osum
        }
        println(cnt)
    }
}