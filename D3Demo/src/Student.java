
public class Student extends User {
    
    private String address;
    private String[] takenCourses;
    private double courseCompletion;
    private boolean instantParticipation = false;//yoklama(tabi ki tek bir değer tutuyor o genişletilebilir)
    
    public Student(int id, 
            String firstName, 
            String lastName, 
            String image,
            String email,
            String password,  
            String address, 
            String[] takenCourses, 
            double courseCompletion, 
            boolean  instantParticipation) {
        
        super(id, firstName, lastName, image,email, password);
        this.address = address;
        this.takenCourses = takenCourses;
        this.courseCompletion = courseCompletion;
        this.instantParticipation = instantParticipation;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(String[] takenCourses) {
        this.takenCourses = takenCourses;
    }

    public double getCourseCompletion() {
        return courseCompletion;
    }

    public void setCourseCompletion(double courseCompletion) {
        this.courseCompletion = courseCompletion;
    }

    public boolean getInstantParticipation() {
        return instantParticipation;
    }

    public void setInstantParticipation(boolean instantParticipation) {
        this.instantParticipation = instantParticipation;
    }
    
    
    
    
    
}
