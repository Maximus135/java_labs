package lab5.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;

import lab5.exceptions.*;
import lab5.stocklist.*;

public class CatalogFileLoader implements CatalogLoader {
    private String fileName;

    public String getFilename() {
        return fileName;
    }

    public void setFilename(String fileName) {
        this.fileName = fileName;
    }

    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void load(ItemCatalog itemCatalog) throws CatalogLoadException {
        File f = new File(fileName);
        FileInputStream fis;
        String line;
        try {
            fis = new FileInputStream(f);
            Scanner s = new Scanner(fis);
            while (s.hasNextLine()) {
                line = s.nextLine();
                if (line.length() == 0)
                    break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(name, price, null, new Date(expires), expires);
                itemCatalog.addItem(item);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new CatalogLoadException("File not found");
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException("Item Already Exists");
        }

    }
}