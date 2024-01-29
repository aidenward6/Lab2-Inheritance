public class main {
    public static void main(String[] args) {
        Worker W1 = new Worker("00023", "Lebron", "James","Mr.",1984, 30, 100);
        Worker W2 = new Worker("00030", "Stephen", "Curry","Mr.",1988, 25, 100);
        Worker W3 = new Worker("00015", "Nikola", "Jokic","Mr.",1995, 27, 100);
        SalaryWorker SW1 = new SalaryWorker("000001", "Bilbo", "Baggins", "Esq.", 1060, 30.00, 40,60000.00 );
        SalaryWorker SW2 = new SalaryWorker("000002", "Frodo", "Baggins", "Esq.", 1020, 20.00, 40, 40000.00);
        SalaryWorker SW3 = new SalaryWorker("000004", "Billy", "Bo", "Mr.", 2004, 35.00, 40, 70000.00);



        int[] weekHours = {40, 50, 40};


        for (int week = 0; week < 3; week++) {
            System.out.printf("                    Week %d\n", week + 1);
            for (Worker worker : new Worker[]{W1, W2, W3}) {
                double weeklyPay = worker.calculateWeeklyPay(weekHours[week]);
                System.out.printf("%-10s %-15s %-15s %-5s %-10.2f\n", worker.getIDNum(), worker.getFirstName(), worker.getLastName(), "Hourly", weeklyPay);
            }

            for (SalaryWorker salaryWorker : new SalaryWorker[]{SW1, SW2, SW3}) {
                double weeklyPay = salaryWorker.calculateWeeklyPay(weekHours[week]);
                System.out.printf("%-10s %-15s %-15s %-5s %-10.2f\n", salaryWorker.getIDNum(), salaryWorker.getFirstName(), salaryWorker.getLastName(), "Salary", weeklyPay);
            }

            System.out.println();
            System.out.println();


        }





    }
}
