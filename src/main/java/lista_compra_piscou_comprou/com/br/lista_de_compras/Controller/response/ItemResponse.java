package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Getter
@Builder
public class ItemResponse {
    private Long id;
    private String nome;
    private Integer quantidade;
    private Boolean comprado;
    private Boolean isActive = true;
}
