package Service;

import Controller.response.ItemResponse;
import domain.Item;
import org.springframework.web.server.ResponseStatusException;
import repository.ItemRepository;

import static Mapper.ItemMapper.toResponse;
import static java.util.Objects.isNull;
import static org.springframework.http.HttpStatus.BAD_REQUEST;


public class GetItemByIdService {

    private ItemRepository itemRepository;

    public ItemResponse getItemById(Long id, boolean isActive){

        if(isNull(isActive)){
            isActive = true;
        }

        Item item = itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(BAD_REQUEST, "ERROR"));

        itemRepository.save(item);

        return toResponse(item);

    }
}
