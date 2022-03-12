import java.lang.Math;
public class math {
    public static void main(String[] args){
        int a = 27;
        double b = 9.5;
        long c = 4356;
        System.out.println(Math.abs(b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.round(b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.cbrt(a));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.signum(b));
        System.out.println(Math.ceil(b));
        System.out.println(Math.floor(b));
        System.out.println(Math.copySign(a,b));
        System.out.println(Math.floorDiv(50,10));
        System.out.println(Math.random());
        System.out.println(Math.rint(b));
        System.out.println(Math.hypot(a,b));
        System.out.println(Math.IEEEremainder(a,b));
        System.out.println(Math.addExact(678,3));
        System.out.println(Math.subtractExact(678,3));
        System.out.println(Math.multiplyExact(678,3));
        System.out.println(Math.incrementExact(3));
        System.out.println(Math.decrementExact(3));
        System.out.println(Math.negateExact(3));
        System.out.println(Math.toIntExact(c));
        System.out.println(Math.log(0));
        System.out.println(Math.log10(a));
        System.out.println(Math.log1p(3));
        System.out.println(Math.exp(3));
        System.out.println(Math.expm1(3));
        System.out.println(Math.sin(a));
        System.out.println(Math.asin(a));
        System.out.println(Math.sinh(a));
        System.out.println(Math.toDegrees(a));
    }
}
