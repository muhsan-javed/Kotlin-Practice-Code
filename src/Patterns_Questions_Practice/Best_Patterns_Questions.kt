package Patterns_Questions_Practice

import java.util.*

//class Best_Patterns_Questions {
//}

fun main() {

    val scanner = Scanner(System.`in`)
    //val n = scanner.nextInt(); // Line Rows
    //val m = scanner.nextInt();

    val n = 10
    val m = 9

    // Q 1
    // outer loop Rows
    for (i in 0 until n) {
        //inner loop Cols
        for (j in 0 until m) {
            print("*")
        }
        println("")
    }


    // Q 2 Hollow Rectangle
    //outer loop
    for (i in 1..n) {
        //inner loop
        for (j in 1..m) {
            //Cell -> (i,j)
            if (i == 1 || j == 1 || i == n || j == m)
                print("*")
            else
                print(" ")
        }
        println()
    }


    // Q 3 Half Pyramid
    // outer loop
    for (i in 1..n) {
        // inner
        for (j in 1..i) {
            print("*")
        }
        println()
    }


    // Q 4 Inverted Half Pyramid
    // outer loop
    for (i in 1..n) {
        //inner
        for (j in 1..i) {
            print("*")
        }
        println()
    }


    // Q 5 Inverted Half Pyramid (rotated by 180 deg)1
    // outer loop Rows
    for (i in 1..n) {
        // inner loop -> space print
        for (j in 1..n - i) {
            print(" ")
        }

        // Inner Loop -> Star print
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    // Q 6 Half Pyramid with Numbers
    // Outer Loop
    for (i in 1..n) {
        // inner
        for (j in 1..i) {
            print("$j  ")
        }
        println()
    }

    // Q 7 Inverted Half Pyramid with Numbers
    // outer loop
    for (i in 1..n) {
        //inner
        for (j in 1..n - i + 1) {
            print("$j  ")
        }
        println()
    }

    // Q 8 Floyd s Triangle
    var number = 1
    for (i in 1..n) {
        //inner
        for (j in 1..i) {
            print("$number ")
            number++
        }
        println()
    }

    // Q 9  0-1 Triangle
    // Outer lOop
    for (i in 1..n) {
        //inner
        for (j in 1..i) {
            if ((i + j) % 2 == 0)
                print(1.toString() + " ")
            else
                print(0.toString() + " ")
        }
        println()
    }

}