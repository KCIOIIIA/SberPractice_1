public class Book {
    public String title;
    public int year;
    public String name;
    public String sex;
    public String email;

    public Book (String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

        public String getName () {
            return name;
        }
        public String getSex () {
            return sex;
        }
        public String getEmail () {
            return email;
        }
    }
   // public Book (){
   // }
   // public String getTitle () {
   //     return title;
   // }
   // public int getYear () {
   //     return year;
  //  }
  //  public Author (){
  //      return Author;
  //  }
  //  public String toString() {
   //     return title + ", " + year + ", " + Author;
  //  }
//}
