package second_edition.ch7

object Ex2 extends App {
  val m = new com.collection.mutable.HashMap[Int, Int]()
  assert(m.getClass.getPackageName == "ch7.com.collection.mutable")
}
