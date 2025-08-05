package lista_compra_piscou_comprou.com.br.lista_de_compras.Service;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;

import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toEntity;
import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toResponse;

@Service
public class AddItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemResponse addItem(AddItemRequest request){

            Item item = toEntity(request);

            itemRepository.save(item);

            return toResponse(item);
    }
}
