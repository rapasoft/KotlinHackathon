package no.itera.workshops.second_encounter

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

class DateRangeSpec : Spek({
    describe("MyDate") {
        describe(".rangeTo()") {
            it("should check if MyDate fits in interval") {
                assertThat(checkInRange(MyDate(2016, 11, 23), MyDate(2016, 11, 1), MyDate(2016, 11, 30)), equalTo(true))
            }
        }
    }
})