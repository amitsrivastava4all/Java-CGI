import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*
 * J2SE 5.0 provides four annotations in the java.lang.annotation
 *  package that are used only when writing annotations:
 * @Inherited - Annotation are not avaliable in Inheritance , If u want the Annotation Avaliable to child class 
 * @Documented - Annotation can't be documented by javadoc by default , so if u want Annotation documentation will be maintain 
 * @Target - On Which Level u want the Annotation e.g class level , method level , variable level, constructor level , local variable level
 * @Retention - Provide Annotaion only on Source Level (Documentation r provided on Source Level) or
 * Compile time Level or Runtime Level 
 * Annotations are created by using @interface
 
 */
// Define Custom Annotation
@Inherited
/**
 * This is the Example of Class Level Annotation
 * @author amit
 *
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface StoreMeInAFile{
	String filePath() default "/Users/amit/Documents/test1"; 
	String fileType() default ".dat";
	String fileName() default "amit";
	int fileVersion() default 1;
}
@StoreMeInAFile(fileName="studenttest" ,fileVersion=3,fileType=".dat")
class Student
{
	
}

@StoreMeInAFile(fileName="test" ,fileVersion=2,fileType=".data")
class Employee{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
@Inherited
/**
 * This is called Method Level Annotation Example
 * @author amit
 *
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatMe{
	int start() default 1;
	int end() default 5;
	String text() default "Hello Amit";
}
class RepeatThis{
	@RepeatMe(start=1,end=10,text="Hi Amit")
	public void repeatMe(String msg){
		System.out.println(msg);
	}
}
public class CustomAnnotationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		StoreMeInAFile obj = (StoreMeInAFile)emp.getClass().
				getAnnotation(StoreMeInAFile.class);
		System.out.println("Annotaton Info is (Consuming Class Level Annotation) ");
		System.out.println("File Name "+obj.fileName()); 
		System.out.println("File Path "+obj.filePath());
		System.out.println("File Type "+obj.fileType());
		System.out.println("File Version "+obj.fileVersion());
		System.out.println("****************************************************");
		System.out.println("Annotaton Info is (Consuming Method Level Annotation) ");
		RepeatThis r = new RepeatThis();
		Method method =r.getClass().getMethod("repeatMe", String.class);
		RepeatMe object = method.getAnnotation(RepeatMe.class);
		for(int i = object.start(); i<=object.end();i++){
			method.invoke(r, object.text());
		}
	}

}
