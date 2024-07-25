fun main(){
    val n = readLine()?.trim()?.toInt()
    var cnt = 0

    for(year in 1..n!!){
        if(year % 4 == 0) cnt++
        if(year % 100 == 0 && year % 400 != 0) cnt--
    }

    println(cnt)
}