package Worldline.task_5;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest {

    @Test
    public void testprint() 
    {
    	String message = "God is great";
    	Assert.assertEquals(message, "God is great", "Message should be 'God is great'");
    }
}