abstract class shapes{
    abstract void draw();
}

class rectangle1 extends shape{
    void draw(){
        System.out.println("rectangle..");
    }
}

class circle1 extends shape{
    void draw(){
        System.out.println("circle..");
    }
}

public class abstraction{
    public static void main(String[] args){
        shape s = new circle1();
        s.draw();

    }
}
