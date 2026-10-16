package MaccronutruentMeal;

public class MaconutrientFactory {

    private static MaconutrientFactory instance;
    private MaconutrientFactory(){}

    public static MaconutrientFactory getInstance(){
        if(instance == null){
            instance = new MaconutrientFactory();
        }
        return instance;
    }

    public Meal createMealPlan(Customer customer){
        String carbFood = CarbsFactory.getInstance().createCarbPlan(customer.getCustomerDietPlan());

        String proteinFood = ProteinFactory.getInstance().createProteinPlan(customer.getCustomerDietPlan());

        String fatFood = FatFactory.getInstance().createFatPlan(customer.getCustomerDietPlan());

        return new Meal(carbFood,proteinFood,fatFood);
    }

}
