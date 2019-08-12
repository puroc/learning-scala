package oo

object Season extends Enumeration {
  val SPRING = Value(0, "spring")
  val SUMMER = Value(1, "summer")
  val AUTUMN = Value(2, "autumn")
  val WINTER = Value(3, "winter")

  def main(args: Array[String]): Unit = {
    println(Season(0))
    println(Season.withName("spring"))
    for (ele <- Season.values) println(ele)
  }

}

