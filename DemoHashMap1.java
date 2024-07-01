//implimenting a program using HashMap with country-names as value & country-code as key. 
package com.collections;
//importing java.util.HashMap for HashMap
import java.util.HashMap;
//class-declaration
public class DemoHashMap1 {
    //main-function
	public static void main(String[] args) {
	//creating object of HashMap in Collections
     HashMap<Integer, String> hm = new HashMap<Integer,String>();
     //declaring country code as a key & country-names as a value
     //put method for keys&values   Note:Every key must be unique
     hm.put(91,"India");
     hm.put(61,"Australia");
     hm.put(880,"Bangladesh");
     hm.put(32,"Belgium");
     hm.put(55,"Brazil");
     hm.put(1,"Canada");
     hm.put(20,"Egypt");
     hm.put(33,"France");
     //printing all keys&values  and it is not preserve the insertion order
     System.out.println(hm);
     hm.put(49,"Germany");
     //printing all Keys & values including above put method
     System.out.println(hm);
     //printing size of the keys
     System.out.println(hm.size());
     //printing value based on key
     System.out.println(hm.get(91));
     //printing new value from old value
     System.out.println(hm.replace(20, "Egypt", "EGYPT"));
  
	}

}
