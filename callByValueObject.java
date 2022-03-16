public class callByValueObject {
    int data = 30;

    void change(callByValueObject a){
        a.data = a.data + 200;
    }

    public static void main(String[] args){
        callByValueObject a = new callByValueObject();
        System.out.println("before change " + a.data);
        a.change(a);
        System.out.println("after change " + a.data);
    }
}
