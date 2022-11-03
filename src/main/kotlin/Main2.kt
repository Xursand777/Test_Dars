import java.util.Timer


fun main(){

   val array1:Array<Int> = arrayOf(59,65,74,52,32,19,77)
    aralshtirish(array1)
    array1.forEach {
        println(it)
    }
    println(qidirish(array1,75))


}

fun qidirish(array: Array<Int>, x:Int):Boolean{
    val bormi=array.contains(x)
    return bormi
}

fun aralshtirish(array:Array<Int>):Array<Int>{
    array.shuffle()
    return array
}