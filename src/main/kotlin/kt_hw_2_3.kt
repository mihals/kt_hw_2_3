package ru.netology

fun main() {
    val isMeloman: Boolean = true
    val previosSum: Int = 10_000
    var checkValue: Int = 500

    if (previosSum >= 10_001) {
        checkValue = (checkValue * 0.95).toInt()
    } else if (previosSum >= 1_001) {
        checkValue = checkValue - 100
    }

    if (isMeloman) checkValue = (checkValue * 0.99).toInt()

    println("Сумма покупки $checkValue")
}