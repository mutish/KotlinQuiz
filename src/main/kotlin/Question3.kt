// Palindrome test

fun main(){
    fun isPalindrome(str: String): Boolean {
        val reversed = str.reversed()
        return str == reversed
    }
    val str1 = "tacocat"
    val str2 = "civic"
    val str3 = "key"

    val isPalindrome1 = isPalindrome(str1)
    val isPalindrome2 = isPalindrome(str2)
    val isPalindrome3 = isPalindrome(str3)
    println(isPalindrome1)
    println(isPalindrome2)
    println(isPalindrome3)


}
