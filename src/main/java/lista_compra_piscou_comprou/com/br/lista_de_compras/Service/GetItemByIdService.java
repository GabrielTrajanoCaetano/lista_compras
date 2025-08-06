package lista_compra_piscou_comprou.com.br.lista_de_compras.Service;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toResponse;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class GetItemByIdService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemResponse getItemById(Long id) {


        Item item = itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(BAD_REQUEST, "ERROR"));


        return toResponse(item);

    }
}
