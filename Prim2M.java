class Prim2M {
    public static void main(String[] args) {
        prim p = prim.make_ob();
        System.out.println(p);
        prim p1 = prim.make_ob();
        System.out.println(p1);
        prim2 p2 = prim2.make_ob();
        System.out.println(p2);
        prim2 p3 = prim2.make_ob();
        System.out.println(p3);
    }
    class prim2 {
        private static int c = 0;
        private prim2(){
        }
        public static prim2 make_ob(){
            if(c == 0) {
                prim2 p = new prim2();
                c = 1;
                System.out.println("объект создан");
                return p;
            }
            System.out.println("не более одного объекта");
            return null;
            
        }
    }
}
