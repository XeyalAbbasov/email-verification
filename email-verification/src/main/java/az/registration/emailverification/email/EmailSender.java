package az.registration.emailverification.email;

public interface EmailSender {
    void send(String to,String email);
}
