// Removing duplicates in a list of data with duplicated items

fun main(){
    fun Duplicateremove(mynumbers: List<Int>): List<Int> {
        return mynumbers.distinct() // returns a list containing distinct elements only
    }
    val numbers = listOf(1, 2, 3, 2, 4, 3, 5, 1, 3,6,7,5)
    val result = Duplicateremove(numbers)
    println(result)


}
