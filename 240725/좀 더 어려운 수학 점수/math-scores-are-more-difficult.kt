fun main() {
    var input = readLine()?.trim() ?: ""    
    val a = if (input.isNotEmpty()) {
        input.split(" ").map { it.toInt() }.toIntArray()
    } else intArrayOf(0, 0)
    
    input = readLine()?.trim() ?: ""    
    val b = if (input.isNotEmpty()) {
        input.split(" ").map { it.toInt() }.toIntArray()
    } else intArrayOf(0, 0)
    
    val result = when {
        a[0] > b[0] -> "A"
        a[0] < b[0] -> "B"
        a[1] > b[1] -> "A"
        else -> "B"
    }

    println(result)
}