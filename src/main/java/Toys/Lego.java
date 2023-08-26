package Toys;

public class Lego extends Toys {

    private static int count;
    private static double dropPercentage;

    public Lego() {
        super(ToyType.Lego);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static double getDropPercentage() {
        return dropPercentage;
    }

    public static void setDropPercentage(double percent) {
        dropPercentage = Math.floor(percent);
    }

    @Override
    public void dellCount() {
        count--;
    }

}
