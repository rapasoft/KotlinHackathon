package no.itera.workshops.third_episode

import java.util.*

// TODO: Make this compile

interface Generator<T> {
    fun next() : T
}

class Generators {
    companion object {
        val generators: ArrayList<Generator<Any>> = arrayListOf()
    }

    fun addStringGenerator(generator: Generator<String>) {
//        TODO: Does not compile:
//        generators.add(generator)
    }

    fun addIntegerGenerator(generator: Generator<Int>) {
//        TODO: Does not compile
//        generators.add(generator)
    }
}

fun consumer(list: ArrayList<String>) {
    list.add("String")

    print(list)
}

fun main(args: Array<String>) {
//    TODO: Does not compile
//    consumer(arrayListOf(1, 2, 3, 4, 5))
}