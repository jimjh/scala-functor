package com.jimjh.scala

object Main {
  type Tuple[A] = (A, A)
  import com.jimjh.scala.ToFunctorOps._

  implicit val TupleFunctor = new Functor[Tuple] {
    /** Lift `f` into `T` and apply to `fa`. */
    def map[A, B](fa: Tuple[A])(f: A => B): Tuple[B] = (f(fa._1), f(fa._2))
  }

  def main(args: Array[String]) {
    val x: Tuple[Int] = (1, 2)
    println(x.map { _ + 1 })
  }
}
