fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    repeat (3) {
        val lst = readln().split(' ').map { it.toInt() }
        val cnt = lst.count { it == 0}
        when (cnt) {
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
            0 -> println("E")
        }
    }
}