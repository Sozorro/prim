public class Prim2M {
    private static int c = 0;
    private Prim2M (){
        System.out.println("объект создан");
        int c = 0;
    }
    public static Prim2M mack() {
        System.out.println(c);
        if (c <= 1) {
            Prim2M a = new Prim2M();
            c++;
            return a;
        }
        else {
            System.out.println("более 2 объектов");
            return null;
        }
    }
    public static Prim2M mack2() {
        Prim2M a = new Prim2M();
        c++;
        return a;
    }

}
