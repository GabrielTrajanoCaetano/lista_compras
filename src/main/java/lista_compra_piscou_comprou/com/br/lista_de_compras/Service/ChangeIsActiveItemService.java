package lista_compra_piscou_comprou.com.br.lista_de_compras.Service;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;

import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toResponse;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class ChangeIsActiveItemService {

    @Autowired
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
