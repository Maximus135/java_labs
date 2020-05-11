package lab5.sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public int getIntTo() {
        return intTo;
    }

    public void setIntTo(int intTo) {
        this.intTo = intTo;
    }

    public int getIntFrom() {
        return intFrom;
    }

    public void setIntFrom(int intFrom) {
        this.intFrom = intFrom;
    }

    public synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("before Thread=" + Thread.currentThread().getName() + ", From=" + this.getIntFrom() + ", To="
                + this.getIntTo());
        this.setIntFrom(this.getIntFrom() - intTransaction);
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setIntTo(this.getIntTo() + intTransaction);
        System.out.println("after Thread=" + Thread.currentThread().getName() + ", From=" + this.getIntFrom() + ", To="
                + this.getIntTo());
    }
}