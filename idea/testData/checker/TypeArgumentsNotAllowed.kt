package foo

open class A<T>

fun <T> f(<warning descr="[UNUSED_PARAMETER] Parameter 't' is never used">t</warning>: T<error descr="[TYPE_ARGUMENTS_NOT_ALLOWED] Type arguments are not allowed for type parameters"><<error descr="[DEBUG] Reference is not resolved to anything, but is not marked unresolved">T</error>></error>) {}

fun <T> use(<warning descr="[UNUSED_PARAMETER] Parameter 'b' is never used">b</warning>: foo<error descr="[TYPE_ARGUMENTS_NOT_ALLOWED] Type arguments are not allowed here"><T></error>.A<T>) {}