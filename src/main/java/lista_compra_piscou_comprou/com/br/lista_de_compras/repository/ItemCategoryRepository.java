package lista_compra_piscou_comprou.com.br.lista_de_compras.repository;

import lista_compra_piscou_comprou.com.br.lista_de_compras.domain.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}
