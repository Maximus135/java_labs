package lab3;

public class GenericItem {
    public int ID;
    public String name;
    public float price;
    public GenericItem analog; // для храниние информации об аналогах товара
    static int currentID;

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