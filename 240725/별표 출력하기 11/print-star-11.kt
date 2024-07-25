fun main(){
    val input = readLine()?.trim()?.toInt()
    val n = (input!!*2+1)
    val st1 = StringBuffer()
    val st2 = StringBuffer()
    for(i in 1..n){
        st1.append("* ")
        if(i%2==1){
            st2.append("* ")
        }else{
            st2.append("  ")
        }
    }

    for(i in 1..n){
        if(i%2==1){
            println(st1.toString().trim())
        }else{
            println(st2.toString().trim())           
        }
    }
}