import org.testng.annotations.BeforeMethod;

public class TestInit {
    public boolean isinited = false;

@BeforeMethod
    public void runBefore(){
isinited = true;

    }

}
