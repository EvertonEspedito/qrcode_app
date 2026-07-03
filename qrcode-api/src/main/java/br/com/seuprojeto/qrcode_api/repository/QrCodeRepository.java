package br.com.seuprojeto.qrcodeapi.repository;

import br.com.seuprojeto.qrcodeapi.entity.QrCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QrCodeRepository extends JpaRepository<QrCode, Long> {

    long countByUsuarioId(Long usuarioId);

}