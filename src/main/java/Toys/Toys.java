package Toys;

public abstract class Toys {
    protected ToyType toyType;

    public Toys(ToyType toyType) {
        this.toyType = toyType;

    }

    public ToyType getToyType() {
        return toyType;
    }

    public void dellCount() {

    }
}
