import classes.farm.Farm;
import classes.rig.Rig;
import classes.field.Field;
import classes.location.Location;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//create ArrayList that holds a farms fields, a farm will then be represented by a location, and field class
public class Main {
    ArrayList<Field> fields = new ArrayList<Field>();
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            Rig rig = new Rig();
            Farm farm = createFarm(scanner);
            farm.display();
            rig.randomizeRig();
        }




	 }
    public static Location createLocation(Scanner scanner) {
        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();

        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();

        return new Location(latitude, longitude);
    }
    public static Farm createFarm(Scanner scanner){
        ArrayList<Field> fields = new ArrayList<Field>();
        System.out.println("Enter Farm name: ");
        String farmName = scanner.nextLine();

        System.out.println("Enter number of fields: ");
        int fieldNum = scanner.nextInt();
        while(fieldNum > 15 || fieldNum < 1){
            System.out.print("Invalid amount. Enter a number from 1 to 15: ");
            fieldNum = scanner.nextInt();
        }
        for(int i = 0; i < fieldNum; i++){
            Field field = createField(scanner);
            fields.add(field);
        }
        fields.sort(Comparator.comparingInt(Field::getAcres).reversed());
        Location location = createLocation(scanner);
        return new Farm(farmName, location, fields);
    }
    public static Field createField(Scanner scanner){
        System.out.println("How many acres does the field have?");
        int acres = scanner.nextInt();
        return new Field(acres);
    }
}
