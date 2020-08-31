package sessions.classes_objects.bookstore;

public class Author {

    private String name;
    private String bio;
    private int age;
    private String photo;

    public Author(String name, String bio, int age, String photo) {
        this.name = name;
        this.bio = bio;
        this.age = age;
        this.photo = photo;
    }
    public String getName() {
        return name;
    }
    public void happyBirthday(){

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {

        this.bio = bio;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {

        this.photo = photo;
    }
}




//HW
//Write a method(happyBirthDay) in Author class it should increment the author's age.
//Implement a logic where author has the number of books.
//num of books should be defined by the usage of an author in Books info.
//so when a book is created and author is used, the authors numOfBooks should be incremented.



















