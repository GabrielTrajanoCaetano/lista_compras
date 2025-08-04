package Controller;

import Controller.request.AddItemRequest;
import Controller.request.EditItemRequest;
import Controller.response.ItemResponse;
import Service.AddItemService;
import Service.ChangeIsActiveItemService;
import Service.GetItemByIdService;
import Service.UpdateItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "*")
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
   public ItemResponse changeIsActive(@PathVariable Long id, @RequestParam boolean isActive){
        return changeIsActiveItemService.changeIsActive(id, isActive);
   }

    @GetMapping("/{id}")
    public ItemResponse getItem(@PathVariable Long id, @RequestParam boolean isActive ){
        return getItemByIdService.getItemById(id, isActive);
    }

    @PutMapping("/{id}")
    public ItemResponse updateItem(@PathVariable Long id, @RequestBody EditItemRequest request){
        return updateItemService.update(id, request);
    }
}
