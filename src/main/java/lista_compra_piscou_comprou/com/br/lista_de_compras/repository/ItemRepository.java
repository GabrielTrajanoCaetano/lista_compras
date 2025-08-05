package lista_compra_piscou_comprou.com.br.lista_de_compras.repository;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
