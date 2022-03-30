import classes.Calculadora

object TestCalculator {
  def main(args: Array[String]): Unit = {
    val calc = new Calculadora()
    println("The result is "+calc.+(10,10))

    println("The result is "+calc.sub(10,10))
    println("The result is "+calc.multiplicacao(10,10))
    println("The result is "+calc.divisao(10,10))

  }
}
