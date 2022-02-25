package com.corejavab9;
import java.util.*;
public interface Menu {
	 public String getType();
}
class Pizza implements Menu {
 public String getType() {
 return "Someone ordered a Fast Food!";
 }
}

class Cake implements Menu {

 public String getType() {
 return "Someone ordered a Dessert!";
 }
}
class FoodFactory {
	public Menu getFood(String order) {
        if(order == null )
        return null;
else if(order.equalsIgnoreCase("cake"))
    return new Cake();
else if(order.equalsIgnoreCase("pizza"))
    return new Pizza();
else
return null;

}
}
