package lab2;

public class GenericItem {
    public int ID;
    public String name;
    public float price;
    public int group; // для храниние информации об аналогах товара (группировка) 
    public enum Category {FOOD, PRINT, DRESS, GENERAL};
    
    public Category category = Category.GENERAL;

    public void printAll() {
        System.out.printf("ID: "+ID+" , Name: "+name+" , price:"+price+" , category: "+category+" \n", ID, name, price);
    }
}