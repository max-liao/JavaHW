// package console;
import java.util.ArrayList;
import java.time.LocalTime;

public class MealTracker extends User {
  ArrayList<Meal> meals = new ArrayList<Meal>();

  public MealTracker(String name, String email, int age){
    super(name, email, age);
  }

  void addMeal(Meal myMeal) {
    this.meals.add(myMeal);
  }

  void viewMeals() {
    for (int i = 0; i < this.meals.size(); i++){
      Meal test = this.meals.get(i);
      System.out.println(test.name);
    }
  }

  int getMealCount() {
    System.out.println("Meal Count: " + this.meals.size());
    return this.meals.size();
  }

  double getAdherence(ArrayList<Meal> meals) {
    // ArrayList<Food> foods = new ArrayList<Food>();
    double adherance = 0;
    int[] anArray;
    int numMeals = meals.size();
    anArray = new int[numMeals];
    int fat = 0;
    int fruit = 0;
    int vegetable = 0;
    int protein = 0;

    //stick all meal categories into mealcategories ArrayList
    for (int h = 0; h< numMeals; h++){    
      Meal tempMeal = meals.get(h);
      ArrayList<Category> mealcategories = new ArrayList<Category>();
      for (int i = 0; i<tempMeal.foods.size(); i++){
        for (int j = 0; j< tempMeal.foods.get(i).categories.size(); j++){
          mealcategories.add(tempMeal.foods.get(i).categories.get(j));
        }
      }  
      for (int k = 0; k<mealcategories.size(); k++){
          Category temp = mealcategories.get(k); 
          switch (temp){
            case Fat:
              // System.out.println("Fat Found");    
              fat = 1;
              break;
            case Fruit:
              // System.out.println("Fruit Found");   
              fruit = 1;
              break;
            case Vegetable:
              // System.out.println("Vegetable Found");    
              vegetable = 1;
              break;
            case Protein:
              // System.out.println("Protein Found");    
              protein = 1;
              break;
          }
      }    
      // System.out.println(fat + protein + fruit + vegetable);
      if ((fat + protein + fruit + vegetable) == 4){
          anArray[h] = 1;
      }
    }
    double sum=-0;
    for (int l = 0; l<numMeals; l++){
      sum += anArray[l];
    }
    adherance = sum/numMeals;
    
    return adherance;
  }

  boolean isOnTrack(double adherance){
    if (adherance >= 0.5){
      System.out.println("Adherance TRUE");
      return true;
    } else {
      System.out.println("Adherance FALSE");
      return false;  
    }
  }

  public static void main(String[] args) {
    MealTracker myMealTracker = new MealTracker( "Max", "max@gmail.com", 28);
    System.out.println("Meal Tracker User name: " + myMealTracker.name);

    ArrayList<Category> milkcategories = new ArrayList<Category>();
    milkcategories.add(Category.Fat);
    milkcategories.add(Category.Beverage);
    milkcategories.add(Category.Protein);

    ArrayList<Category> cookiecategories = new ArrayList<Category>();
    cookiecategories.add(Category.Fat);
    cookiecategories.add(Category.Dessert);

    ArrayList<Category> icecreamcategories = new ArrayList<Category>();
    icecreamcategories.add(Category.Fat);
    icecreamcategories.add(Category.Dessert);

    ArrayList<Category> dessertCat = new ArrayList<Category>();

    Meal dessert = new Meal("dessert", 0, 0, 0, 0, dessertCat );   
    Food cookie = new Food("cookie", 50, 20, 25, 5, cookiecategories);
    Food milk = new Food("milk", 30, 10, 10, 5, milkcategories);
    Food icecream = new Food("ice cream", 100, 30, 25, 5, icecreamcategories);
    dessert.addFood(cookie);
    dessert.addFood(milk);
    dessert.addFood(icecream);
    myMealTracker.addMeal(dessert);


    ArrayList<Category> bananacategories = new ArrayList<Category>();
    bananacategories.add(Category.Fruit);
    bananacategories.add(Category.Vegetable);

    ArrayList<Category> fruitCat = new ArrayList<Category>();
    Meal fruit = new Meal("fruit", 0, 0, 0, 0, fruitCat );   
    Food banana = new Food("banana", 100, 30, 25, 5, bananacategories);
    fruit.addFood(banana);
    fruit.addFood(milk);
    myMealTracker.addMeal(fruit);
    
    myMealTracker.viewMeals();
    myMealTracker.getMealCount();

    myMealTracker.isOnTrack(myMealTracker.getAdherence(myMealTracker.meals));
  }
}