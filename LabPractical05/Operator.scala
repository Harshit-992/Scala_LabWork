object Operator
{	def arithmeticOperator():Unit =
{	var a=40;
  var b=20;

  println("Addition(a+b) = " + (a+b));
  println("Subtraction(a-b) = " + (a-b));
  println("Multiplication(a*b) = " + (a*b));
  println("Division(a/b) = " + (a/b));
  println("Modulus(a%b) = " + (a%b));
  println("\t");
}
  def relationalOperator() =
  {	var a=78;
    var b=67;

    println("Equality(a==b) = " + (a==b));
    println("Not Equals(a!=b) = " + (a!=b));
    println("Greater Than(a>b) = " + (a>b));
    println("Lesser Than(a<b) = " + (a<b));
    println("Greater Than or Equal To(a>=b) = " + (a>=b));
    println("Lesser Than or Equal To(a<=b) = " + (a<=b));
    println("\t");
  }
  def logicalOperator():Unit =
  {	var c=false;
    var d=true;

    println("Logical Not !(c&&d) = " + !(c&&d));
    println("Logical Or(c||d) = " + (c||d));
    println("Logical And(c&&d) = " + (c&&d));
    println("\t");
  }
  def bitwiseOperator():Unit =
  {	var a:Int = 20;
    var b:Int = 10;
    var c:Int = 0;

    c=a&b;
    println("Bitwise And(a&b) = " + c);

    c=a|b;
    println("Bitwise Or(a|b) = " + c);

    c=a^b;
    println("Bitwise Xor(a^b) = " + c);

    c=a<<3;
    println("Bitwise Left Shift(a<<3) = " + c);

    c=a>>3;
    println("Bitwise Right Shift(a>>3) = " + c);

    c=a>>>4;
    println("Bitwise Shift Right(a>>>4) = " + c);
    println("\t");
  }
  def assignmentOperator():Unit =
  {	var a=40;
    var b=34;
    var c=21;

    c=a+b;
    println("Simple Addition(c=a+b) = " + c);

    c+=a;
    println("Add and Assignment(c+=a) = " + c);

    c-=a;
    println("Subtract and Assignment(c-=a) = " + c);

    c*=a;
    println("Multiply and Assignment(c*=a) = " + c);

    c/=a;
    println("Divide and Assignment(c/=a) = " + c);

    c%=a;
    println("Modulus and Assignment(c%=a) = " + c);

    c<<=3;
    println("Left Shift and Assignment(c<<=3) = " + c);

    c>>=3;
    println("Right Shift and Assignment(c>>=3) = " + c);

    c&=a;
    println("Bitwise And and Assignment(c&=a) = " + c);

    c^=a;
    println("Bitwise Xor and Assignment(c^=a) = " + c);

    c|=a;
    println("Bitwise Or and Assignment(c|=a) = " + c);
    println("\t");
  }
  def main(args: Array[String]):Unit =
  {	arithmeticOperator()
    relationalOperator()
    logicalOperator()
    bitwiseOperator()
    assignmentOperator()
  }
}