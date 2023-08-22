import Toys.Toys;
import Toys.Robot;
import Toys.Lego;
import Toys.Doll;
import Toys.ToyType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

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

    public void addToyInPrizeList(Toys toy){
        prizePool.add(toy);
    }

    public void printInfo(){
        for (Toys toy: prizePool) {
            toy.printInfo();
        }
        System.out.println();
        System.out.println();
    }
}
