// Common elements

fun main(){
    fun CommonElements(list1: List<Int>, list2: List<Int>): List<Int> {
        val set1 = list1.toSet()
        val set2 = list2.toSet()
        return set1.intersect(set2).toList() // returns a set containing all elements both contained in this selection and specified...
    }
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4, 5, 6, 7)
    val result = CommonElements(list1, list2)
    println(result)

}