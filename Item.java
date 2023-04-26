
//This class contains two public methods that will store information about the individual items

import java.text.*;
public class Item 
{
	//private instance variables needed for Item class
	private String name;
	private double price;
	private int quantity;
	private int bulkQuantity;
	private double bulkPrice;
	
	//constructor takes name and price as arguments
	//throws IllegalArguementException if price is negative
	public Item(String name, double price)
	{
		this.name = name;
		this.price = price;
		
		if(price < 0)
		{
			throw new IllegalArgumentException ("Price must be positive!");
		}
	}
	
	//constructor used for items bought in bulk
	//throws IllegalArguementException if any number is negative
	public Item(String name, double price, int bulkQuantity, double bulkPrice)
	{
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
		
		if(price < 0 || bulkQuantity < 0 || bulkPrice < 0)
		{
			throw new IllegalArgumentException("Values must be positive!");
		}
	}
	
	
	//private accessor methods to access the private variables:
	private String getName()
	{
		return name;
	}
	
	private double getPrice()
	{
		return price;
	}
	
	private int getQuantity()
	{
		return quantity;
	}
	
	private int getBulkQuantity()
	{
		return bulkQuantity;
	}
	
	private double getBulkPrice()
	{	
		return bulkPrice;
	}
	
	//method returns true if item comes in a bulk value
	private boolean hasBulk()
	{
		if(getBulkPrice() > 0 && getBulkQuantity() > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//method returns the  price for a given quantity of the item (including bulk price)
	public double priceFor(int quantity)
	{
		//throws IllegalArguementException if quantity is negative
		if(quantity < 0)
		{
			throw new IllegalArgumentException("Quantity must be positive!");
		}
		
		double singlePrice = getPrice();
		double bulkPrice;
		int bulkAmount;
		
		if(hasBulk())
		{
			bulkPrice = getBulkPrice();
			bulkQuantity = getBulkQuantity();
			
			int quotient = quantity / bulkQuantity;
			int remainder = quantity % bulkQuantity;
			
			double bulkTotal = bulkPrice * quotient;
			double remainingTotal = remainder * singlePrice;
			
			return (bulkTotal + remainingTotal);
			
		}
		
		else
		{
			return (quantity * singlePrice);
		}
	}
	
	//method returns a string representation of the item
	public String toString() 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double price = getPrice();
		String textPrice = nf.format(price);
		
		double bulkPrice = getBulkPrice();
		String textBulk = nf.format(bulkPrice);
		
		if(hasBulk()) 
		{
			return name + ", " + textPrice + " (" + bulkQuantity + " for " + textBulk + ")";
		}
		else
		{
			return name + ", " + textPrice;
		}
		
	}

}
