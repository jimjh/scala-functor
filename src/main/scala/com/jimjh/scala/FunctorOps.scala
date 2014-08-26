package com.jimjh.scala

/** Injected operators for Functors.
  */
class FunctorOps[F[_], A](val self: F[A])(implicit val functor: Functor[F]) {
  def map[B](function: A => B): F[B] =
    functor.map(self)(function)
}

object ToFunctorOps {
  implicit def ToFunctorOps[T[_], A](v: T[A])(implicit functor: Functor[T]) =
    new FunctorOps[T, A](v)
}
