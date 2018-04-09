package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.impl.StudentJDBC;
import com.demo.model.Student;

/**
 * @author Bhavesh
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
    	
    	StudentJDBC studentjdbc=(StudentJDBC)context.getBean("studentJDBC");
    	Student stu=new Student(1 ,"Amit", 28);
    	studentjdbc.insert(stu);
    	System.out.println("Inserted SuccessFully");
    	Student sturecord=studentjdbc.findByStudentId(stu.getStuId());
    	System.out.println("Student Records :"+sturecord);
    }
}
