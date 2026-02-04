fun main(){
    try{
    var num1:Int
println("¬ведите 1 число")
        num1 = readln()!!.toInt()
    var num2:Int
    println("¬ведите 2 число")

    num2 = readln()!!.toInt()
    var num =0
    if (num1>num2)
    {
       num=num1+1
    }
    if (num2>num1)
    {
        num =num2+1
    }
    if(num1==num2) {
            num = num1*num1*num1
    }
        println("–езультат:"+ num)
    }catch (e:NumberFormatException){
        println("невереный формат")

    }
}
