class A{}

class downcasting extends A{
    static void method(A a){
        if(a instanceof A){
            downcasting d = (downcasting) a;   //downcasting
            System.out.println("downcasting");
        }
    }

    public static void main(String[] args){
        A a = new downcasting();   //upcasting
        downcasting.method(a);
    }
}
