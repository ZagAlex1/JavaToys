import Toys.Toys;
import Toys.Robot;
import Toys.Lego;
import Toys.Doll;
import Toys.ToyType;

import java.util.ArrayList;
import java.util.Random;

public class ListUtils {
    public static ArrayList<Toys> createNewToyList(int count) {
        Random random = new Random();
        ArrayList<Toys> toys = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (random.nextInt(1, 4)) {
                case 1 -> toys.add(new Robot());
                case 2 -> toys.add(new Doll());
                case 3 -> toys.add(new Lego());
                default -> {
                }
            }
        }
        dropChance();
        return toys;
    }

    public static void addNewToy(ArrayList<Toys> list) {
        switch (new Random().nextInt(1, 4)) {
            case 1 -> list.add(new Robot());
            case 2 -> list.add(new Doll());
            case 3 -> list.add(new Lego());
            default -> {
            }
        }
        dropChance();
    }

    private static void dropChance() {
        float chance = 100f / (Robot.getCount() + Doll.getCount() + Lego.getCount());
        Robot.setDropPercentage(chance * Robot.getCount());
        Doll.setDropPercentage(chance * Doll.getCount());
        Lego.setDropPercentage(chance * Lego.getCount());
    }

    public static void printInfo() {
        System.out.printf("Количество роботов : %d, Процент выпадения : %.0f\n", Robot.getCount(), Robot.getDropPercentage());
        System.out.printf("Количество кукл : %d, Процент выпадения : %.0f\n", Doll.getCount(), Doll.getDropPercentage());
        System.out.printf("Количество конструкторов : %d, Процент выпадения : %.0f\n", Lego.getCount(), Lego.getDropPercentage());
        System.out.println();
    }

    public static Toys getToy(ArrayList<Toys> list) {
        if (list.size() == 0) {
            return null;
        }
        double maxChance = Doll.getDropPercentage() + Robot.getDropPercentage() + Lego.getDropPercentage();
        int res = new Random().nextInt(1, (int) maxChance);
        if (res <= Robot.getDropPercentage()) {
            System.out.println("Вам выпал робот");
            return findToy(list, ToyType.Robot);
        } else if (res > Robot.getDropPercentage() && res <= Doll.getDropPercentage() + Robot.getDropPercentage()) {
            System.out.println("Вам выпала кукла");
            return findToy(list, ToyType.Doll);
        } else {
            System.out.println("Вам выпал конструктор");
            return findToy(list, ToyType.Lego);
        }
    }

    private static Toys findToy(ArrayList<Toys> list, ToyType toyType) {
        Toys toy = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getToyType() == toyType) {
                toy = list.get(i);
                list.get(i).dellCount();
                list.remove(toy);
                dropChance();
                return toy;
            }
        }
        return toy;
    }
}
