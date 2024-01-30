package JsonPropertyExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClasses.Book;

public class JsonPropertyExp {
	
	public static void main(String[] args) throws JsonProcessingException
	{
		Book b = new Book();
		
		b.setBookName("Data Structure");
		b.setAuthorName("Mark Henry");
		
		ObjectMapper obj = new ObjectMapper();
		
		// Seralization
		String bookObj = obj.writerWithDefaultPrettyPrinter().writeValueAsString(b);
		
		System.out.println(bookObj);
		
		// DeSerailazation
		Book b1 = obj.readValue(bookObj, Book.class);
		
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getBookName());
	}

}
