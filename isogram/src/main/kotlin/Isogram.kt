object Isogram {

    fun isIsogram(input: String): Boolean {
        val word = input
            .toLowerCase()
            .filter { it.isLetter() }

        val wordAsList = word.toList()
        val wordAsSet = word.toSet()

        return wordAsList.size == wordAsSet.size
    }
}