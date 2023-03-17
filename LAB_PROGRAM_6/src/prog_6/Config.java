package prog_6;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable

public class Config {

	@Bean
	public Student Student_bean() {
		return new Student();
	}
	
	@Bean
	public Marks Marks_bean() {
		return new Marks();
	}
	
}
