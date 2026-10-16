package MaccronutruentMeal;

public class Main {

    public static void main (String [] args){

        Customer firstCustomer  = new Customer("Alex Smith","Vegan");
        Meal firstCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(firstCustomer );
        firstCustomer.displayCustomerInfo();
        firstCustomerMealPlan.displayMeal();

        Customer secondCustomer  = new Customer("Peter Hernandez","Nut Allergy");
        Meal secondCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(secondCustomer );
        secondCustomer.displayCustomerInfo();
        secondCustomerMealPlan.displayMeal();

        Customer thirdCustomer  = new Customer("Tom Baker","Paleo");
        Meal thirdCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(thirdCustomer );
        thirdCustomer.displayCustomerInfo();
        thirdCustomerMealPlan.displayMeal();

        Customer fourthCustomer  = new Customer("Max well","Vegan");
        Meal fourthCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(fourthCustomer );
        fourthCustomer.displayCustomerInfo();
        fourthCustomerMealPlan.displayMeal();

        Customer fifthCustomer  = new Customer("Travis Dan","No Restriction");
        Meal fifthCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(fifthCustomer );
        fifthCustomer.displayCustomerInfo();
        fifthCustomerMealPlan.displayMeal();

        Customer sixthCustomer  = new Customer("Brady Carlos","Nut Allergy");
        Meal sixthCustomerMealPlan = MaconutrientFactory.getInstance().createMealPlan(sixthCustomer );
        sixthCustomer.displayCustomerInfo();
        sixthCustomerMealPlan.displayMeal();

    }

}
