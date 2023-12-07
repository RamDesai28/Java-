import java.util.Scanner;

class Area {
    double length;
    double breadth;


    void setDim(double len, double brd) {
        length = len;
        breadth = brd;
    }

    double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double len = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double brd = input.nextDouble();

        rectangle.setDim(len, brd);

        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);

        input.close();
    }
}

