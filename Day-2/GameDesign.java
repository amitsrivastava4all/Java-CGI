/*
 * Standard Things
 * What to do things are define in interface
 * Interface = Constants + Abstract Methods
 * Interface all methods are public abstract 
 * interface contains constants and it by default public static final
 * 
 * Interface is 100% Abstract 
 */

abstract interface ISuperPower{
	int DEFAULT_SPEED = 50;
	void fly();
	default void hide(){
		System.out.println("Super Power Hide It...");
	}
	void jump();
}

abstract interface IPlayer{
//interface IPlayer{
	public static final int MAX_SPEED = 100;
	int MIN_SPEED = 10;
	int DEFAULT_SPEED = 20;
	public abstract void run(int speed);
	void jump();
	int attack();
	default void hide(){
		System.out.println("  Hide It for 2 secs...");
	}
}
interface IHybridPlayer extends IPlayer,ISuperPower{
	default void hide(){
		ISuperPower.super.hide();
		IPlayer.super.hide();
		System.out.println(IPlayer.DEFAULT_SPEED);
		System.out.println(ISuperPower.DEFAULT_SPEED);
	}
}
// Fully Implementation
// Contract B/w Class and Interface
// Class - How to Do and Interface - What to do
class YellowPlayerImpl implements IHybridPlayer{
//implements IPlayer,ISuperPower{
	@Override
	public void run(int speed){
		if(speed==0){
			speed = IPlayer.DEFAULT_SPEED + 10;
		}
		if(speed<MAX_SPEED){
			speed+=3;
		}
	}
	
	public void jump(){
		System.out.println("Jump Low...");
	}
	
	public int attack(){
		return 10;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}
/*
 * Run With Speed Increment of 1
 */
class RedPlayerImpl implements IPlayer{
	@Override
	public void run(int speed){
		if(speed==0){
			speed = DEFAULT_SPEED;
		}
		if(speed<MAX_SPEED){
			speed++;
		}
	}
	
	public void jump(){
		System.out.println("Jump High...");
	}
	
	public int attack(){
		return 20;
	}
}
public class GameDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
