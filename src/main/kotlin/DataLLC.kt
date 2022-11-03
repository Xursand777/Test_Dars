



fun main(){

    val a= arrayOf(10,20,30,40,50,60,70,"Xursand")
    println(a.get(2))  //bir donasini chiqarish
    println("${a.size} bu arrayni uzunligi")

    //hammasni ekranga chiqarish
    for(i in 0 until a.size){
            println("$i -> array ${a.get(i)}")
    }

    val b=listOf(1,2,3,4,5,6,9,"Abror",0)
    println(b.get(0))
    println(b.size)

    for(i in 0 until b.size){
        println("$i -> list ${b.get(i)}")
    }
    b.forEach {
        println(it)
    }

    a.forEachIndexed { traqami, elemnti ->
        println("$traqami - > $elemnti")
    }

    for (elementlari in a){
        println(elementlari)
    }








}





