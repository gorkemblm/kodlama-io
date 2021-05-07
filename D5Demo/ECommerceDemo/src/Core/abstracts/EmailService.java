package Core.abstracts;

public interface EmailService {
    boolean validateEmail(String email);
    void sendToVerifyMail();
    boolean isTheLinkClicked();
}
