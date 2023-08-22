package Toys;

public class Doll extends Toys {

    private static int count;
    protected static int dropPercentage;

    public Doll() {
        super(3, ToyType.Doll);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static int getDropPercentage() {
        return dropPercentage;
    }

    @Override
    public void printInfo() {
        System.out.printf("\nНазвание : %s, Количество : %d, Процент выпадения : %d", ToyType.Doll, count, dropPercentage);
    }

    @Override
    public void dellCount() {
        count--;
    }
}
