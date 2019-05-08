package exercises;


public class Exercise1_2 {
    public static void main(String[] args) {
        double dinoWeightInKilos = 0;

        try {
            dinoWeightInKilos = Double.parseDouble(args[0]);
        } catch (NumberFormatException e){
            System.out.println("write dino weight in kilos");
        }

        if (args.length != 1){
            System.out.println("write dino weight in kilos");
        }else {
            System.out.println("weight of dinosaur in kilos: " + dinoWeightInKilos);
            System.out.println("weight of dinosaur in milligrams: " + (dinoWeightInKilos*10000));
            System.out.println("weight of dinosaur in grams: " + (dinoWeightInKilos*1000));
            System.out.println("weight of dinosaur in tons: " + (dinoWeightInKilos/1000));
        }
    }
}
