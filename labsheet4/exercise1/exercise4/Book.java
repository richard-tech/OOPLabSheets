package labsheet4.exercise1.exercise4;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Not available",0 ,  " Not available",0);

    }
    public Book(String title, double price, String ISBN, int pages){
        this.title = title;
        this.price = price;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String toString(){

        return "Title: " + getTitle() + "Price: " + getPrice() + "ISBN: " + getISBN() + "Pages: " + getPages();
    }
}
