package lista_compra_piscou_comprou.com.br.lista_de_compras.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @GetMapping("/protegido")
    public String protegido() {
        return "Você está autenticado!";
    }

    @GetMapping("/auth/livre")
    public String livre() {
        return "Rota pública!";
    }
}

