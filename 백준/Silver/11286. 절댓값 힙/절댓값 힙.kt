import kotlin.math.*
import java.util.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pq = PriorityQueue<Int> { a, b -> if (abs(a) == abs(b)) a - b else abs(a) - abs(b) }

    for (i in 0 until n) {
        val x = readLine().toInt()
        if (x == 0) {
            if (pq.isEmpty()) {
                println(0)
            } else {
                val min = pq.poll()
                println(min)
            }
        } else {
            pq.add(x)
        }
    }
}