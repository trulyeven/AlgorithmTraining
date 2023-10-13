import java.util.ArrayDeque

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    repeat(n) {
        val p = readLine()!!
        val x = readLine()
        val input = readLine()!!.trim('[', ']')

        val lst = if (input.isBlank()) {
            emptyList()
        } else {
            input.split(',').map { it.trim().toInt() }
        }

        val deque = ArrayDeque(lst)
        var reverse = false
        var error = false

        for (j in p) {
            when (j) {
                'R' -> reverse = !reverse
                'D' -> {
                    if (deque.isEmpty()) {
                        error = true
                        break
                    }
                    if (reverse) {
                        deque.pollLast()
                    } else {
                        deque.poll()
                    }
                }
            }
        }

        if (error) {
            println("error")
        } else {
            val result = if (reverse) {
                deque.toList().reversed()
            } else {
                deque.toList()
            }
            println(result.joinToString(",", "[", "]"))
        }
    }
}