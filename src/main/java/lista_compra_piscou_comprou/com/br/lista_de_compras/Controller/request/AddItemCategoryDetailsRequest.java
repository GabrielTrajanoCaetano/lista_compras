package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;

import java.util.List;

public class AddItemCategoryDetailsRequest {

    private Long id;
    private String nome;
    private Boolean isActive;
    private List<Item> itens;

}
