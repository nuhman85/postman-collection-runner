package com.nuhman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostmanItem {
    private String name;
    private PostmanEvent event;
    private PostmanRequest request;
    private PostmanResponse[] response;

}
