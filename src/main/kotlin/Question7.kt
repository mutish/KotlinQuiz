// find the longest string

fun main(){
    fun LongestString(examplelist: List<String>): String? {
        return examplelist.maxByOrNull { it.length }
    }
    val list = listOf("dog", "needle", "palindrome", "cate")
    val result = LongestString(list)
    println(result)


}