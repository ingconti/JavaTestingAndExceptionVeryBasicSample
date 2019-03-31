package TestingSample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */

// pls read at:
//       https://github.com/junit-team/junit4/wiki/Exception-testing


public class AppTest 
{

    TestingSample.Game g;


    @Before // setup()
    public void before() throws Exception {
        System.out.println("Running: setup");
        g = new TestingSample.Game();

    }



    @After // tearDown()
    public void after() throws Exception {
        System.out.println("Running: tearDown");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }



    @Test(expected = ArithmeticException.class)
    // CUSTOMIZE your exception.
    public void shouldAnswerWithTrueForException()
    {
        float average = 100/g.nOfPlayers();

    }
}
