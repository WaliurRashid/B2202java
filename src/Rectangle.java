public class Rectangle {
    float length;
    float width;

    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }

    public float calculateArea(){
        float area = length * width;
        return area;
    }

    public float calculatePerimeter(){
        return 2 * (length+width);
    }

    public static void main(String[] args) {
        Rectangle sarwat = new Rectangle(5.0f,4.0f);
        System.out.println("The Area of the rectangle is " + sarwat.calculateArea());
        System.out.println(sarwat.calculatePerimeter());
    }
}
