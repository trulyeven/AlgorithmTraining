import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack
import java.util.StringTokenizer

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        when (st.nextToken()) {
            "push" -> stack.push(st.nextToken().toInt())
            "pop" -> if (stack.isEmpty()) bw.write("-1\n") else bw.write("${stack.pop()}\n")
            "size" -> bw.write("${stack.size}\n")
            "empty" -> if (stack.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "top" -> if (stack.isEmpty()) bw.write("-1\n") else bw.write("${stack.peek()}\n")
        }
    }
    br.close()
    bw.close()
}