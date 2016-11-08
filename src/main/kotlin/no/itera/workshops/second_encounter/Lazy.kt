package no.itera.workshops.second_encounter

class Lazy(val initializer: () -> Int) {
    val lazy: Int
        get() {
            // Use the initializer function
            TODO()
        }

    // Read more: http://kotlinlang.org/docs/reference/delegated-properties.html#lazy
    val lazyBy: Int by lazy {
        // Use the initializer function
        TODO()
    }
}