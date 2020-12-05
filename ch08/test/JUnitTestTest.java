package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MarkChern
 * date 2020/12/5 8:07
 */
public class JUnitTestTest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void method1()
    {
    }

    @Test
    public void method2()
    {
        assertEquals(2, new JUnitTest().method2(1, 1));
    }
}