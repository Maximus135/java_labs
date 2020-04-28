package lab3;

public class U0901WorkArray<T extends Number> {

    public T[] arrNums;

    public U0901WorkArray(T[] numP) {
        this.arrNums = numP;
    }

    public double sum() {
        double doubleWork = 0;
        for (int i = 0; i < this.arrNums.length; i++) {
            doubleWork += Double.parseDouble(arrNums[i].toString());
        }
        return doubleWork;
    }

}