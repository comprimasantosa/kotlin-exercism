fun transcribeToRna(dna: String): String {
    val rna = StringBuilder().apply {
        for (letter in dna) {
            when (letter) {
                'G' -> append('C')
                'C' -> append('G')
                'T' -> append('A')
                'A' -> append('U')
                else -> append(letter)
            }
        }
    }

    return rna.toString()
}