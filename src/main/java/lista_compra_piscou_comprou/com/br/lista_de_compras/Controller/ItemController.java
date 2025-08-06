package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.EditItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Item")
public class ItemController {

    @Autowired
    private AddItemService addItemService;

    @Autowired
    private ChangeIsActiveItemService changeIsActiveItemService;

    @Autowired
    private GetAllItemActiveService getAllItemActiveService;

    @Autowired
    private GetItemByIdService getItemByIdService;

    @Autowired
    private UpdateItemService updateItemService;

    @PostMapping
    public ItemResponse addItem(@RequestBody AddItemRequest request) {
        return addItemService.addItem(request);
    }

    @PatchMapping("/{id}/changeIsActive")
    public ResponseEntity<ItemResponse> changeIsActive(@PathVariable Long id) {
        ItemResponse response = changeIsActiveItemService.changeIsActive(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getAll")
    public List<ItemResponse> getAllItem() {
        return getAllItemActiveService.getAllItens();
    }

    @GetMapping("/{id:\\d+}")
    public ItemResponse getItemById(@PathVariable Long id) {
        return getItemByIdService.getItemById(id);
    }

    @PutMapping("/{id}")
    public ItemResponse updateItem(@PathVariable Long id, @RequestBody EditItemRequest request) {
        return updateItemService.update(id, request);
    }
}
