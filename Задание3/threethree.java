package Задание3;

public class threethree {

    public static void main(String[] args) {
        threethree program = new threethree();
        String res = program.chet(9);
    }

    public String chet (int x) {
        for (int i=0; i<=x; i+=2) {
            System.out.print(i+" ");
        }
        return null;
    }
}
