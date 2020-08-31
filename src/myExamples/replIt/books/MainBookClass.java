package myExamples.replIt.books;

public class MainBookClass {

    public static void main(String[] args) {

        System.out.println(Book.capitalize("jAVa")); //"Java"
        System.out.println(Book.capitalize("HTML")); //"Html"
        System.out.println(Book.capitalize("")); //""

        System.out.println(Book.isTitleWord("Apple")); //=> true
        System.out.println(Book.isTitleWord("a")); //=> false
        System.out.println(Book.isTitleWord("BUT")); //=> false
        System.out.println(Book.isTitleWord("THE")); //=> false
        System.out.println(Book.isTitleWord("neaR")); //=> false
        System.out.println(Book.isTitleWord("java")); //=> true

        Book b = new Book();
        b.setAuthor("mArufJon temirov"); //=>assigns "Marufjon Temirov" to this.author
        b.setAuthor("ironMAN"); //=>assigns "Ironman" to this.author
        b.setAuthor(""); //=>assigns "Unknown" to this.author and unknownAuthors ++
       // System.out.println(b.toString());

        Book book = new Book();
        //System.out.println(book.setTitle("MaruF The cool"));// =>"Maruf the Cool" is assigned to this.title

        book.setTitle("the Chronicles OF TrumP"); //=>"The Chronicles of Trump" is assigned to this.title

       Shelf.addBook(100,"j.K. rowLing","harry potter",556); //=> returns true
                //and adds the book to the list:theBooks.add(new Book(id,author,title,pages));

    }


}
