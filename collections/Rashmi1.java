package collections;
class Rash 
{
private int pin=897563;
public int getpin()
{
	return pin;
}
public void setpin(int pin)
{
	this.pin=pin;
}
}
public class Rashmi1 {
public static void main(String[]args)
{
	Rash r1=new Rash();
	System.out.println(r1.getpin());
	r1.setpin(56789);
	System.out.println("new pin-->"+r1.getpin());
	}

}

