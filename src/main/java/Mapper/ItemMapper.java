package Mapper;

import Controller.request.AddItemRequest;
import Controller.response.ItemResponse;
import domain.Item;
import org.springframework.context.annotation.Configuration;


public class ItemMapper {

    public static Item toEntity(AddItemRequest request){
        return Item.builder()
                .nome(request.getNome())
                .build();
    }

    public static ItemResponse toResponse(Item domain){
        return ItemResponse.builder()
                .id(domain.getId())
                .nome(domain.getNome())
                .quantidade(domain.getQuantidade())
                .comprado(domain.getComprado())
                .build();
    }
}
