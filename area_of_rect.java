public class area_of_rect{
    int l,b;
    void insert(int len, int breadth){
        l = len;
        b = breadth;
    }
    void display(){
        System.out.println(l*b);
    }
}

class area{
    public static void main(String[] args){
        area_of_rect area = new area_of_rect();
        area.insert(5,6);
        area.display();
    }
}
