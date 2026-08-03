package classes.farm;
import classes.field.Field;
import classes.location.Location;
import java.util.ArrayList;


public class Farm {
	private String name;
	private Location location;
	private Field field;
	private ArrayList<Field> fields;

	public Farm(String name, Location location, ArrayList<Field> fields) {
		this.location = location;
		this.name = name;
		this.fields = fields;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display(){
		System.out.println(name);
		System.out.println(location.getLatitude());
		System.out.println(location.getLongitude());
		for(int i = 0; i < fields.size();i++){
			System.out.println("Field acres: " + fields.get(i).getAcres());
		}
	}



}
