package lab3;

import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome = new Date(); // дата производства
    short expires; // срок годности
    public Category category = Category.FOOD;

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        this(name, price, expires);
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.dateOfIncome = date;
        this.expires = expires;
    };

    // частные конструкторы
    public FoodItem(String name, float price, short expires) {
        this(name);
        this.name = name;
        this.price = price;
        this.expires = expires;
    }

    public FoodItem(String name) {
        this.name = name;
    };

    public FoodItem() {
    }

    @Override
    public void printAll() {
        System.out.printf("ID: " + ID + " , Name: " + name + " , price:" + price + " , category: " + category
                + " , date: " + dateOfIncome + ", expires: " + expires + " \n");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        else
            return false;
    }

    @Override
    public FoodItem clone() {
        FoodItem clone_food = new FoodItem();
        clone_food.ID = this.ID;
        clone_food.analog = this.analog;
        clone_food.category = this.category;
        clone_food.dateOfIncome = this.dateOfIncome;
        clone_food.expires = this.expires;
        clone_food.name = this.name;
        clone_food.price = this.price;
        return clone_food;
    }

    @Override
    public String toString() {
        return "Object FoodItem";
    }
}