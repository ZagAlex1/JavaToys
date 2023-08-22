import Toys.Toys;

import Toys.Robot;
import Toys.Lego;
import Toys.Doll;
import Toys.ToyType;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toys> list = ListUtils.createNewToyList();
        Draw draw = new Draw();
        ListUtils.printInfo();
        Toys toy = Draw.findToy(list);
        draw.addToyInPrizeList(toy);
        draw.printInfo();
        ListUtils.printInfo();

    }

}
