package az.registration.emailverification.registration.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Getter
@Setter
@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepo confirmationTokenRepo;

    public void saveConfirmationToken(ConfirmationToken token){
        confirmationTokenRepo.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token) {
        return confirmationTokenRepo.findByToken(token);
    }

    public int setConfirmedAt(String token){
        return confirmationTokenRepo.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}
