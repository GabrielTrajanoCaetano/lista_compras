package Service;

import Controller.request.EditItemRequest;
import Controller.response.ItemResponse;
import domain.Item;
import org.springframework.web.server.ResponseStatusException;
import repository.ItemRepository;

import static Mapper.ItemMapper.toResponse;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

public class UpdateItemService {

    private ItemRepository itemRepository;

    public ItemResponse update(Long id, EditItemRequest request) {
        Item existente = itemRepository.findById(id).orElseThrow(()-> new ResponseStatusException(BAD_REQUEST, "ERROR"));

        existente.setNome(request.getName());
        existente.setQuantidade(request.getQuantidade());
        existente.setComprado(request.getComprado());

        itemRepository.save(existente);

        return toResponse(existente);
    }
}