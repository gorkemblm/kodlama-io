
public class Course {
    private final int id;
    private String name;
    private String description;
    private String image;
    private String courseInstructor;
    private double price;
    private int numberOfParticipants;

   
    public Course(int id, String name, String description, String image, String courseInstructor, double price, int numberOfParticipants) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.courseInstructor = courseInstructor;
        this.price = price;
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseOwner) {
        this.courseInstructor = courseOwner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    
}
