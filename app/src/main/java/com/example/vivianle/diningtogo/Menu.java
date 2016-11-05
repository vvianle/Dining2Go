package com.example.vivianle.diningtogo;
public class Menu 
{
	//INSTANCE VARIABLES
	food[] charboiled = new food[4];
	food[] grilled = new food[4];
	food[] salad = new food[13];
	food[] special = new food[4];
	
	String[] currentMenu = {
			"Sliced Turkey Breast", "3",
			"Classic Turkey Club Sandwich", "2",
			"Roast Beef", "4",
			"Deli Ham", "4.5",
			"Grilled Cheese Sandwich", "4.75",
			"Vegetarian Mount Holyokes", "3.25",
			"Monterey Jack Cheese", "3.75",
			"Philly Steak Sandwich", "5.25",
			"Veggie", "2",
			"Spinach", "2",
			"Cabbage", "2",
			"Meat", "3",
			"Chicken", "3",
			"American", "1",
			"Italian", "1",
			"Salmon", "1",
			"Cheddar", "1",
			"Caesar", "1",
			"Mozzarella", "1.5",
			"Cheese", "1.5",
			"Dressing", "1",
			"Pad Thai", "7.5",
			"Vietnamese Pho", "7.5",
			"Indian Dal", "3.75",
			"Shrimp Fried Rice", "7.5"};
	
	
	public void setMenu (String[] menu)
	{
		currentMenu = menu;
	}
	
	public food[] getCharboiled()
	{
		return charboiled;
	}
	
	public food[] getGrilled()
	{
		return grilled;
	}
	

	public food[] getSalad(){return salad;}
	public food[] getSpecial()
	{
		return special;
	}
	
	public String[] getMenu()
	{
		return currentMenu;
	}
	
	public Menu()
	{
		int menuIndex = 0;
		
		for(int i = 0; i < charboiled.length; i++)
		{	
			food insertFood = new food(currentMenu[menuIndex], Float.parseFloat((currentMenu[menuIndex+1])));
			insertFood.setCategory(1);
			charboiled[i] = insertFood;
			
			menuIndex = menuIndex+2;
		}
		
		
		for(int i = 0; i < grilled.length; i++)
		{	
			food insertFood = new food(currentMenu[menuIndex], Float.parseFloat((currentMenu[menuIndex+1])));
			insertFood.setCategory(2);
			grilled[i] = insertFood;
			
			menuIndex = menuIndex+2;
		}

		for(int i = 0; i < salad.length; i++)
		{
			food insertFood = new food(currentMenu[menuIndex], Float.parseFloat((currentMenu[menuIndex+1])));
			insertFood.setCategory(3);
			salad[i] = insertFood;

			menuIndex = menuIndex+2;
		}
		
		for(int i = 0; i < special.length; i++)
		{	
			food insertFood = new food(currentMenu[menuIndex], Float.parseFloat((currentMenu[menuIndex+1])));
			insertFood.setCategory(4);
			special[i] = insertFood;
			
			menuIndex = menuIndex+2;
		}
	}
	
}
