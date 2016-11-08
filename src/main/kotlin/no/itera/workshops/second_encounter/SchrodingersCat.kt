package no.itera.workshops.second_encounter

/**
 * Define a specific hierarchy of values that can be used for `when` matcher (see test)
 *
 * Only Dead, Alive and DeadOrAlive states are allowed
 */
open class SchrodingersCat {
    class Dead: SchrodingersCat()
    class Alive: SchrodingersCat()
    class DeadOrAlive: SchrodingersCat()
}