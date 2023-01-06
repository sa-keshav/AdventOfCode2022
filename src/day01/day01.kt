package day01

import readInput

fun part1(input: List<String>): Int = calculateCalorieSums(input).max()

fun part2(input: List<String>): Int = calculateCalorieSums(input).sorted().takeLast(3).sum()

private fun calculateCalorieSums(input: List<String>): MutableList<Int> {

    var sum = 0
    val calorieSums: MutableList<Int> = mutableListOf()
    for (i in input) {
        if (i.isEmpty()) {
            calorieSums.add(sum)
            sum = 0
            continue
        }
        sum += i.toInt()
    }
    calorieSums.add(sum) // for the last elf calories
    return calorieSums
}


fun main() {
    // test if implementation meets criteria from the description:
    val testInput = readInput("day01/day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("day01/day01")
    println(part1(input))
    println(part2(input))
}