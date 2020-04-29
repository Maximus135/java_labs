package lab4.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome = new Date(); // дата производства
    short expires; // срок годности
    public Category category = Category.FOOD;

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        this(name, price, expires);
        setName(name);
        setPrice(price);
        setAnalog(analog);
        this.dateOfIncome = date;
        this.expires = expires;
    };

    // частные конструкторы
    public FoodItem(String name, float price, short expires) {
        this(name);
        setName(name);
        setPrice(price);
        this.expires = expires;
    }

    public FoodItem(String name) {
        setName(name);
    };

    public FoodItem() {
    }

    @Override
    public void printAll() {
        System.out.printf("ID: " + getID() + " , Name: " + getName() + " , price:" + getPrice() + " , category: "
                + category + " , date: " + dateOfIncome + ", expires: " + expires + " \n");
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
        clone_food.setID(this.getID());
        clone_food.setAnalog(this.getAnalog());
        clone_food.category = this.category;
        clone_food.dateOfIncome = this.dateOfIncome;
        clone_food.expires = this.expires;
        clone_food.setName(this.getName());
        clone_food.setPrice(this.getPrice());
        return clone_food;
    }

    @Override
    public String toString() {
        return "Object FoodItem";
    }
}