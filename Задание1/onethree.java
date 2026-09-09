package Задание1;

public class onethree {

    public static void main(String[] args) {

        onethree program = new onethree();
        int res = program.charToNum('5');
        System.out.println(res);
    }

    public int charToNum(char x) {
        return Character.getNumericValue(x);
    }
}


