object ScalaDataType
{	def main(args:Array[String]): Unit=
{	def x(a: AnyVal) = println(a)
  def y(a: AnyRef) = println(a)
  def z(a: Any) = println(a)

  var a1: Byte=01
  val MIN_BYTE = java.lang.Byte.MIN_VALUE
  val MAX_BYTE = java.lang.Byte.MAX_VALUE

  var a2: Short=50
  val MIN_SHORT = java.lang.Short.MIN_VALUE
  val MAX_SHORT = java.lang.Short.MAX_VALUE

  var a3: Int=56
  val MIN_INT = java.lang.Integer.MIN_VALUE
  val MAX_INT = java.lang.Integer.MAX_VALUE

  var a4: Long=536637
  val MIN_LONG = java.lang.Long.MIN_VALUE
  val MAX_LONG = java.lang.Long.MAX_VALUE

  var a5: Float=87.97f
  val EPS_FLOAT = java.lang.Float.MIN_VALUE
  val MAX_FLOAT = java.lang.Float.MAX_VALUE

  var a6: Double=98.36
  val EPS_DOUBLE = java.lang.Double.MIN_VALUE
  val MAX_DOUBLE = java.lang.Double.MAX_VALUE

  var a7: Char='H'
  val MIN_CHAR = java.lang.Character.MIN_VALUE
  val MAX_CHAR = java.lang.Character.MAX_VALUE

  var a8: String="Harshit"
  var a9: Boolean=true
  val nullReferenceVariable: Null = null

  println("a1(Byte) is: "+a1 + " Range: "+ MIN_BYTE + " to " + MAX_BYTE)
  println("a2(Short) is: "+a2 + " Range: "+ MIN_SHORT + " to " + MAX_SHORT)
  println("a3(Int) is: "+a3 + " Range: "+ MIN_INT + " to " + MAX_INT)
  println("a4(Long) is: "+a4 + " Range: "+ MIN_LONG + " to " + MAX_LONG)
  println("a5(Float) is: "+a5 + " Range: "+ EPS_FLOAT + " to " + MAX_FLOAT)
  println("a6(Double) is: "+a6 + " Range: "+ EPS_DOUBLE + " to " + MAX_DOUBLE)
  println("a7(Char) is: "+a7 + " Range: "+ MIN_CHAR + " to " + MAX_CHAR)
  println("a8(String) is: "+a8)
  println("a9(Boolean) is: "+a9)
  println(nullReferenceVariable)
  x(2)
  y(nullReferenceVariable)
  z('A')
}
}