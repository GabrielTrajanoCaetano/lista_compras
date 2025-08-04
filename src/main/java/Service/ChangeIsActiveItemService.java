package Service;

import Controller.response.ItemResponse;
import domain.Item;
import org.springframework.web.server.ResponseStatusException;
import repository.ItemRepository;

import static Mapper.ItemMapper.toResponse;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

public class ChangeIsActiveItemService {

    private ItemRepository itemRepository;

    public ItemResponse changeIsActive(Long id, boolean setIsActive){

        Item item = itemRepository.findById(id).orElseThrow(()-> new ResponseStatusException(BAD_REQUEST, "ERROR"));

        item.setActive(setIsActive);

        if(item.isActive() != setIsActive){
            itemRepository.save(item);
        }

        return toResponse(item);
    }
}
