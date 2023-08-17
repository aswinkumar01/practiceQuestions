package abstractionEncapsulation;

import java.util.Scanner;

class Encaps{
    private int length;
    private int height;

    void area(int l, int h){
        System.out.println(l*h);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class Encapsulation {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Encaps e =  new Encaps();
        e.setHeight(in.nextInt());
        e.setLength(in.nextInt());
        System.out.println(e.getHeight() +" "+ e.getLength());
        e.area(e.getHeight(),e.getLength());


    }

}
