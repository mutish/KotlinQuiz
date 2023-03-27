// get a character in a string

fun main() {
    fun Astrings(list: List<String>): List<String> {
        val result = mutableListOf<String>()
        for (str in list) {
            if (str.contains('a')) {
                result.add(str)
            }
        }
        return result
    }
    val list = listOf("orange", "banana", "cherry", "date", "sugar", "hello")
    val result = Astrings(list)
    println(result)

}
