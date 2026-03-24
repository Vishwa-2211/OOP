interface Classify 
{
    String getDivision(double average);
}


class Result implements Classify 
{

    @Override
    public String getDivision(double average) 
    {
        if (average >= 60) 
        {
            return "First Division";
        } 
        else 
        {
            return "No Division"; 
        }
    }
}

public class Practical27
{
    public static void main(String[] args) 
    {
        Result r = new Result();
        System.out.println("250393107014");
        double avg = 65.5;
        System.out.println(r.getDivision(avg));  
    }
}