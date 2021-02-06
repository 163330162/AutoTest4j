import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestTestNG {
    private  int age;
    private  String name ;
    TestTestNG(int age)
    {
        this.age = age;
    }
    TestTestNG(String name)
    {
        this.name = name;
    }
    TestTestNG(int age,String name)
    {
       this.age = age;
       this.name = name;
    }


    @Test
    public void simpleTest1(){
        System.out.println("simple test one" + (this.age - 10));
    }
    @Test
    public void simpleTest2(){
        System.out.println("simple test two" + (this.age + 10));
    }

    @Test
    public void simpleTest3(){
        System.out.println("simple test two" + this.name );
    }

}

