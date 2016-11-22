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
        generators.add(generator)
    }

    fun addIntegerGenerator(generator: Generator<Int>) {
        generators.add(generator)
    }
}

fun consumer(list: ArrayList<String>) {
    list.add("String")

    print(list)
}

fun main(args: Array<String>) {
    consumer(arrayListOf(1, 2, 3, 4, 5))
}