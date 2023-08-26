import Toys.Toys;
import Toys.ToyType;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Draw {

    private LinkedList<Toys> prizePool;

    public Draw() {
        this.prizePool = new LinkedList<Toys>();
    }

    public static Toys findToy(ArrayList<Toys> list) {
        Toys toy = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getToyType() == ToyType.Doll) {
                toy = list.get(i);
                list.get(i).dellCount();
                list.remove(toy);
                return toy;
            }
        }
        return toy;
    }

    public void addToyInPrizeList(Toys toy) {
        if (toy == null) {
            System.out.println("Список пуст");
        } else {
            prizePool.add(toy);
        }
    }

    public void getPrizeToy() {
        if (prizePool.size() == 0) {
            System.out.println("\nПризовой список пуст!\n");
            return;
        }

        Toys prize = prizePool.removeFirst();
        try {
            File file = new File("src/main/java/prizeList.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            String res = String.format("%s", prize.getClass().getSimpleName());
            bw.write(res);
            bw.newLine();
            bw.close();
            System.out.println("\nВыдача игрушки прошла успешно");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printInfo() {
        if (prizePool.size() == 0) {
            System.out.println("Призовой список пуст.\nПроведите розыгрыш\n");
        } else {
            System.out.println("Тип призовой игрушки:\n");
            for (Toys toy : prizePool) {
                System.out.print(toy.getToyType() + "\t");
            }
            System.out.println();
        }
    }
}
