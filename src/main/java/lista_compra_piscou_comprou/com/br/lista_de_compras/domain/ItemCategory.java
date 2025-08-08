package lista_compra_piscou_comprou.com.br.lista_de_compras.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Item_category")
public class ItemCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id")
    private Long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "is_Active", nullable = false)
    private Boolean isActive;

    @Column(name = "item_list")
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Item> itens = new ArrayList<>();



}
