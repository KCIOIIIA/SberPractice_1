public class Book {
    public class Author{
        public String name;
        public String sex;
        public String email;
    }
    public String title;
    public Author author;
    public String year;

    public Book (String title, Author author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle () {
        return title;
    }
    public String getName () {
        return author.name;
    }
    public String getSex () {
        return author.sex;
    }
    public String getEmail () {
        return author.email;
    }
    public String getYear () {
        return year;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setName(String author) {
        this.author.name = author;
    }
    public void setSex(String author) {
        this.author.sex = author;
    }
    public void setEmail(String author) {
        this.author.email = author;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String toString() {
        return title + ", " + year + ", " + author.name;
    }
}
