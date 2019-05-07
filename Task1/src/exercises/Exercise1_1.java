package exercises;

public class Exercise1_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        if (args.length == 3){
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);
            } catch (NumberFormatException e){
                System.out.println("you arguments isn't numbers, write 3 number");
            }

            if (a == b && b == c){
                System.out.println("numbers are equal");
            } else {
                System.out.println("numbers not equal");
            }
        } else {
            System.out.println("Write 3 number argument, with space between them");
        }
    }
}
