class CodeBreaker {

    fun getAllPossible() {
        val i = mutableListOf(1,1,1,1)
        val all = mutableListOf<MutableList<Int>>()
        while (!i.toIntArray().contentEquals(intArrayOf(6,6,6,6))) {
            i[3]++
            all.add(i)
            if (i[3] == 6) {
                i[3] = 1
                i[2]++

                if (i[2] == 6) {
                    i[2] = 1
                    i[1]++
                }

            }



        }
    }
}