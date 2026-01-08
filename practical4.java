import java.util.Scanner;

class practical4
{
	public static void main(String[] args)
	{

        	Scanner sc = new Scanner(System.in);

       		System.out.print("Please enter your weight (in pounds): ");
        	double weightPounds = sc.nextDouble();

        	System.out.print("Please enter your height (in inches): ");
        	double heightInches = sc.nextDouble();

	        double weightKg = weightPounds * 0.45359237;

	        double heightMeters = heightInches * 0.0254;

        
        	double bmi = weightKg / (heightMeters * heightMeters);

        	System.out.println("Your BMI is: " + bmi);

        	sc.close();
	}
}