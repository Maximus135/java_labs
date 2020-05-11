package lab5.client;

import lab5.exceptions.CatalogLoadException;
import lab5.exceptions.ItemAlreadyExistsException;
import lab5.stocklist.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(final String[] args) throws ItemAlreadyExistsException {
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
        ArrayList<GenericItem> list_item = new ArrayList<GenericItem>();
        list_item.add(item1);
        list_item.add(item2);
        list_item.add(item3);
        list_item.add(item4);
        list_item.add(item5);
        list_item.add(item6);
        list_item.add(item7);
        list_item.add(item8);
        list_item.add(item9);
        list_item.add(item10);

        ItemCatalog cat = new ItemCatalog();

        // добавляем наши объекты в каталог
        for (int i = 0; i < 9; i++) {
            try {
                cat.addItem(list_item.get(i));
            } catch (ItemAlreadyExistsException e1) {
                e1.printStackTrace();
            }
        }

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

        CatalogLoader loader = new CatalogStubLoader(); // пытаемся загрузить, если что ловим ошибку
        try {
            loader.load(cat);
        } catch (CatalogLoadException e) {
            e.printStackTrace();
        }

        // CatalogLoader loader2 = new CatalogFileLoader("fileName");

        // try {
        // loader2.load(cat);
        // } catch (CatalogLoadException e) {
        // e.printStackTrace();
        // }
    }
}