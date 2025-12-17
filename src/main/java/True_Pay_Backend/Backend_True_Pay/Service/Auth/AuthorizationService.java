package True_Pay_Backend.Backend_True_Pay.Service.Auth;

import True_Pay_Backend.Backend_True_Pay.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {
        return usuarioRepository.findByLogin(username).orElseThrow(() ->  new IllegalArgumentException("Usuário não encontrado."));
    }
}
