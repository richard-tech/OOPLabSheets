package labsheet4.exercise1.exercise5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Not available",0 ,  " Not available",0);

    }
    public Book(String title, double price, String ISBN, int pages){

        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if(title != null && !title.equals("") )
        this.title = title;
            else
                this.title = "No Valid Title Supplied";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0 && price < 50000 )
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN != null && !ISBN.equals("") )
        this.ISBN = ISBN;
        else
            this.ISBN = "No Valid ISBN Supplied";
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages > 0 && pages < 4000 )
        this.pages = pages;
    }
    public String toString(){

        return "Title: " + getTitle() + "Price: " + getPrice() + "ISBN: " + getISBN() + "Pages: " + getPages();
    }
}
