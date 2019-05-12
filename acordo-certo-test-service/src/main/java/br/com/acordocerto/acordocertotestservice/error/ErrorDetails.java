package br.com.acordocerto.acordocertotestservice.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ErrorDetails {
    protected String titulo;
    protected int status;
    protected String detalhes;
    protected LocalDateTime timestamp;
    protected String mensagem;
}