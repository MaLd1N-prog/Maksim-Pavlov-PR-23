import kotlin.math.sin

fun main(){
    try {
        val a: Int
        println("Введите трехзначное число")
        a = readln()!!.toInt()
val LastDigit = a%10
            val result = when (
               LastDigit % 2 == 0){
                true ->"Не верно,четная"
                 false ->"Верно, не четная"
            }
                println("Результат:" + result +"($LastDigit)")


    }catch (e:NumberFormatException){
            println("невереный формат")

    }
}
