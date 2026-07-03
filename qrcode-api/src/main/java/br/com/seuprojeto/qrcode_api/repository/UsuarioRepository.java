package br.com.seuprojeto.qrcodeapi.repository;

import br.com.seuprojeto.qrcodeapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}