package classes

import scala.util.Try

class Calculadora {
  def soma(x: Int, y: Int): Int = x + y

  def multiplicacao(x: Int, y: Int): Int = x * y

  def sub(x: Int, y: Int): Int = x - y

  def divisao(x: Int, y: Int): Int = Try(x / y).getOrElse(0)

  def + : (Int, Int) => Int = soma

  def - : (Int, Int) => Int = sub

  def * : (Int, Int) => Int = multiplicacao

  def /(a: Int, b: Int): Int = divisao(a, b)

}
