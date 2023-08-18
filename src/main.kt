interface Roamable {
  fun roam()
}

class Vehicle : Roamable {
  override fun roam() {
    println("The Vehicle is roaming")
  }
}

abstract class Animal : Roamable {
  abstract val image: String
  abstract val food: String
  abstract val habitat: String
  var hunger = 10

  abstract fun makeNoise()

  abstract fun eat()

  override fun roam() {
    println("The Animal is roaming")
  }

  fun sleep() {
    println("The Animal is sleeping")
  }
}

class Hippo : Animal() {
  override val image = "hippo.jpg"
  override val food = "grass"
  override val habitat = "water"

  override fun makeNoise() {
    println("Grunt! Grunt!")
  }

  override fun eat() {
    println("The Hippo is eating $food")
  }
}

abstract class Canine : Animal() {
  override fun roam() {
    println("The Canine is roaming")
  }
}

fun main() {
  println("Hello")
}
