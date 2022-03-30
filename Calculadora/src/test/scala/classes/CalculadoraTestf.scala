package classes

import org.specs2.mutable.Specification
class CalculadoraTestf extends Specification {
  val calculadora = new Calculadora()

  "Calculadora" should {

    "multiplicacao" in {
      val result = calculadora.multiplicacao(1, 1)
      result === 1
    }

    "divisao" in {
      val result = calculadora.divisao(1, 1)
      result === 1
    }

    "soma" in {
      val result = calculadora.soma(1, 1)
      result === 1
    }

    "sub" in {
      val result = calculadora.sub(1, 1)
      result === 1
    }

    "$div" in {
      val result = calculadora.$div(1, 1)
      result === 1
    }

    "$minus" in {
      val result = calculadora.$minus
      result === null
    }

    "$plus" in {
      val result = calculadora.$plus
      result === null
    }

    "$times" in {
      val result = calculadora.$times
      result === null
    }

  }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme