class Point12
{
	int x;
	int y;

	Point12()
	{
		x=5;
		y=5;
	}

	Point12(int a,int b)
	{
		x=a;
		y=b;
	}

	Point12(Point12 p)
	{
		x=p.x;
		y=p.y;
	}

	void display()
	{
		System.out.println("Point coordinates: (" + x + ", " + y + ")");
	}

public static void main(String []args)
	{
		System.out.println("250393107014");
		Point12 p1 = new Point12();
		p1.display();

		Point12 p2 = new Point12(10,20);
		p2.display();

		Point12 p3 = new Point12(p2);
		p3.display();
	}







}