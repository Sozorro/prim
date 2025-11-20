class prim {
    private static int c = 0;
    private prim(){
    }
    public static prim make_ob(){
        if(c == 0) {
            prim p = new prim();
            c = 1;
            System.out.println("объект создан");
            return p;
        }
        System.out.println("не более одного объекта");
        return null;
        
    }
}
