
public class UserManager {
    public void signIn(User user){
        String newEmail = "newemail@example.com";//Box'a girildiğini varsayıyorum.
        String newPass = "q1w2e3r4";
        if (user.getEmail().equals(newEmail) || user.getPassword().equals(newPass)) {
            System.out.println("Login succesfully");
        }else{
            System.out.println("Failed login!");
        }
        //Bu noktalar detaylandırılabilir.
    }
    public void resetPassword(User user){
        String newPassword = "deneme123";
        user.setPassword(newPassword);
        System.out.println("You have successfully changed your password!");
    }
    
    public void updateImage(User user){
        String newImageURL = "new image URL";//Girildiğini varsayıyorum
        user.setImage(newImageURL);
        System.out.println("Image updated!");
    }
    public void updateFullName(User user){
        String newFullName = "Example Name";//Girildiğini varsayıyorum
        String newFirstName = newFullName.split(" ")[0];
        String newLastName = newFullName.split(" ")[1]; 
        user.setFirstName(newFirstName);
        user.setLastName(newLastName);
        System.out.println( "Full name updated :\n"+
                            "First Name :" + user.getFirstName()+"\n"+
                            "Last Name : " + user.getLastName());
    }
    public void updatePassword(User user){
        String newPassword = "example123";//Girildiğini varsayıyorum
        user.setPassword(newPassword);
        System.out.println("Password Updated");
        //Tabiki burda erişim izni gerekiyor vs. onları sadece simüle ettim
    }
    public final void findTheCourse(Course course){
        System.out.println(course.getName() + " opened!");
    }
    public void updateEmail(User user){
        user.setEmail("new email");
        System.out.println("Email updated!");
    }
    
}
