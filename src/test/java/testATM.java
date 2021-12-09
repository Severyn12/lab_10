import atm.ATM;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testATM {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    private ATM atm = new ATM();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
    }


    @org.junit.jupiter.api.Test
    void testATM(){
        atm.process(325);
        assertEquals(this.consoleContent.toString(),
                "You will receive 0 5 banknotes\n" +
                "You will receive 0 10 banknotes\n" +
                "You will receive 16 20 banknotes\n");

    }
    @org.junit.jupiter.api.Test
    void testATM_2(){
        atm.process(45);
        assertEquals(this.consoleContent.toString(),
                "You will receive 0 5 banknotes\n" +
                        "You will receive 0 10 banknotes\n" +
                        "You will receive 2 20 banknotes\n");
    }

}
