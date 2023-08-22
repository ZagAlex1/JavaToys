package Toys;

public abstract class Toys {
    protected int id;
    protected ToyType toyType;

    public Toys(int id, ToyType toyType) {
        this.id = id;
        this.toyType = toyType;

    }

    public void printInfo(){
        System.out.printf("Название : %s",getClass());
    }

    public ToyType getToyType() {
        return toyType;
    }
    public void dellCount(){

    }
}
