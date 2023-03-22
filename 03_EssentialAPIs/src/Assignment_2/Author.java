package Assignment_2;

public class Author {
    // Fields
    private String name;
    private String country;

    // Constructor
    public Author() {
        
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    


}
