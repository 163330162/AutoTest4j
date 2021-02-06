package com.xinchao;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.NonNull;
import org.apache.log4j.Logger;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;

public class Demo {
    // 得到记录器并读取配置文件 -- 基于类的名称获取日志对象
    private static Logger logger = Logger.getLogger(Demo.class);
    public static void main(String[] args)  throws Exception {
        // 插入记录信息（格式化日志信息）
        // 记录debug级别的信息
        logger.debug("调试信息.");
        // 记录info级别的信息
        logger.info("输出信息.");
        // 记录error级别的信息
        logger.error("错误信息.");
        // 记录warn级别的信息
        logger.warn("警告信息.");
        logger.fatal("致命信息");
        showData();

//        getData();
    }
    static void  getData() throws SQLException, ClassNotFoundException {
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置格式
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =   DriverManager.getConnection("jdbc:mysql://192.168.83.239:3306/property_crm","property_crm","9FytdnIyqiJp^^L");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select  * from building_info");
        while(rs.next()){
            logger.info("楼盘名称：" + rs.getString("building_name")+"， 楼盘uuid："+rs.getString("uuid") + "更新时间："  +new Date(rs.getLong("update_date")*1000).toString());
        }
    }

    static void showData(){
        String  data  = "[{\"name\":\"alex\",\"age\":23},{\"name\":\"wupeiqi\",\"age\":43}]";
        List<Person> arr =       JSONObject.parseArray(data,Person.class);
        for (Person person : arr) {
            logger.info(person);
            logger.info(person.show(null));

        }
    }
}

@Data
class  Person{

    private String name;
    private int age;
    public Person(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public int  show( Person person) {
//        if (person == null) {
//            throw new NullPointerException("person  is null");
//        }
        return  person.getOrder();

    }

    public  int  getOrder(){
        return  5;
    }
}

class NonNullExample extends Person {
    private   int age;
    public NonNullExample(Person person) {
        super("Hello");
        this.age = person.getOrder();
    }
}