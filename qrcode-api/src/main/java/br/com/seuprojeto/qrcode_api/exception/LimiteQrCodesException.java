package br.com.seuprojeto.qrcodeapi.exception;

public class LimiteQrCodesException extends RuntimeException {

    public LimiteQrCodesException(String mensagem) {
        super(mensagem);
    }

}