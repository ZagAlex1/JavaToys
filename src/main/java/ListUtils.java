import Toys.Toys;
import Toys.Robot;
import Toys.Lego;
import Toys.Doll;
import Toys.ToyType;

import java.util.ArrayList;
import java.util.Random;

public class ListUtils {
    public static ArrayList<Toys> createNewToyList() {
        Random random = new Random();
        ArrayList<Toys> toys = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(1, 4)) {
                case 1 -> toys.add(new Robot());
                case 2 -> toys.add(new Doll());
                case 3 -> toys.add(new Lego());
                default -> {
                }
            }
        }
        return toys;
    }

    public static void printInfo() {
        System.out.printf("Количество роботов : %d, Процент выпадения : %d\n", Robot.getCount(), Robot.getDropPercentage());
        System.out.printf("Количество кукл : %d, Процент выпадения : %d\n", Doll.getCount(), Doll.getDropPercentage());
        System.out.printf("Количество конструкторов : %d, Процент выпадения : %d\n", Lego.getCount(), Lego.getDropPercentage());
        System.out.println();
    }

    public static void addNewToy(ArrayList<Toys> list) {
        switch (new Random().nextInt(1, 4)) {
            case 1 -> list.add(new Robot());
            case 2 -> list.add(new Doll());
            case 3 -> list.add(new Lego());
            default -> {
            }
        }
    }
}
