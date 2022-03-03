public class object_comparison {
    public static void main(String[] args){
        Double x = new Double (123.45555);
        Long y = new Long(9887544);

        System.out.println("objects are not equal, hence returns " + x.equals(y));
        System.out.println("objects are equal, hence returns " + x.equals(123.45555));
    }
}
