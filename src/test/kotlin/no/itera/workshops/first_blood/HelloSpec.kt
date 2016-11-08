package no.itera.workshops.first_blood

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class HelloSpec : Spek({
    describe("Hello") {
        val hello = Hello()

        describe(".present()") {
            it("should greet 'Hello ...' using selected name") {
                assertThat(hello.present("world"), equalTo("Hello world"))
                assertThat(hello.present("Kotlin"), equalTo("Hello Kotlin"))
            }

            it("should just say 'Hello' if no name is provided") {
                assertThat(hello.present(), equalTo("Hello"))
            }

            it("should just say 'Hello' if empty name is provided") {
                assertThat(hello.present(""), equalTo("Hello"))
            }
        }
    }
})
