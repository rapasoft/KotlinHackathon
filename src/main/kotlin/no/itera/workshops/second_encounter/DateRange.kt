package no.itera.workshops.second_encounter

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }

    // Use ClosedRange interface
//    operator fun rangeTo(other: MyDate) = TODO()
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    TODO()
}