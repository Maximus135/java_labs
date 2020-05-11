package lab5.client;

import lab5.exceptions.*;
import lab5.stocklist.*;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException, ItemAlreadyExistsException;
}
