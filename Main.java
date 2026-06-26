import classes.farm.Farm;
import classes.rig.Rig;
import classes.route.Route;
import classes.field.Field;
import java.util.Random;

public class Main {
    public static void main(String[] args) { 
        Field myField = new Field();
        Random random = new Random();
        myField.setAcres(random.nextInt(40,150));
        System.out.println(myField.getAcres());
	 }
}
