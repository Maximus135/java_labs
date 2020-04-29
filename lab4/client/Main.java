package lab4.client;

import lab4.stocklist.*;
import java.util.Date;

public class Main {
    public static void main(final String[] args) {
        GenericItem item1 = new GenericItem();
        GenericItem item2 = new GenericItem();
        GenericItem item3 = new GenericItem();
        GenericItem item4 = new GenericItem();
        GenericItem item5 = new GenericItem();
        GenericItem item6 = new GenericItem();
        GenericItem item7 = new GenericItem();
        GenericItem item8 = new GenericItem();
        GenericItem item9 = new GenericItem();
        GenericItem item10 = new GenericItem();

        ItemCatalog cat = new ItemCatalog();

        cat.addItem(item1);
        cat.addItem(item2);
        cat.addItem(item3);
        cat.addItem(item4);
        cat.addItem(item5);
        cat.addItem(item6);
        cat.addItem(item7);
        cat.addItem(item8);
        cat.addItem(item9);
        cat.addItem(item10);

        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin)); // быстрее

        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByIDAL(10);

        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);
    }
}