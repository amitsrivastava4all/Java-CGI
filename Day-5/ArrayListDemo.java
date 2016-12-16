import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Item{
	private int id;
	private String name;
	private double price;
	
	@Override
	public boolean equals(Object o){
		Item item = null;
		if(o instanceof Item){
			item = (Item)o; // Downcasting
			if(this.id==item.id && this.name.equals(item.name)){
				return true;
			}
		}
		return false;
	}
	Item(int id , String name , double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Price "+price;
	}
	
}

class ItemOperation{
	ArrayList<Item> itemList = new ArrayList<>();
	 
	public void addItem(int id , String name , double price){
		Item item = new Item(id , name, price);
		itemList.add(item);
	}
	
	public String deleteItem(int index){
		return itemList.remove(index)!=null?"Record Deleted ":"Error in Deletion";
		//return ;
	}
	
	public int searchItem(int id , String name){
		Item searchObject = new Item(id,name,0);
		return itemList.indexOf(searchObject);
	}
	
	public void printItem(){
		//System.out.println(itemList);
		// 1st Way (tradional Loop)
//		for(int i = 0 ; i<itemList.size(); i++){
//			Item obj = itemList.get(i);
//			System.out.println("Id "+obj.getId()+" Name "+obj.getName()+" Price "+obj.getPrice());
//		}
		// 2nd Way
//		Iterator<Item> itemIterator = itemList.iterator();
//		while(itemIterator.hasNext()){
//			Item itemObject = itemIterator.next();
//			//itemIterator.remove();
//			System.out.println(itemObject);
//		}
		// No Start , No End , No Increment , Allow Deletion as well
		// Only One Direction
//		ListIterator<Item> itemIterator = itemList.listIterator();
//		while(itemIterator.hasNext()){
//			Item itemObject = itemIterator.next();
//			//itemIterator.remove();
//			System.out.println(itemObject);
//		}
//		// Same Like Iterator but Both Direction Traverse is Possible
//		while(itemIterator.hasPrevious()){
//			Item itemObject = itemIterator.previous();
//			//itemIterator.remove();
//			System.out.println(itemObject);
//		}
		// Java 5 Enhance For Loop
//		for(Item item : itemList){
//			System.out.println(item);
//		}
		// Java 8 ForEach Function
		itemList.forEach((item)->System.out.println(item));
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CRUD Operations
		ItemOperation itemOper = new ItemOperation();
		System.out.println("1. Add a New Item");
		System.out.println("2. Delete an Existing Item");
		System.out.println("3. Search an Item");
		System.out.println("4. Print an Item");
		System.out.println("5. Update an Item");
		System.out.println("6. Count an Item price>10000");
		System.out.println("7. Count Total whose >5000 Amount of Item");
		System.out.println("8. Sorting by Price");
		System.out.println("9. Sorting by Name");
		System.out.println("10 . For Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Choice...");
		int choice = scanner.nextInt();
		while(true){
			switch(choice){
			case 1:
				System.out.println("Enter the Id");
				int id = scanner.nextInt();
				System.out.println("Enter the Name");
				String name = scanner.next();
				System.out.println("Enter the Price");
				double price = scanner.nextDouble();
				itemOper.addItem(id, name, price);
				break;
			case 2:
				System.out.println("Enter the Id to Delete");
				 id = scanner.nextInt();
				System.out.println("Enter the Name to Delete");
				name = scanner.next();
				int index = itemOper.searchItem(id,name);
				System.out.println(index>=0?itemOper.deleteItem(index):"Not Found");
				break;
			case 3:
				System.out.println("Enter the Id to Search");
				 id = scanner.nextInt();
				System.out.println("Enter the Name to Search");
				name = scanner.next();
				 index = itemOper.searchItem(id,name);
				System.out.println(index>=0?"Found":"Not Found");
				break;
			case 4:
				itemOper.printItem();
				break;
			} // switch code ends
			System.out.println("Enter the Choice...");
			 choice = scanner.nextInt();
		} //loop ends

	}

}
