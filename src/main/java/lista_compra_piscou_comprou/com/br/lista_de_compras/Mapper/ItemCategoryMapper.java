package lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper;


import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemCategoryRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemCategoryDetailsResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemCategoryResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;

import java.util.stream.Collectors;

public class ItemCategoryMapper {

    public ItemCategory toEntity(AddItemCategoryRequest request){
        return ItemCategory.builder()
                .isActive(request.getIsActive())
                .nome(request.getNome())
                .build();
    }

    public static ItemCategoryResponse toResponse(ItemCategory domain){
        return ItemCategoryResponse.builder()
                .id(domain.getId())
                .nome(domain.getNome())
                .build();
    }

    public static ItemCategoryDetailsResponse toDetailsResponse(ItemCategory domain){
            return ItemCategoryDetailsResponse.builder()
                    .id(domain.getId())
                    .nome(domain.getNome())
                    .itens(domain.getItens().stream().map(ItemMapper::toResponse).collect(Collectors.toList()))
                    .build();
    }




}
