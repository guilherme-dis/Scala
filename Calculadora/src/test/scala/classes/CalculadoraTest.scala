package classes

import org.scalatest.funsuite.AnyFunSuite

class CalculadoraTest extends AnyFunSuite {
  test("Testa soma"){
    assert(new Calculadora().soma(10,10)==20)

  }
  test("Testa subtracao"){
    assert(new Calculadora().sub(10,5)==5)
  }
}
