import java.util.Scanner

fun main(args: Array<String>) {
    println("please enter the size of list of names : ")
    val sc = Scanner(System.`in`)
    val myList = mutableListOf<String>()
    var iterations = sc.nextInt()
    sc.nextLine()
    while (iterations > 0) {
        println("please enter the name : ")
        val userinput = sc.nextLine()
        if (userinput.contains('A', ignoreCase = false ))
            myList.add(userinput.uppercase())
        else if (userinput.contains('M', ignoreCase = false ))
            myList.add(userinput.uppercase())
        else myList.add(userinput)

        iterations--
    }
    println(myList)
}