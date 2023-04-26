
//This class contains four public methods that will store information about a collection of these items

import java.util.*;

public class Catalog 
{
	//private instance variables needed for Catalog class
	private ArrayList<Item> catalog;
	private int counter;
	private String name;
	
	//constructor takes a name as an argument 
		public Catalog(String name)
		{
			this.name = name;
			this.catalog = new ArrayList<Item>();
		}
	
	//private accessor methods needed to access private variables
	public ArrayList<Item> getCatalog()
	{
		return catalog;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	//method adds item to the ArrayList and updates the count of the list
	public void add(Item item)
	{
		catalog.add(item);
		
		int counter = getCounter();
		counter++;
		
		this.counter = counter;	
	}
	
	//method returns the number of items in the list
	public int size()
	{
		int size = getCounter();
		return size;
	}
	
	//method returns item with the given index
	public Item get(int index)
	{
		ArrayList<Item> list = getCatalog();
		Item currentItem = list.get(index);
		return currentItem;
	}
	
	//method returns name of the Catalog
	public String getName()
	{
		return name;
	}

}
