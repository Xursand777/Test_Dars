



fun main() {
//    val array1= arrayOf(125,987,365,421,387)
//    array1.sort() //o`sish tartibda saralash
//    array1.reverse()//massiv elementlarini teskari
//
//
//    array1.forEach {
//        println(it)
//    }
//    println("Shuffle fun")
//    array1.shuffle() //elementlarni saralash
//    array1.forEach {
//        println(it)
//    }


//    val names= arrayOf("Abror","Xursand","AbduRahmon","Mansurbek","Ogabek","Jasur","Lazizbek")
//    val names2= names.copyOf() //massivni kopya qiladi
//    names2.shuffle()
//    names2.forEach {
//        println(it)
//    }
//
//    val ehtimoliy_ism=names.random()  //tasodifiy son olish
//    println(ehtimoliy_ism)
    //removeAll()
    //addAll()


//    val array1= arrayOf(20,4,10,5,5,60,100)
//    val bormi:Boolean=array1.contains(5)
//    val index=array1.indexOf(5)
//    println(bormi)
//    println(index)
//
//    array1.forEachIndexed { index, i ->
//        println("$index -> $i")
//    }

    val array1= mutableListOf(1,2,3,10,20,30,100,200,300)
    val array2= mutableListOf(10,20,30,7)
//    array1.addAll(array2)
//    array1.forEach {
//        println(it)
//    }
    println("removeall")

    array1.removeAll(array2)
    array1.forEach {
        println(it)
    }





    saralash(array1)








}

fun saralash(massiv: MutableList<Int>):MutableList<Int>{
    massiv.sort()
    return massiv
}


