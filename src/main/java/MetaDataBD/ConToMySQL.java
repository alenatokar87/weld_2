package MetaDataBD;

import javax.enterprise.inject.Produces;

/**
 * Created by vov on 04.05.2017.
 */
@MySQLconnector
public class ConToMySQL implements Connection {
@Produces
@MySQLconnector
@MySqlobj
private int countTable = 20;
@Produces
@MySQLconnector
@MySqlobj
private int countView = 40;
@Produces
@MySQLconnector
@MySqlobj
    private String hostDriver = "jdbc:MySQL";
    public void printBDConnection() {
        System.out.println("countTable = 20");
        System.out.println("private int countView = 40");
        System.out.println("private String hostDriver = jdbc:MySQL");
    }
    public int countAllObject() {
        return (countTable + countView);
    }
}
