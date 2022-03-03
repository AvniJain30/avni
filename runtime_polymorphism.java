class shape {
    void draw(){
        System.out.println("drawing..");
    }
}

class rect extends shape{
    void draw(){
        System.out.println("drawing rectangle..");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("drawing circle..");
    }
}

public class runtime_polymorphism{
    public static void main(String[] args){
        shape s;
        s = new rect();  //upcasting
        s.draw();
        s = new circle();   //upcasting
        s.draw();
    }
}

