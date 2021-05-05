
public class User {
    private final int id;
    private String firstName;
    private String lastName;
    private String image;
    private String email;
    private String password;
    
    
    public User(int id, String firstName, String lastName, String image,String email, String password) {
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    

    
    
}
