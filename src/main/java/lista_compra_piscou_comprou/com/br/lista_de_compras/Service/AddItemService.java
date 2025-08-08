package lista_compra_piscou_comprou.com.br.lista_de_compras.Service;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;
import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toEntity;
import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toResponse;

@Service
public class AddItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemCategory itemCategory;

    public ItemResponse addItem(AddItemRequest request) {


        Item item = toEntity(request, itemCategory);
        if (isNull(item.getIsActive())) {
            item.setIsActive(true);
        }

        itemRepository.save(item);

        return toResponse(item);
    }
}
