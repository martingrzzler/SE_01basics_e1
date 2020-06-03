fun main() {
    val code = getRandomCode()
    var i = 0
    var hint = 0
    var hint2 = 0
    println("Guess the secret Code. The Code is 4 digits long and contains numbers from 1 to 6")
    println(code)
    while (i < 12) {
        println("Guess it: ")

        val guess = readLine()!!.split("").turnIntoIntList()
        val temp = code.toMutableList()

        for (j in 0 until 4) {

            if ( guess[j] == code[j]) {
                hint++
            }
            if (temp.contains(guess[j])) {
                hint2++
                temp.remove(guess[j])
            }
        }

        if (hint == 4) {
            println("Congrats! You win")
            return
        }


        println("You got $hint number(s) correct and in the right position")
        println("$hint2 number(s) of your input are correct")
        hint = 0
        hint2 = 0
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



fun List<String>.turnIntoIntList(): List<Int> {
    return this.filter {
        it != ""
    }.map {
        it.toInt()
    }


}
