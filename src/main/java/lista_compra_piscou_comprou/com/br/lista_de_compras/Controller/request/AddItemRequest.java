package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddItemRequest {

    private String nome;
    private Integer quantidade;
    private Boolean comprado;
}
