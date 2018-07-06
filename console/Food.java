import java.util.ArrayList;

public class Food {
  String name;
  double Calories;
  double Fat;
  double Carbohydrates;
  double Protein;
  ArrayList<Category> categories = new ArrayList<Category>();

  public Food(String name, double Calories, double Fat, double Carbohydrates, double Protein, ArrayList<Category> categories){
    this.name = name;
    this.Calories = Calories;
    this.Fat = Fat;
    this.Carbohydrates = Carbohydrates;
    this.Protein = Protein;
    int categoryLen = categories.size();
    // System.out.println(categoryLen);
    for (int i=0; i<categoryLen; i++){
      this.addCategory(categories.get(i));
    }
  }

  double getCalories() {
    return this.Calories;
  }

  double getFat() {
    return this.Fat;
  }

  double getCarbohydrates() {
    return this.Carbohydrates;
  }

  double getProtein() {
    return this.Protein;
  }

  String getName(){
    return this.name;
  }
  
  ArrayList<Category> getCategories(){
    return this.categories;
  }

  void addCategory(Category category){
    this.categories.add(category);
  }
  
  public static void main(String[] args) {
    ArrayList<Category> categories = new ArrayList<Category>();
    categories.add(Category.Fruit);
    categories.add(Category.Carbohydrate);
    Food myFood = new Food( "Banana", 30, 0, 15, 0, categories);

    // myFood.addCategory(Category.Fruit);
    // myFood.addCategory(Category.Protein);
    // System.out.println("Food Categories: " + myFood.categories);
    System.out.println(myFood.getCategories());
  }
}
