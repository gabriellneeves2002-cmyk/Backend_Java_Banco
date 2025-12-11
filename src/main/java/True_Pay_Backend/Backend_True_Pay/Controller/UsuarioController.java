package True_Pay_Backend.Backend_True_Pay.Controller;

import True_Pay_Backend.Backend_True_Pay.Model.DTOS.UsuarioCreateDTO;
import True_Pay_Backend.Backend_True_Pay.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UsuarioCreateDTO usuario){
       usuarioService.create(usuario);
       return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
       return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllDTO (){
      return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
       return ResponseEntity.ok(usuarioService.findById(id));
    }

    @GetMapping(value = "/menu/{id}")
    public ResponseEntity<?> findByUsuarioMenuId(@PathVariable Long id){
       return ResponseEntity.ok(usuarioService.findByUsuarioMenuId(id));
    }

    @GetMapping(value = "/saldo/{id}")
    public ResponseEntity<?> findSaldoUsuario(@PathVariable Long id){
       return ResponseEntity.ok(usuarioService.findSaldoUsuario(id));
    }
}
