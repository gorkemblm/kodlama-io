
public class StudentManager extends UserManager {
    public void addCourseToOwnCourses(Course course){
        System.out.println(course.getName()+" added to courses!");
    }
    public void removeCourseFromOwnCourses(Course course){
        System.out.println(course.getName()+" removed from courses!");
    }
    public boolean finishAndContinue(Student student){//Bitir ve devam et kısmı
         student.setInstantParticipation(true); 
         return student.getInstantParticipation();
         //Döndürdüğü değer kullanılara sistemdeki log dosyalarına kaydedilebilir.
    }
    public void returnBeforeLesson(){
        System.out.println("Previous page opened");
    }
    public void updateAddress(Student student){
        student.setAddress("new address");
        System.out.println("Address updated!");
    }
    public void sendMessageToAdmin(String message){// İletişim kısmı
        System.out.println("Message sent : "+ message);
    }
    public void sendToComment(String homeWork){// Ödev gönderme kısmı
        System.out.println("Homework sent : "+homeWork);
    }
    public void addToFile(){//Ödev kısmına eklenen dosyalar
        System.out.println("File added!");
        //Simüle ettiğim için dosya türü vs. oluşturmadım
    }
    
    
    
}
