package lab5.stocklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lab5.exceptions.ItemAlreadyExistsException;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        // проверка в HashMap
        for (Map.Entry<Integer, GenericItem> entry : catalog.entrySet()) {
            if (entry.getValue().equals(item)) {
                throw new ItemAlreadyExistsException("Item Already Exists in HashMap");
            }
        }
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        // Если нет такого ID, возвращаем пустое значение
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id)
                return i;
        }
        return null;
    }

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    public void setALCatalog(ArrayList<GenericItem> aLCatalog) {
        ALCatalog = aLCatalog;
    }

}