package no.itera.workshops.first_blood

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.hasElement
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.reflect.KProperty1
import kotlin.reflect.memberProperties

class DataClassesSpec : Spek({
    fun <T> toString(properties: Collection<KProperty1<T, *>>) = properties.map { it.name }
    fun <T> typeOf(properties: Collection<KProperty1<T, *>>, name: String): String =
            properties.first { it.name == name }.returnType.toString()

    describe("Person") {
        describe("properties") {
            it("should have string firstName property") {
                assertThat(toString(Person::class.memberProperties), hasElement("firstName"))
                assertThat(typeOf(Person::class.memberProperties, "firstName"), equalTo(String::class.qualifiedName))
            }
            it("should have string lastName property") {
                assertThat(toString(Person::class.memberProperties), hasElement("lastName"))
                assertThat(typeOf(Person::class.memberProperties, "lastName"), equalTo(String::class.qualifiedName))
            }
            it("should have integer age property") {
                assertThat(toString(Person::class.memberProperties), hasElement("age"))
                assertThat(typeOf(Person::class.memberProperties, "age"), equalTo(Int::class.qualifiedName))
            }
            it("should have list of hobbies property") {
                assertThat(toString(Person::class.memberProperties), hasElement("hobbies"))
                assertThat(
                        typeOf(Person::class.memberProperties, "hobbies"),
                        com.natpryce.hamkrest.contains(List::class.qualifiedName!!.toRegex())
                )
            }
        }
    }
})
