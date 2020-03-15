object Raindrops {

    fun convert(n: Int): String {
        val raindropSpeak = StringBuilder().apply {
            if (n % 3 == 0) append("Pling")
            if (n % 5 == 0) append("Plang")
            if (n % 7 == 0) append("Plong")
        }

        if (raindropSpeak.isEmpty()) raindropSpeak.append("$n")

        return raindropSpeak.toString()
    }

}
