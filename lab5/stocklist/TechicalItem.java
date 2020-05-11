package lab5.stocklist;

public class TechicalItem extends GenericItem {
    private short warrantyTime; // гарантийный срок (суток)

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void printAll() {
        System.out.printf("ID: " + getID() + " , Name: " + getName() + " , price:" + getPrice() + " , category: "
                + category + " , warrantyTime: " + warrantyTime + " \n");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        else
            return false;
    }

    @Override
    public TechicalItem clone() {
        TechicalItem clone_techical = new TechicalItem();
        clone_techical.setID(this.getID());
        clone_techical.setAnalog(this.getAnalog());
        clone_techical.category = this.category;
        clone_techical.setName(this.getName());
        clone_techical.setPrice(this.getPrice());
        clone_techical.warrantyTime = this.warrantyTime;
        return clone_techical;
    }

    @Override
    public String toString() {
        return "Object to String";
    }
}