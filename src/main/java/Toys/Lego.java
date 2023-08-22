package Toys;

public class Lego extends Toys {

    private static int count;
    protected static int dropPercentage;

    public Lego() {
        super(2, ToyType.Lego);
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
        System.out.printf("\nНазвание : %s, Количество : %d, Процент выпадeния : %d", ToyType.Lego, count, dropPercentage);
    }
}
