package Задание1;

public class onesix {
    public static void main(String[] args) {

        onesix program = new onesix();
        boolean res=program.isUpperCase('K');
        System.out.println(res);

    }
    public boolean isUpperCase (char x) {
        if (Character.isUpperCase(x)) {
            return true;
        }
        else {
            return false;
        }
    }
}