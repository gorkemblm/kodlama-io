
public class InstructorManager extends UserManager {
    public void addCourseToOwnSystem(Course course){
        
        System.out.println(course.getName() + " added!");
    }
    public void removeCourseFromOwnSystem(Course course){
        System.out.println(course.getName() + " removed!");
    }
    public void updateDescription(Instructor instructor){
        String newDescription = "Example Description";//Girildiğini varsayıyorum.
        instructor.setDescription(newDescription);
        System.out.println("Description updated!");
    }
    public void addHomeworkToOwnSystem(){
        System.out.println("Homework added!");
    }
    public void removeHomeworkFromOwnSystem(){
        System.out.println("Homework removed!");
    }
    public void updateHomeworkOwnSystem(){
        System.out.println("Homework updated!");
    }
    
    
    
    
}
