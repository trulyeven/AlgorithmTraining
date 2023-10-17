fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val N = readln().toInt()
    for (i in 1..N) {
        val star = "*".repeat(i)
        val space = " ".repeat(2*(N-i))
        println("$star$space$star")
    }
    for (i in N-1 downTo 1) {
        val star = "*".repeat(i)
        val space = " ".repeat(2*(N-i))
        println("$star$space$star")
    }
}