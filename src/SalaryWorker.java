public class SalaryWorker extends Worker {
    public double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double hoursWorked, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate, hoursWorked);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary/52;
        return weeklyPay;

    }

    public String displayWeeklyPay(double weeklyPay) {
        String displayWeeklyPay = "Your weekly pay is " +weeklyPay+ ". This is a fraction of your salary which is " +annualSalary;
        return displayWeeklyPay;

    }
}
