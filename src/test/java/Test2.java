import org.testng.annotations.Factory;

public class Test2
{
    @Factory
    public Object[] factoryMethod1()
    {
        return new Object[] { new DataPro("daddd"), new DataPro("21321321") };
    }
}