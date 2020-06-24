package hashTable;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<String, String> hashtable = new Hashtable<>();
         
	        //2. Add mappings to hashtable 
	        hashtable.put("",  "A");
	        hashtable.put("",  "B" );
	        hashtable.put("",  "C");
	         
	        System.out.println(hashtable);
	         
	        //3. Get a mapping by key
	        String value = hashtable.get(1);        //A
	        System.out.println(value);
	         
	        //4. Remove a mapping
	        hashtable.remove(3);            //3 is deleted
	         
	        //5. Iterate over mappings
	        Iterator<String> itr = hashtable.keySet().iterator();
	         
	        while(itr.hasNext()) 
	        {
	            String key = itr.next();
	            String mappedValue = hashtable.get(key);
	             
	            System.out.println("Key: " + key + ", Value: " + mappedValue);
	        }
	    }
	

	
	
	

}
