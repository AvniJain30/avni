public class callByValue {
    int data = 60;

    void change(int data){
        data = data + 50;
    }

    public static void main(String[] args){
     callByValue a = new callByValue();
        System.out.println("before change " + a.data);
        a.change(40);
        System.out.println("after change " + a.data);
    }
}
