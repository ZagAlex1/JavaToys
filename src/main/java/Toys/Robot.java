package Toys;

public class Robot extends Toys {
    private static int count;
    protected static int dropPercentage;

    public Robot() {
        super(1, ToyType.Robot);
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
        System.out.printf("\nНазвание : %s, Количество : %d, Процент выпадeния : %d", ToyType.Robot, count, dropPercentage);
    }
}
