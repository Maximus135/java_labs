package lab5.client;

import lab5.exceptions.CatalogLoadException;
import lab5.exceptions.ItemAlreadyExistsException;
import lab5.stocklist.*;
import lab5.stocklist.GenericItem.Category;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat) throws ItemAlreadyExistsException, CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new java.util.Date(), (short) 10);

        // cat.addItem(item1);
        // cat.addItem(item2);
        // // cat.printItems(); // вывод всего каталога

        try {
            cat.addItem(item1);
            cat.addItem(item2);
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}