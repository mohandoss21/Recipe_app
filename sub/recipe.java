package sub;

public class recipe {
  public String recipe_name;
  public String cat_name;
  public String Ingrediants;
  public int r_id=0;
  public String Reviews="";
  public int rating=0;
  public static void main(String[] args) {
    
  }
  public recipe(String recipe_name,String cat_name,String Ingrediants,int id){
    this.recipe_name=recipe_name;
    this.cat_name=cat_name;
    this.Ingrediants=Ingrediants;
    this.r_id=id;
  }

}
