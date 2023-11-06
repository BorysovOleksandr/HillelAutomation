package Lesson6;

public class Product {
   private String name;
    private int article;
    private double price;
    private String description;
    private String available;

    public Product(String name, int article, double price, String description, String available) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.description = description;
        this.available = available;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setArticle(int newArticle){
        article = newArticle;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public void setDescription(String newDescription){
        description = newDescription;
    }
    public void setAvailable(String newAvailable){
        available = newAvailable;
    }

    public String getName(){
        return this.name;
    }

    public String getAvailable(){
        return this.available;
    }



}
