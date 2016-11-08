package no.itera.workshops.second_encounter

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class LazySpec : Spek({
    describe("Lazy") {
        it("should lazily initialize property") {
            var initialized = false
            val lazy = Lazy({ initialized = true; 42})

            assertThat(initialized, equalTo(false))

            val result = lazy.lazy

            assertThat(result, equalTo(42))
            assertThat(initialized, equalTo(true))
        }

        it("should lazily load using lazy() delegate") {
            var initialized = false
            val lazy = Lazy({ initialized = true; 42})

            assertThat(initialized, equalTo(false))

            val result = lazy.lazyBy

            assertThat(result, equalTo(42))
            assertThat(initialized, equalTo(true))
        }
    }
})
