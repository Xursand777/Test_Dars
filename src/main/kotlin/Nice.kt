









fun main(){
     val list1= listOf(1000,2)

     val list2= mutableListOf<Int>()
     list2.add(30)
     list2.add(40)
     list2.add(50)
     list2.add(60)
     list2.add(70)

     println(list2.size)
     list2.forEach {
          println(it)
     }

     list2.removeAt(2)
     println("2- element o`chirilgandan keyin")
     list2.forEach {
          println(it)
     }

     println("list2  ga list1 qoshildi")
     list2.addAll(list1)
     list2.forEach {
          println(it)
     }

     println("list2 dan o`chiramiz list1 dagi o`xshash elementlarni")
     list2.removeAll(list1)
     list2.forEach {
          println(it)
     }
     val n=100
     val toq=IntArray(n){i -> i+1}

     toq.forEach {
          if (it%2==1){
               println(it)
          }
     }


}