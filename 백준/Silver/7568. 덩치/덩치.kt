fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var arr = arrayListOf<ArrayList<Int>>()
    for (i in 1..readln().toInt()) {
        arr.add(ArrayList(readln().split(' ').map { it.toInt() }))
    }
    var cnt = arrayListOf<Int>()
    for (i in arr) {
        var co = 1
        for (j in arr) {
            if (j[0] > i[0] && j[1] > i[1]) {
                co++
            }
        }
        cnt.add(co)
    }
    print(cnt.joinToString(" "))
}