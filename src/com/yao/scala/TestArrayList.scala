package com.yao.scala

import java.util

/**
  * Created by YaoWang on 2017/9/17.
  */
object TestArrayList {

  def main(args: Array[String]): Unit = {
    var arr = new util.ArrayList[Any]
    arr.add(123)
    arr.add("gaga")
    println(arr)
    val it = arr.iterator()
    while(it.hasNext) {
      println(it.next())
    }
  }

}
