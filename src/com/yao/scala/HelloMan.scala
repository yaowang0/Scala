package com.yao.scala

/**
  *
  */
object HelloMan {

  def main(args: Array[String]): Unit = {

    println("Hello Man")

  }

  def max1(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  def max2(x: Int, y: Int) = {
    if (x > y) x else y
  }

  def max3(x: Int, y: Int) = if (x > y) x else y
}