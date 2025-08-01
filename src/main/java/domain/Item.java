package domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item_ID")
    private Long id;

    @Column(name = "Nome_produto")
    private String nome;

    @Column(name = "Quantidade_produto")
    private Integer quantidade;

    @Column(name = "Comprado:")
    private Boolean comprado;

    private boolean isActive = true;

}
