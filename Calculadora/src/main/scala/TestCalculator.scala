import classes.Calculadora

object TestCalculator {
  def main(args: Array[String]): Unit = {
    val calc = new Calculadora()
    println("The result is "+calc.soma(5,7))
  }
}
