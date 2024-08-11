public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.changeColor("Blue");
        // p1.color = "Blue"; --> doesn't execute because this is not visible (private)
        System.out.println(p1.color());
    }
}

class Pen {
    private int tip;
    private String color;

    // getters
    String color() {
        return this.color;
    }

    int tip() {
        return this.tip;
    }

    // setters
    void changeColor(String color) {
        this.color = color;
    }

    void tipSize(int tip) {
        this.tip = tip;
    }
}
