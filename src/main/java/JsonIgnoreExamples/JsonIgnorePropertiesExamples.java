package JsonIgnoreExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClasses.Employee;

public class JsonIgnorePropertiesExamples {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException
	{
		String jsonString = "{\r\n"
				+ "  \"name\" : \"Samarth\",\r\n"
				+ "  \"age\" : 26\r\n"
				+ "}";
		
		// DeSerailzation
		// How to extarct vales from dynamic json response using pojo classes
		// How to ignore unkown properties during deserailization
		// What is the use of @JsonIgnore Properties annoation ?
		
		ObjectMapper objMap = new ObjectMapper();
		
		Employee empObj = objMap.readValue(jsonString, Employee.class);
		
		System.out.println("Age is "+empObj.getAge());
		System.out.println("Name is "+empObj.getName());
		
		System.out.println("Address is "+empObj.getAddress());
		System.out.println("Mobile No is "+empObj.getMobileNo());
		System.out.println("Family Members are "+empObj.getFamilyMembers());
		System.out.println("Skill Set are "+empObj.getSkilSet());
		
	}

}
