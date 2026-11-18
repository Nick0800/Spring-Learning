package com.spring.learn;

import com.spring.learn.dependencyInj.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);

		// Here I created an object of Student class and called the code method to print the message "Coding in Java"
		// But now I want spring to create an object of Student class and call the code method to print the message "Coding in Java"
        // Student student = new Student();
		// student.code();

		//In order to create and manage the object of Student class by spring, we need to use ApplicationContext interface.
		ApplicationContext context = SpringApplication.run(LearnApplication.class, args);
		// Here we are asking IOC container to give us the object of Student class and then we are calling the code method to print the message "Coding in Java".
		// But IOC container will provide the object of Student class only if it present in the IOC container. But we didn't tell spring to create the object of Student class and manage it in the IOC container. So we need to tell spring to create the object of Student class and manage it in the IOC container.

		// We need to create a bean first.  we need to tell spring to create the object of Student class and manage it in the IOC container. We can do this by using @Component annotation on the Student class. This will tell spring to create the object of Student class and manage it in the IOC container. Now we can ask IOC container to give us the object of Student class and then we can call the code method to print the message "Coding in Java".
		Student stu = context.getBean(Student.class);
		stu.code();

		//I can create multiple objects of Student class and call the code method to print the message "Coding in Java" but spring will create only one object of Student class and manage it in the IOC container. So if I ask IOC container to give me the object of Student class again, it will give me the same object of Student class which is already present in the IOC container. This is called singleton scope. By default, spring creates only one object of a class and manage it in the IOC container. But if I want to create multiple objects of a class and manage them in the IOC container, I can use @Scope annotation on the Student class. This will tell spring to create multiple objects of Student class and manage them in the IOC container.
		Student st = context.getBean(Student.class);
		st.code();
	}

}
