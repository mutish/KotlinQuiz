// Second-Largest number in a set of numbers
fun main(){
    fun SecondLargest(numbers: List<Int>): Int? {
        val distinctNumbers = numbers.toSet()
        return distinctNumbers.sortedDescending().getOrNull(1)
    }
    val numbers = listOf(1,3,5,8,9,5)
    val result = SecondLargest(numbers)
    println(result)


}