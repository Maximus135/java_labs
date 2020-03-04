package lab2;



public class Main {
    public static void main(final String[] args) {

        
        GenericItem item_1 = new GenericItem();
        GenericItem item_2 = new GenericItem();
        GenericItem item_3 = new GenericItem(); 
        
        Object[] arrayObjects = new Object[5];

        item_1.ID = 123;
        item_1.name = "banana";
        item_1.price = 12f;

        arrayObjects[0] = item_1;

        item_2.ID = 231;
        item_2.name = "bread";
        item_2.price = 33f;

        arrayObjects[1] = item_2;

        item_3.ID = 321;
        item_3.name = "apple";
        item_3.price = 10f;

        arrayObjects[2] = item_3;

        //item_1.printAll();

        FoodItem food = new FoodItem();
        //food.printAll();

        arrayObjects[3] = food;

        TechicalItem tech_itm = new TechicalItem();
        //tech_itm.printAll();

        arrayObjects[4] = tech_itm; 

        for(int i = 0; i < arrayObjects.length; i++){
            ((GenericItem) arrayObjects[i]).printAll();
        }

        FoodItem coffe = new FoodItem();
        coffe.ID=55;
        coffe.expires = 12;
        coffe.name = "coffe";
        coffe.price = 76f;

        FoodItem tea = new FoodItem();
        tea.ID=33;
        tea.expires = 8;
        tea.name = "tea";
        tea.price = 46f;
         
        System.out.println(coffe.equals(tea)); // сравнение ссылок 

        FoodItem coffe_clone = coffe.clone();

        coffe_clone.ID = 12345;

        System.out.println(coffe.ID);
        System.out.println(coffe_clone.ID);

        System.out.println(coffe.equals(coffe_clone));

    }
}