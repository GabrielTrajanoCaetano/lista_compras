package Service;

import Controller.request.AddItemRequest;
import Controller.response.ItemResponse;
import domain.Item;
import repository.ItemRepository;

import static Mapper.ItemMapper.toResponse;

public class AddItem {
    private Item item;

    private ItemRepository itemRepository;

    public ItemResponse addItem(AddItemRequest request){

            itemRepository.save(item);

            return toResponse(item);
    }
}
