fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val mat = mutableListOf<MutableList<Int>>()
    mat.add(MutableList<Int>(15, {i -> i + 1}))
    for (j in 0..14) {
    mat.add(MutableList<Int>(15, {i -> mat[j].take(i + 1).sum()}))
    }
    for (i in 1..readln().toInt()) {
        val x = readln().toInt()
        val y = readln().toInt()-1
        println(mat[x][y])
    }
}