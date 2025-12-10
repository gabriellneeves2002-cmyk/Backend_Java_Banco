package True_Pay_Backend.Backend_True_Pay.Model.DTOS;

import True_Pay_Backend.Backend_True_Pay.Model.Enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioAllByIdDTO {

    private String id;
    private String nome;
    private String login;
    private String cpf;
    private String celular;
    private UserRole cargo;
}
