class parent
{
  private var a:Int=10
  protected var b:Int=20
  var c:Int=30
  def display
  {
    a=100
    println(a)
    b=200
    println(b)
    c=300
    println(c);

  }
}

class new1 extends parent
{
  def display1()
  {
    b=2000
    println(b);
    c=3000
    println(c);

  }
}

object access extends App
{

  var e=new parent()
  e.display
  var e1=new new1()
  e1.display1


}