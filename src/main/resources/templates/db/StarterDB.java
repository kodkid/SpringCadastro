package templates.db;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody UserDto userDto) {
        // Processar o cadastro do usuário
        System.out.println("Email: " + userDto.getEmail());
        System.out.println("Senha: " + userDto.getSenha());
        return "Usuário cadastrado com sucesso!";
    }
}