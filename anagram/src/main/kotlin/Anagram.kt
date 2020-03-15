class Anagram(val source: String) {

    private val result = mutableSetOf<String>()
    private val sourcePhraseAsList =
        source
            .toList()
            .map {
                it.toLowerCase()
            }
            .sorted()

    fun match(anagrams: Collection<String>): Set<String> {
        for (comparison in anagrams) {
            val comparisonPhraseAsList =
                comparison
                    .toList()
                    .map {
                        it.toLowerCase()
                    }
                    .sorted()

            if (comparison.length == source.length && comparison.toLowerCase() != source.toLowerCase()) {
                result.add(comparison)
            }

            if (comparisonPhraseAsList != sourcePhraseAsList) {
                result.remove(comparison)
            }
        }

        return result
    }

}