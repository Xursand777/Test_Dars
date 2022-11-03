





fun main(){
        val list= listOf(1,2,"3")
        val array= arrayOf(1,2,3,"axax")
        val array2= mutableListOf<String>()
        val array3= intArrayOf()
        val arraylist= arrayListOf<Int>()
        val array4= IntArray(10){i->i*2}
        val array5= Array(10, { 20 })

        array4.forEach {
               println(it)
       }
}