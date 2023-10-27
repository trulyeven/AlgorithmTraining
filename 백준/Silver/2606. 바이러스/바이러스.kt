import java.util.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val m = readln().toInt()

    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1) { false }

    repeat(m) {
        var (a, b) = readln().split(' ').map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }

    val queue: Queue<Int> = LinkedList()
    queue.offer(1)
    visited[1] = true

    while (queue.isNotEmpty()) {
        val computer = queue.poll()
        for (neighbor in graph[computer]) {
            if (!visited[neighbor]) {
                queue.offer(neighbor)
                visited[neighbor] = true
            }
        }
    }

    val cnt = visited.count { it } - 1
    println(cnt)
}