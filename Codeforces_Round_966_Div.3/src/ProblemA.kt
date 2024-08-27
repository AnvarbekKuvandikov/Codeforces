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
        if (n in 102 .. 109 || n in 1010 .. 1099){
            println("YES")
        }else{
            println("NO")
        }
    }
}