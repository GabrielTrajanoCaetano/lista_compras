package Controller.request;

import lombok.Getter;

@Getter
public class AddItemRequest {

    private String nome;
    private Integer quantidade;
    private Boolean comprado;
}
