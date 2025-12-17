package True_Pay_Backend.Backend_True_Pay.Controller.Auth;

import True_Pay_Backend.Backend_True_Pay.Model.DTOS.AuthenticationDTO;
import True_Pay_Backend.Backend_True_Pay.Model.DTOS.RegisterDTO;
import True_Pay_Backend.Backend_True_Pay.Service.Auth.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthenticationDTO data){
        return ResponseEntity.ok(service.login(data));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO data){
        service.register(data);
        return ResponseEntity.ok().build();
    }
}
