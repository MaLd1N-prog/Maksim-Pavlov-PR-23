import kotlin.math.sin

fun main(){
    try{
        val x:Double
        println("Введите  число")
        x = readln()!!.toDouble()
        val result = when{
            x>1.1 -> 9 - x
            x< -1.1 -> sin( 3*x)/(x*x*x*x+1)
            else -> println("Нету такого диапазона")

        }

        println("Результат F($x):"+ result)
    }catch (e:NumberFormatException){
        println("невереный формат")

    }
}
