package com.github.kiolk.jacocoproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {

    public Manager mManager = new Manager();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkSum(){
        assertEquals(3, mManager.sum(1,2));
        assertEquals(7, mManager.sum(5,2));
    }

    @Test
    public void checkMinus(){
        assertEquals(6, mManager.minus(6, 12));
        assertEquals(6, mManager.minus(12, 6));
    }
}