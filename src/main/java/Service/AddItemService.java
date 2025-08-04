package Service;

import Controller.request.AddItemRequest;
import Controller.response.ItemResponse;
import domain.Item;
import repository.ItemRepository;

import static Mapper.ItemMapper.toEntity;
import static Mapper.ItemMapper.toResponse;


public class AddItemService {

    private ItemRepository itemRepository;

    private AddItemRequest addItemRequest;

    public ItemResponse addItem(AddItemRequest request){

            Item item = toEntity(request);

            itemRepository.save(item);

            return toResponse(item);
    }
}
