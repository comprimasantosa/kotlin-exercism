object Pangram {

    fun isPangram(input: String): Boolean {
        var isPangram = false
        val alphabetList = ('a'..'z').toList()
        val inputAsList = input.toLowerCase().toList()

        for (alphabet in inputAsList) {
            isPangram = inputAsList.containsAll(alphabetList)
        }

        return isPangram
    }
}
