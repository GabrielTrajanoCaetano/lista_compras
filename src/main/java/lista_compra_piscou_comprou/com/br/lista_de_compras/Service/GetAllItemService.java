package lista_compra_piscou_comprou.com.br.lista_de_compras.Service;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import lista_compra_piscou_comprou.com.br.lista_de_compras.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static lista_compra_piscou_comprou.com.br.lista_de_compras.Mapper.ItemMapper.toResponse;

@Service
public class GetAllItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemResponse> getAllItens(){
        List<Item> items = itemRepository.findAll();
        List<ItemResponse> responses = items.stream()
                                           .map(item -> toResponse(item))
                                           .collect(Collectors.toList());

        return responses;

    }
}
