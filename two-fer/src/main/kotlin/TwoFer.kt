internal fun twofer(name: String): String {
    return if (name == "") {
        "One for , one for me."
    } else {
        "One for $name, one for me."
    }
}

internal fun twofer(): String {
    return "One for you, one for me."
}