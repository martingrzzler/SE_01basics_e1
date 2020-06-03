class CodeBreaker {

    fun getAllPossible(): List<List<Int>> {
        var i = mutableListOf(1,1,1,1)
        var j = 0
        val all = mutableListOf<MutableList<Int>>()
        while (j < 1080) {
            println(i)
            all.add(i)
            i[3]++
            if (i[3] == 6 && i[2] != 6) {
                println(i)
                all.add(i)
                i[3] = 1
                i[2]++
            } else if (i[2] == 6 && i[3] == 6 && i[1] != 6) {
                println(i)
                all.add(i)
                i[2] = 1
                i[3] = 1
                i[1]++
            } else if (i[1] == 6 && i[2] == 6 && i[3] == 6) {
                println(i)
                all.add(i)
                i[1] = 1
                i[2] = 1
                i[3] = 1
                i[0]++

            }

            j++


        }
        return all
    }
}