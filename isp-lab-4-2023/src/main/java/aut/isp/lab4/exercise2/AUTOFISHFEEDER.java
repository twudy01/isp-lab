package aut.isp.lab4.exercise2;

public class AUTOFISHFEEDER {
    private int maxmeals;
    private int meals;

    public AUTOFISHFEEDER() {
        this.maxmeals = 14;
        this.meals = 10;
    }

    public void feed(){
        if(meals>0)
        {
            meals--;
            System.out.println("Fish has been fed!");
        }
        else
        {
            System.out.println("No meals left!");
        }
    }
    public void refillMeals(){
        meals=14;
        System.out.println("Meals have been refilled");
    }

    public int getMeals() {
        return meals;
    }
}
