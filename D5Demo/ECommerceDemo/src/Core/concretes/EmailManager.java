package Core.concretes;

import Core.abstracts.EmailService;
import java.util.regex.*;

public class EmailManager implements EmailService {
    @Override
    public boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        //Regex'e göre email olma şartı
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void sendToVerifyMail() {
        //Mail gönderildiğini varsayıyorum
        System.out.println("Check your mailbox to complete your registration");
    }

    @Override
    public boolean isTheLinkClicked() {
        //Tıklanıldığını varsayıyorum
        return true;
    }

}
