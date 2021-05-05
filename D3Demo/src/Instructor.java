
public class Instructor extends User {
    
    private String description;
    private String[] givenCourses;

    public Instructor(int id, String firstName, String lastName, String image,String email,String password, String description, String[] givenCourses) {
        super(id, firstName, lastName, image,email, password);
        this.description = description;
        this.givenCourses = givenCourses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(String[] givenCourses) {
        this.givenCourses = givenCourses;
    }

    

    

    
    
    
    
}
