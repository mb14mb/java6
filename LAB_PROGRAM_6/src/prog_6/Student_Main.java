package prog_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;


public class Student_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Student s =(Student)context.getBean(Student.class);
		System.out.println("Enter USN : ");
		String usn = sc.next();
		System.out.println("Enter Name : ");
		String name = sc.next();
		s.setUSN(usn);
		s.setName(name);
		
		Marks m =(Marks)context.getBean(Marks.class);
		System.out.println("Enter Marks 1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter Marks 2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter Marks 3 : ");
		int m3 = sc.nextInt();
		m.setM1(m1);
		m.setM2(m2);
		m.setM3(m3);
	
		System.out.println(s.toString());
		System.out.println(m.toString());
		
	}

}
