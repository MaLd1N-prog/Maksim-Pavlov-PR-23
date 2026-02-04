fun main(){try{
    var num:Int
    println("введите цифру:")
    num = readln()!!.toInt()
    if (num>=0 && num<=9) {
        when (num) {
            0 -> println("Ноль")
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
        }
    }
    else{
        println("Введите цифру в диапазоне от 0 до 9!")
    }
}catch (e:NumberFormatException){
    println("невереный формат")
}
}