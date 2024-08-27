/**
 *
 * Created by Anvarbek Kuvandikov
 */
private fun nextLn() = readLine()!!
private fun nextInt() = nextLn().toInt()
private fun nextString() = nextLn().toString()
private fun nextStrings() = nextLn().split(" ")
private fun nextInts() = nextStrings().map { it.toInt() }
private fun nextLongs() = nextStrings().map { it.toLong()}
fun main() {
    val t = nextInt()
    repeat(t){
        val n = nextInt()
        val x = BooleanArray(200000+1){ false }
        val a = nextInts()
        x[a[0]] = true

        for (i in 1 until n) {
            if (x[a[i] -1] == true || x[a[i] + 1] == true) {
                x[a[i]] = true
            }
            else{
                break
            }
        }

        val cnt = x.count { it }
        if (cnt == n )
            println("YES")
        else
            println("NO")
    }
}