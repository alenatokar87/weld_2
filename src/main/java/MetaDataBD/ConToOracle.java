package MetaDataBD;

import javax.enterprise.inject.Produces;


@Oracleconnector
public class ConToOracle implements Connection {
    @Produces
    @Oracleconnector
    @oracleobj
    private int countTable = 320;
    @Produces
    @Oracleconnector
    @oracleobj
    private int countView = 440;
    @Produces
    @Oracleconnector
    @oracleobj
    private String hostDriver = "jdbc:Oracle";

    public void printBDConnection() {
        System.out.println("countTable = 320");
        System.out.println("private int countView = 440");
        System.out.println("private String hostDriver = jdbc:Oracle");
    }

    public int countAllObject() {
        return (countTable + countView);
    }
}
