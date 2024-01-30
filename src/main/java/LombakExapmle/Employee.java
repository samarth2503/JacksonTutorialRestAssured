package LombakExapmle;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter(value = lombok.AccessLevel.PUBLIC)
@Setter
@Builder(toBuilder = true)
public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	

}
