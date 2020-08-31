package sessions.classes_objects.bookstore;

public class Book {

    private String title;
    private int numOfPages;
    private boolean isHardCopy;
    private boolean isNew;
    //Book is going to have author object in it.
    //Author object will include all info about the author of this book
    //it's author is abstracted from the Book info.
    private Author author;
    //last param is asking and expecting an Author object. doesnt matter which author
    //but any Author.
    public Book(String title, int numOfPages, boolean isHardCopy, boolean isNew, Author author) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.isHardCopy = isHardCopy;
        this.isNew = isNew;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public boolean isHardCopy() {
        return isHardCopy;
    }
    public void setHardCopy(boolean hardCopy) {
        isHardCopy = hardCopy;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}

