package Service;

import domain.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import repository.ItemRepository;

import java.util.List;

@Service
public class ItemService {

    private Item item;

    private ItemRepository itemRepository;

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getItem(){
        return itemRepository.findAll();
    }

    public Item update(Item item, Item novoItem){
        Item existente = itemRepository.findById(item.getId()).orElseThrow();
        existente.setNome(novoItem.getNome());
        existente.setQuantidade(novoItem.getQuantidade());
        existente.setComprado(novoItem.getComprado());
        return itemRepository.save(novoItem);
    }

  
}
