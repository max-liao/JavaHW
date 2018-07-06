// package console;

public enum Category {
    Fruit, Vegetable, Protein, Fat, Beverage, Carbohydrate, Dessert;
}

class CategoryTest {
    Category category;
  
    public CategoryTest(Category name){
      this.category = name;
      System.out.println("Category name: " + name);
    }
    
    public void Categories() {
      switch (category) {
        case Fruit:
            System.out.println("Fruit is delicious.");
            break;
        case Vegetable:
            System.out.println("Vegetables are delicious.");
            break;
        case Protein:
            System.out.println("Protein is delicious.");
            break;
        case Fat:
            System.out.println("Fat is delicious.");
            break;
        case Beverage:
            System.out.println("Beverage is delicious.");
            break;
        default:
            System.out.println("Category not Found.");
            break;
      }
    }
  
    public static void main(String[] args) {
      CategoryTest myCategory = new CategoryTest(Category.Beverage);
      myCategory.Categories();
    }
  }
      