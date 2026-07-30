public class Square {
    private double side;
    private boolean filled;

    public Square(){
        this(1.0, true);
    }

    public Square(double side, boolean filled) {
        setSide(side);
        this.filled = filled;
    }

    public double getSide() { return side; }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("[Error] Side must be positive. Setting default to 1.o");
            this.side = 1.0;
            return;
        }
        this.side = side;
    }

    public boolean isFilled() {return filled; }
    public void stFilled(boolean filled) {this.filled = filled; }

    public double calculateArea() { return side * side; }
    public double calculatePerimeter() {return 4 * side; }

    public void displayInfo() {
        System.out.println("Display:");
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (filled || i = 0 || i == size - 1 || j == 0 || j == size - 1) {
                    Sysrem.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println()
        }
    }
}