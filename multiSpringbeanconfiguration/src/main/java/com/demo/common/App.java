package com.demo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.SchoolInfo;
import com.demo.pojo.StudentInfo;
import com.demo.pojo.TeacherInfo;


/**
 * @author Bhavesh
 *
 */

public class App {
	
	 public static void main( String[] args )
	    {
		 ApplicationContext context=new ClassPathXmlApplicationContext("SpringBean-All.xml");
	       StudentInfo studentInfo=(StudentInfo)context.getBean("StudentInfo");
	       studentInfo.getStudentInfo();
	       TeacherInfo teacherInfo=(TeacherInfo)context.getBean("TeacherInfo");
	       teacherInfo.getTeacherinfo();
	       SchoolInfo schoolInfoInfo=(SchoolInfo)context.getBean("SchoolInfo");
	       schoolInfoInfo.getStudentInfo();
	    }
}
