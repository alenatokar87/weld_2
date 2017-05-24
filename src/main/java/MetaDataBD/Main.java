package MetaDataBD;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import sun.security.jgss.spi.MechanismFactory;


public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MetaDataBD md = container.instance().select(MetaDataBD.class).get();

        md.printDataDB();

        md.printDataAll();
        weld.shutdown();

    }
}
