package exercises;

public class Exercise1_3 {
    public static void main(String[] args) {
        int areaA = 0;
        int areaB = 0;
        if (args.length != 2) {
            System.out.println("Write two numbers of circles radius");
        } else {
            try {
                areaA = Integer.parseInt(args[0]);
                areaB = Integer.parseInt(args[1]);
            }catch (NumberFormatException e){
                System.out.println("Write arguments with numbers");
            }
            System.out.println(getCircleArea(areaA)-getCircleArea(areaB));
        }
    }

    public static double getCircleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
