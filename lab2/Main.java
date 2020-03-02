package lab2;

public class Main {
    public static void main(final String[] args) {

        GenericItem item_1 = new GenericItem();
        GenericItem item_2 = new GenericItem();
        GenericItem item_3 = new GenericItem(); 
        
        item_1.ID = 123;
        item_1.name = "banana";
        item_1.price = 12f;

        item_2.ID = 231;
        item_2.name = "bread";
        item_2.price = 33f;

        item_3.ID = 321;
        item_3.name = "apple";
        item_3.price = 10f;

        item_1.printAll();

    }
}