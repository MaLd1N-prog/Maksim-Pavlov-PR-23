
fun main(){
    try{
        var name:Double
        println("введите им€:")
        var n = 1
        name = readln()!!.toDouble()
        name = name/7
        println("привет, мен€ зовут %.2f".format(name))
    }catch (e:NumberFormatException){
        println("невереный формат")
    }
}