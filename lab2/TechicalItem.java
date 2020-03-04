package lab2;

public class TechicalItem extends GenericItem{
    short warrantyTime; // гарантийный срок (суток)
    

    @Override
    public void printAll(){
        System.out.printf("ID: "+ID+" , Name: "+name+" , price:"+price+" , category: "+category+" , warrantyTime: "+warrantyTime+" \n");
    }
    
    @Override
    public boolean equals (Object o){
        if(o == this)
            return true;
        else
            return false;
    }

    @Override
    public TechicalItem clone() {
        TechicalItem clone_techical = new TechicalItem();
        clone_techical.ID = this.ID;
        clone_techical.analog = this.analog;
        clone_techical.category = this.category;
        clone_techical.name = this.name;
        clone_techical.price = this.price;
        clone_techical.warrantyTime = this.warrantyTime;
        return clone_techical;
    }

    @Override
    public String toString() {
        return "Object to String";
    }
}