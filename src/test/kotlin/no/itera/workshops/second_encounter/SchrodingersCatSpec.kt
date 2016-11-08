package no.itera.workshops.second_encounter

import com.natpryce.hamkrest.Matcher
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.throws
import no.itera.workshops.second_encounter.SchrodingersCat.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class SchrodingersCatSpec : Spek({
    describe("SchrodingersCat") {
        fun `get Cat's State`(schrodingersCat: SchrodingersCat) =
                when (schrodingersCat) {
                    is Dead -> "Cat's dead baby, cat's dead"
                    is Alive -> "Is alive! Hooray"
                    is DeadOrAlive -> "Well, should we just wait?"
                    // TODO remove `else` after refactoring
                    else -> TODO()
                }


        it("can be dead") {
            assertThat(`get Cat's State`(Dead()), equalTo("Cat's dead baby, cat's dead"))
        }

        it("can be alive") {
            assertThat(`get Cat's State`(Alive()), equalTo("Is alive! Hooray"))
        }

        it("can be dead or alive") {
            assertThat(`get Cat's State`(DeadOrAlive()), equalTo("Well, should we just wait?"))
        }

        it("cannot have any other value") {
            // TODO remove after refactoring
            `get Cat's State`(SchrodingersCat())
        }
    }
})