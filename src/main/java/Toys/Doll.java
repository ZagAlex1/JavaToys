package Toys;

public class Doll extends Toys {

    private static int count;
    private static double dropPercentage;

    public Doll() {
        super(ToyType.Doll);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setDropPercentage(double percent) {
        dropPercentage = Math.floor(percent);
    }

    public static double getDropPercentage() {
        return dropPercentage;
    }

    @Override
    public void dellCount() {
        count--;
    }
}
