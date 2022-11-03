import java.lang.Math.pow


fun main(){



//    val ikkinidarajasiarray= mutableListOf<Int>()
//    val n= readLine()?.toInt()!!
//    for (i in 0 .. n){
//        var ikkinidarajasi=pow(2.0,i.toDouble())
//       ikkinidarajasiarray.add(ikkinidarajasi.toInt())
//    }
//
//    ikkinidarajasiarray.forEach {
//        println(it)
//    }
//    val array2=IntArray(100){i->i*2+1}
//    array2.forEach {
//        println(it)
//    }
//    val array3=IntArray(100){i->i*2}
//    array3.forEach {
//        println(it)
//    }

//     val array4=IntArray(100){i->i}
//     val array5= array4.filter { i->i>90}
//     array5.forEach {
//        println(it)
//     }


//    val list1= listOf(140,255,70,55,987)


    val n=10
    val d=3
    var a=100

    val list= mutableListOf<Int>()

    for (i in 0 until n){
       list.add(a)
       a*=d
    }
    list.forEach {
        println(it)
    }






}


