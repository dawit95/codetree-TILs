fun main(){
    val input = readLine()

    try {
        val month = input?.toInt() ?: throw IllegalArgumentException("유효한 숫자를 입력해야 합니다.")
        val days = daysInMonth(month)
        println(days)
    } catch (e: NumberFormatException) {
        println("유효한 숫자를 입력해야 합니다.")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}

fun daysInMonth(month:Int): Int{
    val daysInMonths = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    // 유효한 월인지 확인
    if (month < 1 || month > 12) {
        throw IllegalArgumentException("월은 1에서 12 사이의 값을 입력해야 합니다.")
    }

    return daysInMonths[month-1]
}