package br.com.acordocerto.domain.model;

import br.com.acordocerto.domain.Categoria;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
@Entity
public class Despesa extends AbstractModel<Long> {

    @NotEmpty(message = "Campo descrição não pode ser vazio")
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private BigDecimal valor = BigDecimal.ZERO;
    private boolean fixa;
}
