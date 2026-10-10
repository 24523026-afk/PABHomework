package task5

import kotlin.math.roundToInt

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    students.maxByOrNull { it.score }
        ?.let { println("Top scorer : ${it.name} (${it.score})") }
        ?: println("Top scorer : -")
    students.minByOrNull { it.score }
        ?.let { println("Low scorer : ${it.name} (${it.score})") }
        ?: println("Low scorer : -")

    val total = students.fold(0) { acc, s -> acc + s.score }
    val average = if (students.isEmpty()) 0.0
    else (total.toDouble() / students.size * 10).roundToInt() / 10.0
    println("Class average: $average")

    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach {
            val status = if (it.score >= 70) "PASS" else "FAIL"
            appendLine("${it.name.padEnd(8)} ${it.score}  $status")
        }
    }
    print(report)
}