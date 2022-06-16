package second_edition.ch7

object Ex5 extends App {
  val employee = new Employee
//  employee.giveRaise - inaccessible from this package
  print("It's not very useful because a 'second_edition' is very often parent package.")
}

object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    class Employee {
        private var salary = 0.0

        private[second_edition] def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
        }
      }
