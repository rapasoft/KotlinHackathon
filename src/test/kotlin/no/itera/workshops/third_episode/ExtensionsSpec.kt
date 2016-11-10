package no.itera.workshops.third_episode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class ExtensionsSpec : Spek({

    describe("Any?.isNullOrEmpty()") {
        describe("when called on Any instance") {
            it("should return true if instance is null") {
                assertThat(null.isNullOrEmpty(), equalTo(true))
            }
            it("should return false if instance is not null") {
                assertThat(String().isNullOrEmpty(), equalTo(false))
                assertThat(0.isNullOrEmpty(), equalTo(false))
            }
        }
        describe("when called on Array instance") {
            it("should return true for an empty array") {
                val emptyArray: Array<Int> = arrayOf()
                assertThat(emptyArray.isNullOrEmpty(), equalTo(true))
            }
            it("should return false for non-empty array") {
                val arrayOfInts = arrayOf(1, 2, 3)
                assertThat(arrayOfInts.isNullOrEmpty(), equalTo(false))

                val arrayOfStrings = arrayOf("1", "2", "3")
                assertThat(arrayOfStrings.isNullOrEmpty(), equalTo(false))
            }
        }

    }
})