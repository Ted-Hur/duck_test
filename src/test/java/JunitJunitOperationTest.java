import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitJunitOperationTest {

    JunitOperationTest junitOperationTest;

    @Before
    public void setUp(){
        junitOperationTest = new JunitOperationTest();
    }

    @Test
    public void junitOperationTest1(){
        Assert.assertEquals(junitOperationTest.jnitOperationTest(1), 2);
    }

    @Test
    public void junitOperationTest2(){
        Assert.assertEquals(junitOperationTest.jnitOperationTest(2), 3);
    }
}
