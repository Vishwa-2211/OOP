import java.util.Scanner;

class College19 
{
    String collegeName;

    College19(String collegeName) 
    {
        this.collegeName = collegeName;
    }

    class Admission 
    {
        String studentName;
        String course;

        void acceptDetails() 
	{
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course       : " + course);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        College19 college = new College19(cname);

        College19.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
}
