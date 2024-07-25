fun main(){
    var checkList = arrayOf(0,0,0,0)
     while (true) {
        val input = readLine()?.trim() ?: ""

        if (input.isEmpty()) {
            break
        }
        val inputs = input.split(" ")
        val flag = inputs[0]
        val temperature = inputs[1]?.toInt()

        when (flag) {
            "Y" -> if(37 <= temperature) checkList[0]++ else checkList[2]++
            "N" -> if(37 <= temperature) checkList[1]++ else checkList[3]++
            else -> null
        }
    }

    if(checkList[0] >= 2) println("E") else println("N")
}