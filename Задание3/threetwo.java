package Задание3;

public class threetwo {

    public static void main(String[] args) {
        threetwo program = new threetwo();
        program.reverseListNums(5);
    }

    public String reverseListNums (int x) {
        for (int i=x; i>-1; i--) {
        System.out.print(i+" ");
        }
        return null;
    }
}
