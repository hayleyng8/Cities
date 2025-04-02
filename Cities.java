import java.util.HashMap; // Import the HashMap Class
/**
 * Practice Hashmap Cities with Miss Wang
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cities
{
    public static void main(String[] args){
        HashMap<String, String> capCities = new HashMap<String, String>();
        
        // Add keys and values (countries and capCities)
        capCities.put("New Zealand", "Wellington");
        capCities.put("Australia", "Canberra");
        capCities.put("Germany", "Berlin");
        capCities.put("Norway", "Oslo");
        capCities.put("USA", "Washington DC");
        
        System.out.println(capCities);
        System.out.println(capCities.get("New Zealand"));
        
        // Remove keys
        capCities.remove("USA");
        System.out.println(capCities);
        
        // Check the Size
        System.out.println(capCities.size());
    }
}
