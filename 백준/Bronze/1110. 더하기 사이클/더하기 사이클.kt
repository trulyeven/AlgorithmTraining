fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    var n = "%02d".format(readln().toInt()).toInt()
    var arr = arrayOf(n/10,n%10)
    var x = -1
    var cnt = 0

    while (n != x) {
        x = arr[1]*10+(arr[0]+arr[1])%10
        arr[0] = x/10
        arr[1] = x%10
        cnt++
    }
    print(cnt)
}