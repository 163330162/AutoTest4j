import org.testng.annotations.Factory;

public class Test
{
    @Factory
    public Object[] factoryMethod1() {
        return new Object[] { new TestTestNG(1), new TestTestNG(2) };
    }

    @Factory
    public Object[] factoryMethod2() {
        return new Object[] { new TestTestNG(11), new TestTestNG(22) };
    }

    @Factory
    public Object[] factoryMethod3() {
        return new Object[] { new TestTestNG("dwf"), new TestTestNG(20) };
    }
}