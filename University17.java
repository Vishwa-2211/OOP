class University17 
{

    static int totalStudents;
    static String universityName;

    static {
        universityName = "ABC University";
        totalStudents = 0;
	System.out.println("250393107014");
        System.out.println("1. Static block executed");
    }

    {
        System.out.println("3. Instance block executed");
    }

    University17() 
    {
        totalStudents++;
        System.out.println("4. Constructor executed");
    }

    static int getTotalStudents()  
    {
        return totalStudents;
    }

    public static void main(String[] args) 
    {
	
        System.out.println("2. Main method started");
        System.out.println("University Name: " + universityName);

        University17 s1 = new University17();
        University17 s2 = new University17();

        System.out.println("Total Students: " + getTotalStudents());
    }
}