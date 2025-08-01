package Controller;

import domain.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domain/item")
@CrossOrigin(origins = "*")
public class ItemController {

    private ItemService itemService;


}
