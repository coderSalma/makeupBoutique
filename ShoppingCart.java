
//This class contains three public methods that store info abut the overall order
import java.util.*;

public class ShoppingCart 
{
	//private instance variables needed for ShoppingCart class
	private ArrayList<ItemOrder> shoppingCart;
	private double total;
	private double discountPercent;
	private boolean discount;
	private ItemOrder itemOrder;
	
	//constructor creates an empty ArrayList of ItemOrders
	public ShoppingCart()
	{
		shoppingCart = new ArrayList<ItemOrder>();
	}
	
	//method adds an itemOrder to the list, replacing any previous orders for this item
	public void add(ItemOrder itemOrder)
	{
		//this.itemOrder = itemOrder;
		for(int i = 0; i < shoppingCart.size(); i++)
		{
			ItemOrder current = shoppingCart.get(i);
			Item thing = current.getItem();
			
			if(thing.equals(itemOrder.getItem()))
			{
				shoppingCart.remove(i);
			}
		}
		
		
		shoppingCart.add(itemOrder);
	}
	
	//method sets whether or not the order gets a discount
	public void setDiscount(boolean value)
	{	
		this.discount = value;
	}
	
	//method returns the total cost of the shopping cart
	public double getTotal()
	{
		total = 0;
		for(ItemOrder traverse: shoppingCart)
		{
			total += traverse.getPrice();
		}
		
		if(discount)
		{
			total = total * 0.9;
		}
		
		return total;
	}

}
