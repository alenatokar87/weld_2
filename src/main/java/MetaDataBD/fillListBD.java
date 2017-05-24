package MetaDataBD;

import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vov on 10.05.2017.
 */
public class fillListBD {
    @Produces
    @producedList
    public List<String> injectListBD() {
       List<String> dbstring = new ArrayList<String>();
        dbstring.add("Oracle");
        dbstring.add("MySQL");
        return dbstring;
    };
}
