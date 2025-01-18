public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.Brand = "Parker";
        p1.setColor("Black");
        p1.setSize(5);

        System.out.println(p1.Brand);
        System.out.println(p1.getColor());
        System.out.println(p1.getSize());
    }
}

class Pen {
    String Brand;
    private String color;
    private int size;

    // getters
    String getColor() {
        return this.color;
    }

    int getSize() {
        return this.size;
    }

    // setters
    void setColor(String color) {
        this.color = color;
    }

    void setSize(int size) {
        this.size = size;
    }
}