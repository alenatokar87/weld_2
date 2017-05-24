package MetaDataBD;

/**
 * Created by vov on 04.05.2017.
 */
public interface Connection {
    // просто печатаем к какой БД подключились
    void printBDConnection();

    //считаем на основании полей countTable + countView (см.ниже)
    int countAllObject();

}
