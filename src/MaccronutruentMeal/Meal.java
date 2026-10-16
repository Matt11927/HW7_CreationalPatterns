package MaccronutruentMeal;

public class Meal {

    private String carbsFood;
    private String proteinFood;
    private String fatFood;

    public Meal(String carbsFood, String proteinFood, String fatFood) {
        this.carbsFood = carbsFood;
        this.proteinFood = proteinFood;
        this.fatFood = fatFood;
    }

    public void displayMeal() {
        System.out.println("Carb Food : " + carbsFood);
        System.out.println("Protein Food : " + proteinFood);
        System.out.println("Fat Food : " + fatFood);
        System.out.println();
    }

}
