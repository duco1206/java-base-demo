package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
    @Test
    public void test_for_sum1(){
        BaseDemo baseDemo = new BaseDemo();

        int firstNum = 5;
        int secondNum = 6;

        assertEquals(firstNum+secondNum,baseDemo.sum(firstNum,secondNum));
    }

    @Test
    public void test_for_sum2(){
        BaseDemo baseDemo = new BaseDemo();

        int firstNum = 5;
        int secondNum = -6;

        assertEquals(firstNum+secondNum,baseDemo.sum(firstNum,secondNum));
    }
}
