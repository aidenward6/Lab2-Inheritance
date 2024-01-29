public class Worker extends Person{
    public double hourlyPayRate;
    public double hoursWorked;

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double hoursWorked) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPayRate(){
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overtime;
        double regular;
        double totalPay;

        if (hoursWorked > 40) {
            regular = (hourlyPayRate * 40);
            overtime = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            totalPay =  overtime + regular;
            return totalPay;
        }
        else {
            totalPay = (hoursWorked * hourlyPayRate);
            return totalPay;
        }

    }

    public String displayWeeklyPay(double hoursWorked) {
        String displayOutput = ("Your regular pay is " + (hourlyPayRate * 40) + " and you earned " + ((hoursWorked - 40) * (hourlyPayRate * 1.5)) + " in overtime. Your total pay this week is " + (calculateWeeklyPay(hoursWorked)));
        return displayOutput;


    }




    }

