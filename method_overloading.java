class adder{
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}

public class method_overloading {
    public static void main(String[] args){
        System.out.println(adder.add(45, 67));
        System.out.println(adder.add(56, 87, 45));
    }
}
