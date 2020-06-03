import kotlin.reflect.typeOf

fun main() {
    val code = getRandomCode()
    var i = 0
    var hint = 0
    println("Guess the secret Code. The Code is 4 digits long and contains numbers from 1 to 6")
    println(code)
    while (i < 3) {
        println("Guess it: ")

        val guess = readLine()!!.split("")
        val guessIntList = turnIntoIntArray(guess)

        for (j in 0 until 12) {
            if ( guessIntList[j] == code[j]) {
                hint++
            }
        }

        if (hint == 4) {
            println("Congrats! You win")
            return
        }


        println("You got $hint numbers correct")
        hint = 0
        i++
    }

    println("Too Bad! You lose.")
}

fun getRandomCode(): List<Int> {

    val codeList = mutableListOf<Int>()

    for (i in 0 until 4) {
        val temp = (1..6).random()
        codeList.add(temp)
    }

    return codeList
}



fun turnIntoIntArray(list: List<String>): List<Int> {
    val newList = mutableListOf<Int>()
    for (i in list) {
        if (i != "") {
            val temp = i.toInt()
            newList.add(temp)
        }
    }
    return newList
}
