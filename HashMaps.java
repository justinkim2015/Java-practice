import java.util.HashMap;

public class HashMaps { 
  public static int ageUp(int age) {
    return age + 1;
  }

  public static void main(String[] args) {
    HashMap<String, Integer> ages = new HashMap<String, Integer>();
    ages.put("Justin", 30);
    ages.put("Maya", 27);
    ages.put("Mom", 59);
    ages.put("Alyssa", 27);

    System.out.println(ages);

    String name = "Justin";
    int newAge = ageUp(ages.get(name));

    System.out.println(name + " is now " + newAge);
  }
}
