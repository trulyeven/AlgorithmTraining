fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var (x, y, z) = readln().split(' ').map { it.toLong() }
    var result = 1L
    var base = x % z
    var exp = y
    while (exp > 0) {
        if (exp % 2 == 1L) {
            result = (result * base) % z
        }
        base = (base * base) % z
        exp /= 2
    }
    println(result)
}