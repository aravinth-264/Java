import java.util.Scanner;
public class AnnualSalaryCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your hourlyWage:");
        double hourlyWage = scanner.nextDouble();
        System.out.println("Enter Your Weekly Workhours:");
        double hoursWorked = scanner.nextDouble();
        double weeklySalary;
        if(hoursWorked>40)
        {
            weeklySalary = calculateWeeklySalary(hourlyWage,hoursWorked,1.5);
        }
        else
        {
            weeklySalary = calculateWeeklySalary(hourlyWage,hoursWorked);
        }
        double annualSalary = calculateAnnualSalary(weeklySalary);
        System.out.printf("Your WeeklySalary :$%.2f\n",weeklySalary);
        System.out.printf("Your AnnualSalary :$%.2f\n",annualSalary);

    }
    public static double calculateWeeklySalary(double hourlyWage , double hoursWorked)
    {
        return hourlyWage*hoursWorked;
    }
    public static double calculateWeeklySalary(double hourlyWage , double hoursWorked , double overtimeRate)
    {
        // 40 hours is regularhours. So ,here we compare with 40
        double regularHours = Math.min(hoursWorked,40);
        // if they did'nt work for more than 40 hours there is no overtime.Then here overtimeHours is 0
        double overtimeHours = Math.max(hoursWorked-40,0);
        //if overtimeHours is 0 means after the + operator is 0
        return (regularHours*hourlyWage)+(overtimeHours*hourlyWage*overtimeRate);
    }
    public static double calculateAnnualSalary(double weeklySalary)
    {
        return weeklySalary*52;
    }
}
