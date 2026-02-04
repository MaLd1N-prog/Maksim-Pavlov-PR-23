fun main() {
    try {
        var num: Int
        println("введите возраст:")
        num = readln()!!.toInt()
        if (num >= 0 && num <= 125) {
            when (num) {
                in 0..2 -> println("Младенец")
                in 3..7 -> println("Ребенок")
                in 7..18 -> println("Подросток")
                in 18..50 -> println("Взрослый")
                in 50..125 -> println("Старый")

            }
        } else {
            println("Да вы бессмертный, пережили больше 125!Ватафа")
        }
    } catch (e: NumberFormatException) {
        println("невереный формат")
    }
}
