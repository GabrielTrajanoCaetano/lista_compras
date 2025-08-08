package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Builder
@Setter
public class ItemCategoryResponse {

    private Long id;

    private String nome;

    private List<Item> itens;
}
