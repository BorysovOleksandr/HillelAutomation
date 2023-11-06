package Lesson6;

public class Product {
    String name;
    int article;
    double price;
    String description;
    String available;

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
    public void setDescription(String newArticle){
        article = newArticle;
    }
    public void setAvailable(String newAvailable){
        available = newAvailable;
    }

}
