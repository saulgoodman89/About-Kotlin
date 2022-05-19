package com.aiden.aboutkotlin.chapter02

class ValVar {
    /*
        코틀린은 변수의 자료형을 지정하지 않아도 추정하여 정한다.
     */
    fun main() {
        val number = 10
        var language = "Korean"
        val secondNumber : Int = 20
        language = "English"

        println("number: $number")
        println("language : $language")
        println("secondNumber : $secondNumber" )
    }
}