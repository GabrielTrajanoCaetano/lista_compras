package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ItemResponse {
    private Long id;
    private String nome;
    private Integer quantidade;
    private Boolean comprado;
    private Boolean isActive;
}
