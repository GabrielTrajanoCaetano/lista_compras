package Service;

import domain.Item;
import repository.ItemRepository;

import java.util.List;

public class GetItem {

    private Item item;

    private ItemRepository itemRepository;

    public List<Item> getItem(){

        return itemRepository.findAll();
    }
}
