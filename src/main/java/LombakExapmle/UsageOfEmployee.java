package LombakExapmle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UsageOfEmployee {

	public static void main(String[] args) throws JsonProcessingException {
		
		Employee emp = Employee.builder()
				.firstName("Samarth")
				.age(26)
				.lastName("Jain")
				.build();
		
		ObjectMapper obj = new ObjectMapper();
		
		String op = obj.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		
		System.out.println(op);
	}

}
