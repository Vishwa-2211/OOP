class Shape22
{
	double d1,d2;

  void getData(double d1,double d2)
     {
	this.d1=d1;
	this.d2=d2;
     }
}

class Rectangle extends Shape22
{
	double area()
	{
	   return d1*d2;
	}
}

class Triangle extends Shape22
{
	double area()
	{
		return 0.5*d1*d2;	
	}
}

class Shape
{
	public static void main(String[] args)
	{
        System.out.println("250393107014");
	Triangle t = new Triangle();
	t.getData(10,5);
	System.out.println("Area of Triangle = " + t.area());

        Rectangle r = new Rectangle();
        r.getData(10, 5);
        System.out.println("Area of Rectangle = " + r.area());
    }
}
	








