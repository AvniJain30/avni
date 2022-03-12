public class object_clone implements Cloneable{
    int rollno;
    String name;

    object_clone(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            object_clone c1 = new object_clone(1, "avni");
            object_clone c2 = (object_clone) c1.clone();

            System.out.println(c1.rollno + "  " + c1.name);
            System.out.println(c2.rollno + "  " + c2.name);
        }
        catch (CloneNotSupportedException c) {
        }
    }
}
