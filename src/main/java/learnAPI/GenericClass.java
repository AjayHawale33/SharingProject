package learnAPI;

import java.util.Random;

public class GenericClass {
	
	 static String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	 static String numbers="0123456789";
	public static String randomName() {	
		        int length = 10;
		        StringBuilder r = new StringBuilder();
		        // Create a Random object for generating random indices.
		        Random random = new Random();
		        // Generate the random string.
		        for (int i = 0; i < length; i++) {
		            int randomIndex = random.nextInt(characters.length());
		            char randomChar = characters.charAt(randomIndex);
		            r.append(randomChar);
		        }
                     return r.toString();
                    
	}
	
	public static String randomNumber() {	
        int length = 10;
        StringBuilder r = new StringBuilder();
        // Create a Random object for generating random indices.
        Random random = new Random();
        // Generate the random string.
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(randomIndex);
            r.append(randomChar);
        }
             return r.toString();
	}
            
public static String auth() {
	
	return "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidWlkIjoiMjAxMDA4MDEiLCJuYW1lIjoiQnJpamVzaCBTaW5naCIsImVtYWlsIjoicHJhdmVlbi5rdW1hci5rQGJyaWdvc2hhLmNvbSIsInBob25lIjoiOTUzODAwMDAwMCIsInJvbGUiOiJWaWNlIFByZXNpZGVudCIsInVzZXJSb2xlcyI6WyJEZXBhcnRtZW50IEhlYWQiLCJTdXBlciBBZG1pbiJdLCJwcml2aWxlZ2UiOlsiTm9uZSJdLCJkZXNpZ25hdGlvbiI6IkNFTyIsInBhc3N3b3JkVG9rZW4iOiI2NGYxZWJmYmQ4MDkzIiwicHJvZmlsZUltYWdlIjoiaHR0cHM6Ly9kZXYtcG10LWJyaWdvc2hhLnMzLmFwLXNvdXRoLTEuYW1hem9uYXdzLmNvbS9maWxlcy9JTUdfMjAyMzA4MTdfMTEwOTE2LmpwZyIsImlhdCI6MTY5ODI5NjIyMCwiZXhwIjoxNjk4MzM5NDIwfQ.YvtM01AIjn2K8XJn9TVFItOkId_Vwy46XbuOnQ096as";
		
	}

public static String reqBody()
{
	    return "{\"name\":\""+randomName()+"\",\"uid\":\""+randomNumber()+"\",\"email\":\""+randomName()+"@gmail.com\",\"phone\":\""+randomNumber()+"\",\"joined\":\"2023-10-10\",\"designation\":\"Associate software Engineer\",\"userRoles\":[\"Associate\"],\"privilege\":[\"None\"]}";
	    
}

}



