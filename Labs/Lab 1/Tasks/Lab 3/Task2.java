interface Media {
    void display();
}

class PrintMedia implements Media {
    protected String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
    }
}

class SocialMedia implements Media {
    protected String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
    }
}

class Book extends PrintMedia {
    private String name;
    private String ISBN;

    public Book() {
        name = "";
        ISBN = "";
    }

    public Book(String name, String ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public void display() {
        System.out.println("Book Name: " + name);
        System.out.println("ISBN: " + ISBN);
        super.display();
    }
}

class Magazine extends PrintMedia {
    private String month;
    private int year;

    public Magazine() {
        month = "";
        year = 0;
    }

    public Magazine(String month, int year) {
        this.month = month;
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        super.display();
    }
}

class Facebook extends SocialMedia {
    private String name;
    private String likes;

    public Facebook() {
        name = "";
        likes = "";
    }

    public Facebook(String name, String likes) {
        this.name = name;
        this.likes = likes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public String getLikes() {
        return likes;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Likes: " + likes);
        super.display();
    }
}

public class Task2 {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[10];
        
        // Populate the array with different types of media
        mediaArray[0] = new Book("Java Programming", "978-0134685991");
        mediaArray[1] = new Magazine("January", 2024);
        mediaArray[2] = new Facebook("OpenAI", "100k");

        // Demonstrate polymorphic behavior
        for (Media media : mediaArray) {
            if (media != null) {
                media.display();
                System.out.println("-----------");
            }
        }
    }
}
