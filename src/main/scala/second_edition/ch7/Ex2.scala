package second_edition.ch7

import scala.collection.mutable

object Ex2 extends App {
  val m = new  mutable.HashMap[Int, Int]()
  assert(m.getClass.getPackage.getName == "ch7.com.collection.mutable")
}
