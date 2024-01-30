package PojoClasses;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	
	// @JsonInclude(JsonInclude.Include.NON_NULL)  --> will take collection or variable with null values as well
	// @JsonInclude(JsonInclude.Include.NON_EMPTY) --> Will exclude empty collection
	// @JsonInclude(JsonInclude.Include.NON_EMPTY) --> will exclude collection or variable with default value
	// We can't pass multiple @JsonInclude in single class, to pass multiple @JsonInclude we can use in property level(video 63)
	// @JsonIgnoreProperties(ignoreUnknown = true)  --> Will exclude those properties which are are not part of java Object or json
	
	private String name;
	private int age;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean married;
	private String address;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String mobileNo;
	private List<String> skilSet;
	private Map<String,String> familyMembers;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<String> getSkilSet() {
		return skilSet;
	}
	public void setSkilSet(List<String> skilSet) {
		this.skilSet = skilSet;
	}
	public Map<String,String> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(Map<String,String> familyMembers) {
		this.familyMembers = familyMembers;
	}
}
	
	


