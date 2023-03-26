// sum of even numbers in a list

fun main(){
    fun Evensum(numbers: List<Int>): Int {
        var sum = 0
        for (number in numbers) {
            if (number % 2 == 0) {
                sum += number
            }
        }
        return sum
    }
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEven = Evensum(numbers)
    println("the sum of even numbers is $sumOfEven")


}