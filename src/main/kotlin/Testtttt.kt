//fun main()
//{
//    val b=10
//    val a=5
//
//    println(return0(10))
//    println(simple0(10,5))
//
//}
//fun simple0(b:Int,a:Int){
//    println(b-a)
//
//}
//fun return0(b:Int):String{
//    return "a+b=${b+b}"
//
//}

fun main() {

    val a = readLine()?.toInt()!!
    val b = readLine()?.toInt()!!

    when (a) {

        1 -> println("Dushanba")
        2 -> println("Seshanba")
        3 -> println("Chorshanba")
        4 -> println("Payshanba")
        5 -> println("Juma")
        6 -> println("Shanba")
        7 -> println("Sunday")
        else -> {
            println("Bunday hafta kuni yok")
        }
    }
    when (b) {

        in 1..10 ->  println("Detiskiy")       }


    }


