package True_Pay_Backend.Backend_True_Pay.Model.DTOS;

import True_Pay_Backend.Backend_True_Pay.Model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioMenuResponseDto {

    private String nome;
    private String login;

    public UsuarioMenuResponseDto(Usuario usuario){
       this.nome = usuario.getNome();
       this.login = usuario.getLogin();
    }
}
