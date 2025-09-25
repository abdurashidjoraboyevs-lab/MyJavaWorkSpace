package primeterCalculation;

public class Perimeter {
    int length;
    int width;

    Perimeter(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setA(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void calculationPerimeter(){
        int a = getLength()+getWidth();
        int c = a * 2;
        System.out.println("(" + getLength() + " + " + getWidth() + ") * 2 = " + c);
        System.out.println("Perimeter: " + c);

    }
}
