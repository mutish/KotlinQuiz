fun main(){
    fun mysum(a:Int, b:Int) : Int{
        var sum = 0
        for(x in a..b)  // for loop
            sum += x

        return sum
    }

    val sum = mysum(5,10)
    println(sum)

}