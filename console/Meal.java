// package console;
import java.util.ArrayList;
import java.time.LocalTime;

public class Meal extends Food{
  ArrayList<Food> foods = new ArrayList<Food>();

  public Meal(String name, double Calories, double Fat, double Carbohydrates, double Protein, ArrayList<Category> categories){
    super(name, Calories, Fat, Carbohydrates, Protein, categories);
  }

  LocalTime getMealTime(){
    LocalTime mealTime = LocalTime.now();
    return mealTime;
  }
  
  void addFood(Food food) {
    this.foods.add(food);
  }

  void viewFoods(){
    for (int i =0; i<this.foods.size();i++){
      System.out.println(this.foods.get(i).name);
    }
  }

  public static void main(String[] args) {
    ArrayList<Category> categories = new ArrayList<Category>();
    categories.add(Category.Fat);
    categories.add(Category.Beverage);
    categories.add(Category.Protein);
    Meal myMeal = new Meal("Milk", 40, 10, 15, 10, categories);
    myMeal.addFood(myMeal);
    
    ArrayList<Category> Bananacategories = new ArrayList<Category>();
    Bananacategories.add(Category.Fruit);
    Bananacategories.add(Category.Carbohydrate);
    Food banana = new Food( "Banana", 30, 0, 15, 0, Bananacategories);
    myMeal.addFood(banana);
    // myMeal.addCategory(Category.Beverage);

    LocalTime currentTime = myMeal.getMealTime();
    // String name = myMeal.getName();
    
    System.out.println(currentTime);
    myMeal.viewFoods();
    // System.out.println(myMeal.foods.get(0).name);
  }
}