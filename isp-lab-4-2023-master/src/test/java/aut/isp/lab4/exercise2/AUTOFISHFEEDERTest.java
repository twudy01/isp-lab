package aut.isp.lab4.exercise2;

import junit.framework.TestCase;
import org.junit.Test;

public class AUTOFISHFEEDERTest extends TestCase {

        @Test
        public void testFeeder() {
            AUTOFISHFEEDER feeder = new AUTOFISHFEEDER();
            int rez=feeder.getMeals();
            assertEquals("14",rez);

        }

        }
