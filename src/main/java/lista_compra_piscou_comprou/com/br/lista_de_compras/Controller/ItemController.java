package lista_compra_piscou_comprou.com.br.lista_de_compras.Controller;

import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.AddItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.request.EditItemRequest;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Controller.response.ItemResponse;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Service.AddItemService;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Service.ChangeIsActiveItemService;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Service.GetItemByIdService;
import lista_compra_piscou_comprou.com.br.lista_de_compras.Service.UpdateItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Item")
public class ItemController {

    @Autowired
    private AddItemService addItemService;

    @Autowired
    private ChangeIsActiveItemService changeIsActiveItemService;

    @Autowired
    private GetItemByIdService getItemByIdService;

    @Autowired
    private UpdateItemService updateItemService;

    @PostMapping
    public ItemResponse addItem(@RequestBody AddItemRequest request){
        return addItemService.addItem(request);
    }

   @PatchMapping("/{id}")
   public ItemResponse changeIsActive(@PathVariable Long id, @RequestParam Boolean isActive){
        return changeIsActiveItemService.changeIsActive(id, isActive);
   }

    @GetMapping("/{id}")
    public ItemResponse getItemById(@PathVariable Long id, @RequestParam Boolean isActive ){
        return getItemByIdService.getItemById(id);
    }

    @PutMapping("/{id}")
    public ItemResponse updateItem(@PathVariable Long id, @RequestBody EditItemRequest request){
        return updateItemService.update(id, request);
    }
}
