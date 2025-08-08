package lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper;


import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemCategoryRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;

public class ItemCategoryMapper {

    public ItemCategory toEntity(AddItemCategoryRequest request){
        return ItemCategory.builder()
                .nome(request.getNome())
                .build();
    }
}
