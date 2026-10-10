package com.example.hw02.task5

fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()
    print("Exam score: ")
    val exam = readln().toInt()

    // Bagi dengan 2.0 supaya hasilnya Double (tidak membuang desimal)
    val average = (assignment + exam) / 2.0

    val status = if (average >= 60) "Pass" else "Needs improvement"

    println("Average: $average")
    println("Status: $status")
}