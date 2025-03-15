package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] a = {"Arun","Gowtham","Yahoo"};
		//List<String> b= Arrays.asList(a);
		//b.stream().filter(s->s.st)
		
		
		List<Integer> c =Stream.of(2,4,5,4,2,5,1).distinct().sorted().collect(Collectors.toList());
		System.out.println(c.get(2));
		

	}

}
