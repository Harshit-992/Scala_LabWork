import java.util.Scanner

object Calculator {
  def add(x:Double, y:Double) : Double =
  {
     x + y
  }
  def sub(x:Double, y:Double) : Double =
  {
    x - y
  }
  def multiply(x:Double, y:Double) : Double =
  {
    x * y
  }
  def div(x:Double, y:Double) : Double =
  {
    x / y
  }
  def main(args: Array[String]) {
    var scanner = new Scanner(System.in);
    println("Enter the first number : ");
    var a = scanner.nextDouble();
    println("Enter the second number : ")
    var b = scanner.nextDouble();
    println("Press 1 for addtion");
    println("Press 2 for subtraction");
    println("Press 3 for multiplication");
    println("Press 4 for division");
    println("Enter the operation:-");
    var sc = scanner.nextInt();
    sc match {
      case 1 => {
        println("Adding Numbers");
        println("Result: " + add(a, b));
      }
      case 2 => {
        println("Subtracting Numbers");
        println("Result: " + sub(a, b));
      }
      case 3 => {
        println("Multiplying Numbers");
        println("Result: " + multiply(a, b));
      }
      case 4 => {
        println("Dividing Numbers");
        println("Result: " + div(a, b));
      }
      case whoa => println("Wrong Input!!!");
    }
  }
}
