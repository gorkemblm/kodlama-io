
public class SignServices {
    
    public void signIn(String email,String password) {
        System.out.println("Başarıyla giriş yaptınız");
    }
    
    public void signUp(String fullName,String email,String password) {
        System.out.println("Başarıyla kayıt oldunuz");
    }
    
    public void forgotPass(String email) {
        System.out.println("Parolanızı sıfırlamak için gerekli bağlantı " + email +" adresine gönderilmiştir.");
    }
}
