package NexoLiterario.NexoLiterario.Presentation.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class login {

    @GetMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("Hello World");
    }
}
