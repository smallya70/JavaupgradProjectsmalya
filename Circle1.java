public class Circle1{
    public static float radius = 10.0f;
    public static void main(String[] a){
        System.out.println(Circlex.area(radius));
    }
}

class Circlex{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }
}