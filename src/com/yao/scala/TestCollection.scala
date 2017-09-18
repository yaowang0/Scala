package com.yao.scala

/**
  * Created by YaoWang on 2017/9/17.
  */
object TestCollection {
  def main(args: Array[String]): Unit = {

    var t = List(1, 2, 3, 4, 5)
//    println(t(2))

    //map 个位置相加 函数编程
//    println(t.map(a => {println(a); a + 2}))
//    println(t.map(_ + 2))

    //添加元素
    var t2 = t.+:("test")
//    println(t2)
//    t2 = t::6::Nil
//    println(t2)

//    t2.foreach(t=>println(t))

//    println(t.reduce((x, y) => {x + y}))
//    println(t.reduce((_ + _)))

    val tuple1 = (1, 2, 3, 4, 5)
    println(tuple1._1)
  }


}
