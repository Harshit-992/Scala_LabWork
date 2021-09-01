import java.util.Scanner;

object Add {


  def main(args: Array[String]) {
    var scanner = new Scanner(System.in);
    println("****Mutable Values using var****");
    println("Enter the first number : ");
    var a = scanner.nextInt();
    println("Enter the second number : ");
    var b = scanner.nextInt();
    a=a+b;
    println("The Result of mutable values is : "+a);
    println("****Immutable Values using val****");
    println("Enter the first number : ");
    val c = scanner.nextInt();
    println("Enter the second number : ");
    val d = scanner.nextInt();
   // c=c+d;
    println("The Result of immutable values is : "+c);

  }
}