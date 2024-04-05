import java.util.*;
import sub.recipe;
import sub.bm;
import sub.ci;
class Main{
  public static void main(String[] args) {
    System.out.println("Welcome to the Recipe Star");
    Scanner sc=new Scanner(System.in);
    ArrayList<recipe> recipies =new ArrayList<recipe>();
    ArrayList<bm> bookmarks =new ArrayList<bm>();
    ArrayList<ci> comint =new ArrayList<ci>();
    System.out.println("Enter your userid :");
    int user_id=sc.nextInt();
    int flag=1;
    int id=0;
    while(flag!=5){
      
      System.out.println("\n1.Add a new Recipe \n2.Search for a recipe \n3.Display  \n4.Book Mark new \n5.Show Bookmarks \n6.Rate a recipe \n7.Switch User \n8.Community Interaction \n9.Show intreaction\n 10.Exit");
      int userinput=sc.nextInt();
      if(userinput==1)
      {
        System.out.println("Enter the name of the recipe,category and ingrediants");
        String name=sc.next();
        String category=sc.next();
        String ingrediants=sc.next();
        id+=1;
        recipe ob=new recipe(name,category,ingrediants,id);
        recipies.add(ob);
        System.out.println("\nYour Recipe Added Successfuly\n");
      }
      else if(userinput==2){
        System.out.println("\nEnter the recipe name to search : ");
        int recipeid=0;
        try{
          recipeid=sc.nextInt();}
          catch(Exception e){
            System.out.println("Error");
          }
        for(recipe r5:recipies){
          if(r5.r_id==recipeid){
            System.out.println("Id :"+r5.r_id+"\n Recipe_name : "+r5.recipe_name+"\n Category: "+r5.cat_name+"\n Ingrediants"+r5.Ingrediants+"\n Ratings :"+r5.rating);
          }
        }
      }
      else if(userinput==3){
        for(recipe r:recipies){
          System.out.println("Id :"+r.r_id+"\n Recipe_name : "+r.recipe_name+"\n Category: "+r.cat_name+"\n Ingrediants"+r.Ingrediants+"\n Ratings :"+r.rating);
        }
      }
      else if(userinput==4){
        System.out.println("\nEnter the Recipe id to BookMark");
        int bookid=sc.nextInt();
        for(recipe r3:recipies){
          if(bookid==r3.r_id){
            bm ob=new bm(r3.recipe_name,r3.cat_name,r3.Ingrediants,r3.r_id);
            bookmarks.add(ob);
            System.out.println("Bookemarked Successfully");
          }
        }
      }
      else if(userinput==5){
        for(bm b:bookmarks){
          System.out.println("Id :"+b.r_id+"\n Recipe_name : "+b.recipe_name);
        }
      }
      else if(userinput==6){
        for(recipe r:recipies){
          System.out.println("Id :"+r.r_id+"\n Recipe_name : "+r.recipe_name+"\n Category: "+r.cat_name+"\n Ingrediants"+r.Ingrediants+"\n Ratings :"+r.rating);
        }
        System.out.println("Select a recipe by Id to rate and review ");
        int rid=sc.nextInt();
        for(recipe r2:recipies){
          if(r2.r_id==rid){
            System.out.println("Enter your rating for the recipe upto 10");
            int ratingno=sc.nextInt();
            r2.rating=ratingno;
            System.out.println("Rating Added");
          }
        }
      }
      else if(userinput==8){
        System.out.println("\nEnter the Recipe id to intreact");
        int iid=sc.nextInt();
        for(recipe r4:recipies){
          if(r4.r_id==iid){
            System.out.print("\nEnter your Tips :");
            String tips="";
            try{
            tips=sc.next();}
            catch(Exception e){
              System.out.println("Success");
            }
            ci o=new ci(r4.recipe_name,r4.r_id,tips);
            comint.add(o);
            System.out.println();

          }
        }
      }
      else if(userinput==9){
        for(ci c:comint){
          System.out.println("Id :"+c.r_id+"\n Recipe_name : "+c.recipe_name+"\n Tips"+c.tips);
        }
      }
      else{
        System.out.println("Thank You! ");
        flag=5;
      }


    }
  }
}