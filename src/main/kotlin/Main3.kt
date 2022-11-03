


fun main() {

    val first= intArrayOf(10,20,30,40)
    val ismlar= arrayOf("Xursand","Xursand2","Xursand3")
    val second= intArrayOf(100,200,300,400,500)
    val uchinchi= intArrayOf(100,200,300,400,500)

    val twodimensional=arrayOf(first,second,uchinchi)

    //bunda bir donasini  chiqarish
    println(twodimensional[0][4])

    //bunda hammasini chiqarish
    println(twodimensional.contentDeepToString())

    //hamamsini chiqarish
    for (qator in twodimensional)    {
            for (ustun in qator) {
                print("$ustun ")
            }
        println()
    }

    for (i in ismlar){
        println(i)
    }

    for(sonlar in first){
        println(sonlar)
    }
    for (ism in ismlar){
        println(ism)
    }

    ismlar.forEach {
        println(it)
    }





    for (i in 0 until twodimensional.size){


    }




}