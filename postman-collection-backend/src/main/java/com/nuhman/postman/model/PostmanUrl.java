package com.nuhman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostmanUrl {
    private HTTPProtocol protocol;
    private String[] host;
    private String[] path;
    private String raw;


}
