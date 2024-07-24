import kotlin.math.max

fun main(){
    val input = readLine()

    if (input != null) {
        val tokens = input.split(" ")
        var maxValue = -1000
        for (token in tokens) {            
            try {
                val temp = token.trim().toInt()
                maxValue = max(temp, maxValue)
            } catch (e: NumberFormatException) {
                println("유효한 숫자를 입력해야 합니다: $token")
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        println(maxValue)
    } else {
        println("입력이 유효하지 않습니다.")
    }

}