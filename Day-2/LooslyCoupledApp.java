import java.util.ResourceBundle;

import javax.annotation.Resource;

interface IProducer{
	void f1();
}
class FasterProducer implements IProducer{
	@Override
	public void f1(){
		System.out.println("Feature 1 More Faster");
		f2("Hello");
		dontShowThis(100, 200);
	}
	public void f2(String msg)
	{
		System.out.println("Feature 2 More Faster"+msg);
	}
	public void dontShowThis(int x,int y){
		System.out.println("No Direct Access of this feature..");
	}
}
class Producer implements IProducer
{
	@Override
	public void f1(){
		System.out.println("Feature 1");
		f2("Hello");
		dontShowThis(100, 200);
	}
	public void f2(String msg)
	{
		System.out.println("Feature 2 "+msg);
	}
	public void dontShowThis(int x,int y){
		System.out.println("No Direct Access of this feature..");
	}
}
class Factory{
	public static IProducer getObject(){
		// First Read the Property File
		ResourceBundle rb = ResourceBundle.getBundle("object");
		String className = rb.getString("classname");
		IProducer producer =null;
		try{
		producer= (IProducer)Class.forName(className).newInstance();
		}
		catch(Exception e){
			System.out.println(e);
		}
		// static way of object creation
		//IProducer producer = new Producer();
		return producer;
	}
}
class Consumer{
	void callMe(){
		IProducer producer = Factory.getObject();
		//IProducer producer = new FasterProducer();
		//Producer producer = new Producer(); //Tightly Coupled Code
		producer.f1();
		//producer.f2();
		//producer.dontShowThis();
	}
}
class ConsumerTwo{
	void callMe(){
		IProducer producer = Factory.getObject();
		
		producer.f1();
		
	}
}
public class LooslyCoupledApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer consumer  = new Consumer();
		consumer.callMe();

	}

}
