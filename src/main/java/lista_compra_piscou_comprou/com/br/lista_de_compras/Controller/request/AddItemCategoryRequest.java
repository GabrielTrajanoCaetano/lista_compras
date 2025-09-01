package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class AddItemCategoryRequest {

    private Long id;
    private Boolean isActive;
    private String nome;

}
