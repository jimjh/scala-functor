package com.jimjh.scala

/** Tiny example of a functor.
  *
  * Functors map values of type A to values of type B.
  *
  * `T[_]` is a type parameter, that is also a polymorphic type constructor.
  *
  * `self` is used for structural typing, which means that "anything that mixes in the the Functor trait must
  * implement a map method with the given signature."
  *
  * @see https://github.com/scalaz/scalaz/blob/scalaz-seven/core/src/main/scala/scalaz/Functor.scala
  * @see http://eed3si9n.com/learning-scalaz/Functor.html
  */
trait Functor[T[_]] { self =>
  /** Lift `f` into `T` and apply to `fa`. */
  def map[A, B](fa: T[A])(f: A => B): T[B]
  // map category A to B while preserving structure
  // e.g. T could be a data structure containing values of type A, or a function that takes values of type A
}