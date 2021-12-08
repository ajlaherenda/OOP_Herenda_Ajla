	
package week10;

import java.util.Scanner;

public class week10 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		/*task2

		Book b1=new Book("Fedor Dostojevski","Crime and Punishment",2);
		Book b2=new Book("Knet Beck","Test Driven Development",0.5);
		CD cd1=new CD("Pink Floyd","Dark Side of the Moon",1973);
		CD cd2=new CD("Wigwam","Nuclear Nightclub",1975); 
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(cd1.toString());
		System.out.println(cd2.toString());
		 
		Box box=new Box(10,10);
		box.add(new Things(b1));
		box.add(new Things(b2));
		System.out.println(box.toString()); */
 
        /*task 3
        GenericClass<String> s=new GenericClass("Ajla");
        GenericClass<Integer> i=new GenericClass(10);
        System.out.println(i.getValue());
        System.out.println(s.getValue());		 */
		//
		//BIG TASK
		
		Storehouse store = new Storehouse();
		store.addProduct("coffee", 5, 1);
		/*part1 & 2
        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
        */
		
        store.addProduct("milk", 3, 10);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        /*
        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        }
        */
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
        
        basket.print();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");

        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() +"\n");
        
        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
        
		
      
        
	}
		}


