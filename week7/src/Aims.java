import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Aims {
	public static Order order;
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void main(String[] args) {
		int flag;
		final ArrayList<Media> ordersList = new ArrayList<Media>();
		Scanner sc = new Scanner(System.in);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setDirector("Roger Allers");
		dvd1.setCost(20.0f);
		dvd1.setLength(87);
		//anOrder.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fition");
		dvd2.setDirector("George");
		dvd2.setCost(30.0f);
		dvd2.setLength(100);
		//order2.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Test");
		dvd3.setCategory("Animation");
		dvd3.setDirector("Roger Allers1");
		dvd3.setCost(100.0f);
		dvd3.setLength(89);
		//anOrder.addMedia(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("One piece");
		dvd4.setCategory("Animation");
		dvd4.setDirector("Odda");
		dvd4.setCost(150.0f);
		dvd4.setLength(150);
		//anOrder.addMedia(dvd4);
		Book b1 = new Book("AAA","Tam li",100.0f);
		b1.addAuthor("XXX");
		do{
			showMenu();
			System.out.print("Enter flag= ");
			flag = sc.nextInt();
			switch(flag){
				case 1:{
					final Order order = new Order();
					ordersList.add(order);
					System.out.println("The order has been created");
					break;
				}
				case 2:{
					ordersList.get(ordersList.size()-1).addMedia(dvd1);
					ordersList.get(ordersList.size()-1).addMedia(dvd2);
					ordersList.get(ordersList.size()-1).addMedia(dvd3);
					ordersList.get(ordersList.size()-1).addMedia(dvd4);
					ordersList.get(ordersList.size()-1).addMedia(b1);
					break;
				}
				case 3:{
					int index;
					System.out.print("Enter delete index: ");
					index = sc.nextInt();
					ordersList.get(ordersList.size()-1).removeMedia(index);
					break;
				}
				case 4:{
					ordersList.get(ordersList.size()-1).listOfItem();
					break;
				}
				case 0:{
					System.out.println("Thanks");
					System.exit(-1);
					break;
				}
				default:{
					System.out.println("Error");
					break;
				}

			}
		}while(flag!=0);
		sc.close();
	/*Order anOrder = new Order();
	Order order2 = new Order();

	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	dvd1.setCategory("Animation");
	dvd1.setDirector("Roger Allers");
	dvd1.setCost(20.0f);
	dvd1.setLength(87);
	anOrder.addMedia(dvd1);
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
	dvd2.setCategory("Science Fition");
	dvd2.setDirector("George");
	dvd2.setCost(30.0f);
	dvd2.setLength(100);
	order2.addMedia(dvd2);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Test");
	dvd3.setCategory("Animation");
	dvd3.setDirector("Roger Allers1");
	dvd3.setCost(100.0f);
	dvd3.setLength(89);
	anOrder.addMedia(dvd3);
	DigitalVideoDisc dvd4 = new DigitalVideoDisc("One piece");
	dvd4.setCategory("Animation");
	dvd4.setDirector("Odda");
	dvd4.setCost(150.0f);
	dvd4.setLength(150);
	anOrder.addMedia(dvd4);
	System.out.print("Total is: ");
	System.out.println(anOrder.totalCost());
	/*anOrder.listOfItem();
	anOrder.remoteItem(dvd2);
	System.out.println();
	anOrder.listOfItem();

	//order2.printOrder();
	anOrder.getALuckyItem();
	anOrder.printOrder();
	System.out.print("Total is: ");
	System.out.println(anOrder.totalCost());*/
	}
}