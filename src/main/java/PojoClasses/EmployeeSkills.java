package PojoClasses;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@JsonIncludeProperties(value = {"name","skills"})
public class EmployeeSkills extends Employee {
	
	// @JsonIncludeProperties(value = {"name","skills"}) it will include only those field mentioned in value array 
	
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
