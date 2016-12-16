import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class SortByPrice implements Comparator<Item>{
	public int compare(Item one , Item two){
		return ((Double)one.getPrice()).compareTo(two.getPrice());
	}
}
class SortByName implements Comparator<Item>{
	public int compare(Item one , Item two){
		//return one.getName().compareToIgnoreCase(two.getName());
		return two.getName().compareToIgnoreCase(one.getName());
	}
}

class Item {//implements Comparable<Item>{
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
	int countByPrice = 0;
	double sumByPrice = 0;
	
	public void updateItem(int index, Item updatedObject){
		itemList.set(index, updatedObject);
	}
	
	public void addItem(int id , String name , double price){
		Item item = new Item(id , name, price);
		itemList.add(item);
	}
	
	public String deleteItem(int index){
		return itemList.remove(index)!=null?"Record Deleted ":"Error in Deletion";
		//return ;
	}
	
	public void sortByPrice(){
		//Collections.sort(itemList, new SortByPrice());
		Collections.sort(itemList,(one,two)->((Double)one.getPrice())
				.compareTo(two.getPrice()));
	}
	
	public void sortByName(){
		//Collections.sort(itemList,new SortByName());
		Collections.sort(itemList,(one,two)->
		one.getName().compareToIgnoreCase(two.getName()));
	}
	
	public int searchItem(int id , String name){
		Item searchObject = new Item(id,name,0);
		return itemList.indexOf(searchObject);
	}
	
	public int count(int price){
		return (int)itemList.
		stream()
		.filter((itemObject)->itemObject.getPrice()>=price)
		.mapToDouble((y)->y.getPrice()).count();
		
//		itemList.forEach((itemObject)->{
//			if(itemObject.getPrice()>=price){
//				countByPrice++;
//			}
//		});
//		return countByPrice;
	}
	
public double sum(int price){
	//return itemList.stream().
	//filter((itemobject)->itemobject.getPrice()>=price).
	//mapToDouble((x)->x.getPrice()).sum();
	
	return itemList.parallelStream().
			filter((itemobject)->itemobject.getPrice()>=price).
			mapToDouble((x)->x.getPrice()).sum();
	
	
//		itemList.forEach((itemObject)->{
//			if(itemObject.getPrice()>=price){
//				sumByPrice = sumByPrice + itemObject.getPrice();
//			}
//		});
//		return sumByPrice;
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
		myloop:
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
			case 5:	
				System.out.println("Enter the Id to Search");
				 id = scanner.nextInt();
				System.out.println("Enter the Name to Search");
				name = scanner.next();
				 index = itemOper.searchItem(id,name);
				 if(index>=0){
					 Item item = new Item(1009,"Updated Value",2222);
					 itemOper.updateItem(index, item);
					 System.out.println("Updated....");
				 }
				 else
				 {
					 System.out.println("Not Found...");
				 }
				 break;
			case 6:
				System.out.println("Count >10000 "+itemOper.count(10000));
				itemOper.countByPrice=0;
				break;
			case 7 :
				System.out.println("Sum >10000 "+itemOper.sum(10000));
				itemOper.sumByPrice=0;
				break;
			case 8:
				itemOper.sortByPrice();
				break;
			case 9 : 
				itemOper.sortByName();
				break;
			case 10 :
				System.out.println("Exit....");
				break myloop;
			} // switch code ends
			System.out.println("Enter the Choice...");
			 choice = scanner.nextInt();
		} //loop ends
		System.out.println("Good Bye User, Thanks For Using");
	}

}
