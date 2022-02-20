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
    println()
    //Iterating a list.
    for (i in 1..10) {  // includes 10
        print(i)
    }
    println()
    for (i in 1 until 10) { //does not include 10
        print(i)
    }
    println()
    for (x in 2..10 step 2) { //step by step looping, includes 2 and 10
        print(x)
    }
    println()

    //null safety.
    print("Enter a message: ")
    /*
    val s = readLine()
    println(s?.length) //prints the length of s if s is not null.
     */
    println(transform(("Red")))
    //assigning values in if statements.
    val x = 2
    val y = if (x == 1) {
        "one"
    } else if (x == 2) {
        "two"
    } else {
        "other"
    }
    println(y)
    //swapping values
    var a = 1
    var b = 2
    a = b.also { b = a }
    println("a: $a b:$b")
}
//return on when conditioning. Returns special values for each color.
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value") //throws an exception in the else statement.

    }
}