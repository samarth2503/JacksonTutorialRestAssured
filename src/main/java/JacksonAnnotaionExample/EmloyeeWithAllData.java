package JacksonAnnotaionExample;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClasses.Employee;
import PojoClasses.EmployeeSkills;

public class EmloyeeWithAllData {
	
	public static void main(String[] args) throws JsonProcessingException
	{
		EmployeeSkills emp1 = new EmployeeSkills();
		
		emp1.setName("Samarth");
		emp1.setAge(0);
		emp1.setMarried(false);
		emp1.setAddress("Mumbai");
		//emp1.setMobileNo();
		emp1.setSkilSet(new ArrayList<String>());
		emp1.setFamilyMembers(new HashMap<String,String>());
		emp1.setSkills("Java");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonFormat = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		
		System.out.println(jsonFormat);
		
		
	}

}
