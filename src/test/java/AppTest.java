import com.sun.source.doctree.SummaryTree;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AppTest {

    @BeforeClass

    public void print(){
        System.out.println("This is my Before class");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is my Before Method");

    }
    @Test
    public void AppTest() {
        int x=3;
        int y =3;
        Assert.assertEquals(x,y);
System.out.println("Equal");
        //int sum = x+y;
        //System.out.println("Total is "+ sum);
    }

    @Test

    public void assertTrue() {
        int x = 31;
        int y = 3;
        int total = x + y;
        Assert.assertTrue(Sum(total, total));
        System.out.println("total is:"+ total);



    }
public static boolean Sum(int x,int y){
        return (x==y);
}

@Test

public void assertFalse() {
    int x = 31;
    int y = 3;
    Assert.assertFalse(x==y);
    System.out.println("assert false");
}
    @AfterTest
    public void afterPrint()
    {
        System.out.print("This is my After Test");
    }
}
