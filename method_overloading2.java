class Adder{
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }
}
public class method_overloading2{
    public static void main(String[] args){
        System.out.println(Adder.add(34, 54));
        System.out.println(Adder.add(12.5, 54.8));
    }
}
