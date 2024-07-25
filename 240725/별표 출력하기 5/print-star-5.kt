fun main(){
    val input = readLine()?.trim()?.toInt()

    for(n in input!! downTo 1){
        var st = StringBuffer()
        repeat(n){
            st.append("*")
        }
        val term = st.toString()

        st = StringBuffer()
        repeat(n){
            st.append(term)
            st.append(" ")   
        }

        println(st.toString().trim())
    }
}