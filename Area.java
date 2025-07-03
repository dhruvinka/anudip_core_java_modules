public class Area {

    
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    
    double area(double length, double breadth) {
        return  length * breadth;
    }

 
    double area(float base, float height) {
        return 0.5f * base * height;
    }

    public static void main(String[] args) 
    {
        Area calc = new Area();

        System.out.println("Area of Circle is: " + calc.area(10.0));
        System.out.println("Area of Rectangle is: " + calc.area(4.0, 66.0));
        System.out.println("Area of Triangle is: " + calc.area(33.0f, 8.0f));
    }
}
