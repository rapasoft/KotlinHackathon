package no.itera.workshops.first_blood

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class FunWithCollectionsSpec : Spek({
    describe("List<String>") {
        describe(".concatenate()") {
            it("should concatenate list of string to a single string") {
                val input = listOf("A", "w", "e", "s", "o", "m", "e")

                assertThat(input.concatenate(), equalTo("Awesome"))
            }
        }
    }

    describe("List<Int>") {
        describe(".frequency(number)") {
            it("should return the number of times input number occurred in list") {
                val input = listOf(1, 2, 3, 1, 2, 1)

                assertThat(input.frequency(1), equalTo(3))
                assertThat(input.frequency(2), equalTo(2))
                assertThat(input.frequency(3), equalTo(1))
            }
        }

        describe(".frequencyMap()") {
            it("should return the map containing occurrence for each unique item in list") {
                val input = listOf(1, 2, 3, 1, 2, 1)

                val frequencyMap = input.frequencyMap()

                assertThat(frequencyMap[1], equalTo(3))
                assertThat(frequencyMap[2], equalTo(2))
                assertThat(frequencyMap[3], equalTo(1))
            }
        }
    }
})