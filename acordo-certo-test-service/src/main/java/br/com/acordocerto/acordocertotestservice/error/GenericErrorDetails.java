package br.com.acordocerto.acordocertotestservice.error;

import lombok.Builder;

import java.time.LocalDateTime;

public class GenericErrorDetails extends ErrorDetails {

    @Builder
    public GenericErrorDetails(String titulo, int status, String detalhes, LocalDateTime timestamp, String mensagem) {
        super(titulo, status, detalhes, timestamp, mensagem);
    }
}
