package lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemCategoryRepository;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class ItemMapper {

    public static Item toEntity(AddItemRequest request, ItemCategory itemCategory) {
        return Item.builder()
                .nome(request.getNome())
                .quantidade(request.getQuantidade())
                .comprado(request.getComprado())
                .itemCategory(itemCategory)
                .build();
    }

    public static ItemResponse toResponse(Item domain) {
        return ItemResponse.builder()
                .id(domain.getId())
                .nome(domain.getNome())
                .quantidade(domain.getQuantidade())
                .comprado(domain.getComprado())
                .isActive(domain.getIsActive())
                .itemCategory()
                .build();
    }
}
