package Controller.request;

import lombok.Getter;

@Getter
public class EditItemRequest {

    private String name;
    private Integer quantidade;
    private Boolean comprado;
}
