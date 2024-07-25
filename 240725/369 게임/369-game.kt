fun main(){
    val n = readLine()?.trim()?.toInt()

    val buffer = StringBuffer()

    for(item in 1..n!!){
        val str = item.toString()
        if(str.contains("3") || str.contains("6") || str.contains("9")|| item % 3 == 0){
            buffer.append(0)
        } else{
            buffer.append(item)
        }
        
        buffer.append(" ")
    }

    println(buffer.toString().trim())
}