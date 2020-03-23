
import java.util.HashMap;

public class hashMapProject {

	public static void main(String[]args){
	
	HashMap users = new HashMap<>();
	
	users.put("Kealy",34);
	users.put("Bonnie",25);
	
	//////////(key, value)////
	
	//////Creating a real HashMap with properties///
	HashMap < String, Integer> newUser = new HashMap<>();
	newUser.put("Sue",34);
	
	
	
	
	
	//A way to print out Key, and Value with an ITERATOR///
	Iterator it = users.entrySet().iterator();
	
	while (it.hasNext()){
		Map.Entry pair = (Map.Entry) it.next();
		
		System.out.println(pair.getKey() + "=" + pair.getValue());
	}
	
	///Boolean statement for HashMap//
	
	if (users.containskey("life")){
	
		System.out.println("Yay");}
		
		else{
		
			System.out.println("Nay");}
			
			
	/*System.out.println("Values:" + users.values());
	System.out.println("Entire values:" + users.entrySet());
	
	
	System.out.println(users.get("Kealy"));
	System.out.println(users.get("Bonnie"));
	
	
	*/
	
	
	
	
	
	
	
	
	
	}


}