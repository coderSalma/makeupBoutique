
//This class contains two public methods that stores info about an item and the quantity ordered

public class ItemOrder 
{
	//private instance variables needed for ItemOrder class
	private int quantity;
	private Item item;
	private double price;
	
	
	//constructor takes an item and quantity as parameters
	public ItemOrder(Item item, int quantity)
	{
		this.item = item;
		this.quantity = quantity;
	}
	
	//method returns the cost for this item order
	public double getPrice()
	{
		
		price = item.priceFor(quantity);
		return price;
	}
	
	//method returns a reference to the item in this order
	public Item getItem()
	{
		return item;
	}
}
