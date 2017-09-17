package com.yao.scala

/**
  * Created by YaoWang on 2017/9/17.
  */
object TestFunc {

  def sayMyName(name: String = "Jake"): Unit = {
    println(name)
  }

  def sumMoreParameters(elem: Int*) = {
    var sum = 0
    for (e <- elem) {
      sum += e
    }
    sum
  }

  def add(a: Int, b: Int) = a + b

  def add2 = add(_: Int, 2)

  def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  def multiply(x: Int)(y: Int) = x * y

  def m2 = multiply(2) _

  //匿名函数
  val t = () => 333

  //:后面是数据类型，c代表传进来的参数
  def testFunc02(c: () => Int) = {
    println(c())
    1000
  }

  val dl = (a: Int) => a + 100

  val testf2 = (x: Int, y: Int) => x * y + 100

  def testf1(callback: (Int, Int) => Int) = {
    println(callback(123, 123))
  }

  def test(): Unit = {
    for (i <- 1.to(100)) {
      println(i)
    }
  }

  def test1(): Unit = {
    for (i <- 1 to 100) {
      println(i)
    }
  }

  def test2(): Unit = {
    for (i <- 1 until 100) {
      println(i)
    }
  }

  def test3(): Unit = {
    for (i <- 0 to 100 if (i % 2) == 0 ) {
      println(i)
    }
  }

  def testMatch(n: Int) = {
    n match {
      case 1 => println("111");n;
      case 2 => println("222");n;
      case _ => println("other");"test"
    }
  }

  def main(args: Array[String]): Unit = {
    println(testMatch(2))
  }



}
