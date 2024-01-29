import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker SW1 = new SalaryWorker("000001", "Bilbo", "Baggins", "Esq.", 1060, 30.00, 45,120000.00 );
    SalaryWorker SW2 = new SalaryWorker("000002", "Frodo", "Baggins", "Esq", 1020, 20.00, 35, 90000);

    @Test
    void calculateWeeklyPay() {
        assertEquals(2307.6923076923076, SW1.calculateWeeklyPay(SW1.hoursWorked));

    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Your weekly pay is 2307.6923076923076. This is a fraction of your salary which is 120000.0", SW1.displayWeeklyPay(SW1.calculateWeeklyPay(SW1.hoursWorked)));
    }
}