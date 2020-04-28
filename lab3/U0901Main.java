package lab3;

public class U0901Main {
    public static void main(String[] args) {
        Integer intArr[] = { 10, 20, 15 };
        Float floatArr[] = new Float[2];

        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = ((float) (Math.random()));
        }
        ;

        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }
}
