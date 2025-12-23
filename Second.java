public class Second {
    public static char prompt(String str) 
    throws java.io.IOException { 
        System.out.print(str + ": ");
        throw new java.io.IOException();
        //return (char) System.in.read();
    }
    public static void main(String args[]) {
        char ch;
        try {
        ch = prompt("Enter а letter");
        }
        catch(java.io.IOException ехс) {
            System.out.println("Пpoизoшлo исключение ввода-вывода");
            ch = 'Х';
        }
        System.out.println("Bы нажали клавишу " + ch);
    }
}
