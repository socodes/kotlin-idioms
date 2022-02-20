fun main(args: Array<String>) {
    var list = listOf<Int>(-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9)
    //there are 2 ways to use filter function in a list.
    //first
    val positives = list.filter { x -> x>0 }
    println(positives)
    //second
    val _positives = list.filter { it > 0 }
    println(_positives)

    //Check the presence of an element in a list
    if (1 in list) {
        println(true)
    }
    if (1 !in list) {
        println(false)
    }
    //when conditioning replaces switch operator in Java.
    when (list[0]) {
        is Int -> println("Type of element is Int")
        else   -> println("Type is not Int")
    }
    //map is used as a dictionary.
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    //traverse a map
    for ((x, y) in map) {
        print("$x -> $y  ")
    }
}