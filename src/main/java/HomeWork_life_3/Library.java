package HomeWork_life_3;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    Library(String someBookTitle, String someAuthor, int someYear, String someCategory){
        this.bookTitle = someBookTitle;
        this.author = someAuthor;
        this.year = someYear;
        this.category = someCategory;
    }



    //
    String getBookTitle(){
        return this.bookTitle;
    }

    void setBookTitle(String newBookTitle){
        this.bookTitle = newBookTitle;
    }

    //

    String getAuthor(){
        return this.author;
    }

    void setAuthor (String newAuthor){
        this.author = newAuthor;
    }

    //

    int getYear(){
        return this.year;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    //

    String getCategory(){
        return this.category;
    }

    void setCategory(String newCategory){
        this.category = newCategory;
    }







}
