/**
 * DemoRPCImpl.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf172002.01 v11520123053
 */

package rpc.demo;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.holders.StringHolder;

public class DemoRPCImpl implements DemoRPC_PortType {
	
	private static HashMap<String, Person> personMap = null;

	private static Map<String, Map<String, Person>> nameMap = new HashMap<String, Map<String, Person>>();

	public DemoRPCImpl() {
		populateMap();
	}
	
    public Person demoPerson(Person person) throws java.rmi.RemoteException {
    	System.out.println("Looking up Person with First Name:" + person.getFirstName() + " and Last Name: " + person.getLastName());
	
    	Person returnPerson = lookupPerson(person);
    	if(returnPerson != null) {
    		System.out.println("Person Found!");
    		return returnPerson;
    	} else 
    		populateMap();
    	
        return lookupPerson(person);
    }

    private Person lookupPerson(Person person) {
		if(nameMap != null && person.getLastName() != null) {
			Map<String, Person> lookUpPersonMap = new HashMap<String, Person>();
			if(nameMap.get(person.getLastName()) != null) {
				lookUpPersonMap = nameMap.get(person.getLastName());
				if(lookUpPersonMap.containsKey(person.getFirstName()))
					return lookUpPersonMap.get(person.getFirstName());
				else {
				   	System.out.println("Did not contain first name");
				
					return null;
				}
			}
			else { 
				System.out.println("Did not contain Last Name");
				return null; 
			}
		}
		else {
			System.out.println("person.getLastName() == null");
			return null;
		}
	}

	private void populateMap() {

		
		Person janeDoe = new Person();
		
    	janeDoe.setFirstName("Jane");
    	janeDoe.setLastName("Doe");
    	janeDoe.setAge(23);
    	janeDoe.setPlaceOfBirth("Duxford");
		

		Person johnDoe = new Person();
		johnDoe.setFirstName("John");
		johnDoe.setLastName("Doe");
    	johnDoe.setAge(32);
    	johnDoe.setPlaceOfBirth("Bern");
    	
    	personMap = new HashMap<String, Person>();
    	personMap.put("Jane", janeDoe);
    	personMap.put("John", johnDoe);
    	
    	nameMap.put("Doe", personMap);
		
	}

}
