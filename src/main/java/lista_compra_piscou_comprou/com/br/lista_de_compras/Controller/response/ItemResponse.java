package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ItemResponse {

    private Long id;

    private String nome;

    private Integer quantidade;

    private Boolean comprado;

    private Boolean isActive;

    private ItemCategoryResponse itemCategory;
}
