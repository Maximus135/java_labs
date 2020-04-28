package lab3;

public class Main {
    public static void main(final String[] args) {

        // GenericItem item_1 = new GenericItem();
        // GenericItem item_2 = new GenericItem();
        // GenericItem item_3 = new GenericItem();

        String line = "Конфеты 'Маска';45;120";
        String item_fld[] = line.split(";");
        // System.out.println(item_fld[0]);
        // System.out.println(item_fld[1]);
        // System.out.println(item_fld[2]);
        FoodItem foodItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItem.printAll();
    }
}