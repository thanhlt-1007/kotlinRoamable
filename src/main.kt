interface Roamable {
  fun roam()
}

class Vehicle : Roamable {
  override fun roam() {
    println("The Vehicle is roaming")
  }
}

fun main() {
  println("Hello")
}
