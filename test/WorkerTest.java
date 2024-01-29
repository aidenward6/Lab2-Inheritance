import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker W1 = new Worker("000001", "Bilbo", "Baggins", "Esq.", 1060, 30.00, 45);
    Worker W2 = new Worker("000002", "Frodo", "Baggins", "Esq", 1020, 20.00, 35);

    @org.junit.jupiter.api.Test
    void getHourlyPayRate() {
        assertEquals(30.00, W1.getHourlyPayRate());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(1425.0, W1.calculateWeeklyPay(W1.hoursWorked));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("Your regular pay is 1200.0 and you earned 225.0 in overtime. Your total pay this week is 1425.0", W1.displayWeeklyPay(W1.hoursWorked));

    }

}