package com.example.hw02.task4

fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    // Part A
    val total = calculateStudyMinutes(3, 25)
    println("Total study time: $total minutes")
    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    // Part B
    for (courses in 1..5) {
        val credits = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $credits")
    }
}