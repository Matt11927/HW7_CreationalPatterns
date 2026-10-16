package MaccronutruentMeal;

public class Customer {

    private String customerName;
    private String customerDietPlan;

    public Customer(String customerName, String customerDietPlan) {
        this.customerName = customerName;
        this.customerDietPlan = customerDietPlan;
    }

    public String getCustomerName(String customerName){ return customerName; }

    public String getCustomerDietPlan(){ return customerDietPlan; }

    void displayCustomerInfo(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Diet Plan : " + customerDietPlan);
    }
}
