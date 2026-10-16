Creational Design Patterns
Pizza and Movies!

Builder
You will create a pizza chain, Pizza Hut. When pizza’s are created they have many possible toppings and
to keep the creation simple for the user you will use the builder design pattern to allow the user to
clearly understand which topping will be selected.
All Pizzas can have the following toppings:
Pepperoni, 
 Sausage, 
 Mushrooms, 
 Bacon, 
 Onions, 
 Extra Cheese, 
 Peppers, 
 Chicken, 
 Olives, 
 Spinach, 
 Tomato and Basil, 
 Beef, 
 Ham, 
 Pesto, 
 Spicy Pork, 
 Ham and Pineapple.

Pizza Hut
Pizza can be made with any combination of the toppings shown above.
Pizza’s come in three sizes: Small, Medium or Large NOTE: This is required and must be set!
When the eat() method is called it should print out the pizza chain, the size and all of the toppings
specific to that pizza
1) Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings to your
liking and eat() all of them
2) Now assume you purchased another two pizza chains, Little Caesars, and Dominos. You want to
add them to your program following the rules mentioned above.

Create the following pizzas and eat() all of them:
(1)Pizza Hut 
Large pizza with 3 toppings , Small pizza with 2 toppings 
.(2)Little Caesars 
Medium pizza with 8 toppings , Small pizza with 6 toppings 
.(3)Dominos
Small pizza with 1 topping , Large pizza with 3 toppings



/----------------------------------------------------------------------------------------------------------------\


Macronutrient Meals!
  Abstract Factory, Factory and Singleton

Create a Macronutrient balanced meal for customer’s based on their given diet plans. The
system should generate a meal with one of the following at random: Carbs, Protein and Fats as
long as it does not violate the customers diet plan.

Macronutrient Food Options
(1)Carbs : Cheese, Bread, Lentils, Pistachio
.(2)Protein : Fish, Chicken, Beef, tofu
.(3)Fats : Avocado, Sour-cream, tuna, Peanuts


The Customer will provide their information specifically:
Customer name
Customer diet plan

The Diet plan can be one of the following:
No Restriction – Can randomly select any food item in each category.
Paleo – No Carbs except pistachio, No Tofu, No Dairy (Cheese and Sour cream).
Vegan – No Meat (Fish, Chicken, Tuna) and No Dairy (Cheese and Sour cream).
Nut Allergy - No Nuts (Pistachio and Peanuts).

The Carbs, Protein and Fats should all be built each using the Factory Design Patterns and
the Macronutrient should use an Abstract Factory to create the three Carbs, Protein and Fats
Factories to produce a meal for the customer at random based on their food restrictions.
Additionally, there should only be one factory of each type allocated at any given time for the
factories and one abstract factory to enforce this you will use the singleton design pattern.

Create 6 customers in your driver program to show all the various diet plans. Make sure your
system randomly chooses food items in each category that meets the customers’ diet
restrictions.

NOTE: The driver program will have 6 customers, and each should expect a Meal which will
have one item from Carbs, Protein and Fats as shown above.



