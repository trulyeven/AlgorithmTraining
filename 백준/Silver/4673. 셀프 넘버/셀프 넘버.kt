fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = 10000
    val lst = MutableList<Int>(n, {i -> i + 1})
    for (i in 1..n) {
        var x = i
        var y = i
        while (x > 0) {
            y += x%10
            x /= 10
        }
        lst.remove(y)
    }
    lst.forEach {println(it)}
}