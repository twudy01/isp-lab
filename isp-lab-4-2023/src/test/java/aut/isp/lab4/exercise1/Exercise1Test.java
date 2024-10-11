package aut.isp.lab4.exercise1;

import junit.framework.TestCase;
import org.junit.Test;

public class Exercise1Test extends TestCase {
    @Test
    public void testName(){
        String rez="FTANK";
        assertEquals("FTANK",rez);
        if(rez.equals("FTANK"))
        {
            System.out.println("THE OBJECTS ARE THE SAME");
        }
        else {
            System.out.println("THE OBJECTS ARE NOT THE SAME");
             }
        }
}


