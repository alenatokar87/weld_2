package MetaDataBD;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import java.util.List;

/**
 * Created by vov on 04.05.2017.
 */

@MySqlobj
public class MetaDataBD {
    @MySQLconnector
    @Inject
    private Connection connection;
@Inject
@MySqlobj
    private int countTable;
    @Inject
    @MySqlobj
    private int countView;
    @Inject
    @MySqlobj

    private String hostDriver;

    private int countAllObject;

    public void printDataDB(){
        connection.printBDConnection();
    }

    @Interceptors(DataInterceptor.class)
    public void printDataAll(){
        System.out.println("connection = " + connection);
        System.out.println("countAllObject = " + countAllObject);
        System.out.println("countTable = " + countTable);
        System.out.println("countView = " + countView);
        System.out.println("hostDriver = " + hostDriver);
    }
    @Inject @producedList
    private List<String> listBD;

    public void printListBD(){
        System.out.println("DB List: ");
        for (String hlp : listBD) { System.out.println(hlp);}
    };


}
