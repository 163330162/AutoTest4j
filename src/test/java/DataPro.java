import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
    private  static Logger  log  = Logger.getLogger(DataPro.class);
    private  String  uuid;
    DataPro(String uuid)
    {
        this.uuid = uuid;
    }
    @DataProvider(name = "name")
    public Object[][] DataProviders() {
//        Object[][] obj = new Object[][] { { "A", "A1" }, { "B", "B1" }, { "C", "C1" } };
        Object[][] obj = new Object[][] { {new  DataPro("test")} };
        return obj;
    }

    @Test(dataProvider = "name")
    public void DataProviderShow(DataPro dp) {
        log.error("error  occourds this line ");
        System.out.println("result:" + dp.uuid);
    }

    public void DataProviderShow2() {
        System.out.println("result:" + this.uuid);
        System.out.println("result:" + this.uuid);
    }
}