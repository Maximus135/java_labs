package lab5.stocklist;

public class GenericItem {
    private int ID;
    private String name;
    private float price;
    private GenericItem analog; // для храниние информации об аналогах товара
    private static int currentID;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    public enum Category {
        FOOD, PRINT, DRESS, GENERAL
    };

    public Category category = Category.GENERAL;

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
    };

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
    };

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    };

    public void printAll() {
        System.out.printf("ID: " + ID + " , Name: " + name + " , price:" + price + " , category: " + category + " \n");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        else
            return false;
    }

    @Override
    public Object clone() {
        if (analog instanceof GenericItem) {
            return new GenericItem();
        } else {
            return analog.clone();
        }
    }

    @Override
    public String toString() {
        return "Object GenericItem";
    }

}