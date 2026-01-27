class Time11
{
	int hours;
	int minutes;

	void setTime11(int h, int m)
{
		hours = h;
		minutes = m;
}

	void addTime11(Time11 t1, Time11 t2)
	{
		hours = t1.hours + t2.hours;
		minutes = t1.minutes + t2.minutes;
		if (minutes >= 60)
		{
			hours = hours + (minutes / 60);
			minutes = minutes % 60;
		}
	}
		void displayTime11()
		{
	        	System.out.println("Time: " + hours + " hours " + minutes + " minutes");
		}

public static void main(String[] args)
	{
          System.out.println("250393107014");
	  Time11 t1 = new Time11();
	  Time11 t2 = new Time11();
	  Time11 t3 = new Time11();
	  t1.setTime11(2, 45);
	  t2.setTime11(1, 30);
	  t3.addTime11(t1, t2);
	  t1.displayTime11();
       	  t2.displayTime11();
	  t3.displayTime11();
	}
}