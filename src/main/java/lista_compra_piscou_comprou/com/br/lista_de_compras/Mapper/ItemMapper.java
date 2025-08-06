package lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;


public class ItemMapper {

    public static Item toEntity(AddItemRequest request) {
        return Item.builder()
                .nome(request.getNome())
                .quantidade(request.getQuantidade())
                .comprado(request.getComprado())
                .build();
    }

    public static ItemResponse toResponse(Item domain) {
        return ItemResponse.builder()
                .id(domain.getId())
                .nome(domain.getNome())
                .quantidade(domain.getQuantidade())
                .comprado(domain.getComprado())
                .isActive(domain.getIsActive())
                .build();
    }
}
