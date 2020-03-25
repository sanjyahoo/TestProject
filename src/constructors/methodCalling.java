package constructors;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class methodCalling {
	
    public static void main(String[] args)  
    {
    	Map<String,Integer> m = new HashMap<String,Integer>();
    	m.put("Meghna", 001);
    	m.put("1 - Bedroom" , 25000); 
        m.put("2 - Bedroom" , 50000);
    	m.put("3 - Bedroom" , 75000); 
        m.put("1 - Bedroom - hall", 65000); 
        m.put("2 - Bedroom - hall", 85000); 
        m.put("3 - Bedroom - hall", 105000); 
        
        //Set<Map.Entry<String,Integer>> s = m.entrySet();
        System.out.println("Initial Mappings are: " + m); 

        
        //System.out.println("The Value is: " + m.get("1 - Bedroom")); 

    }


}
