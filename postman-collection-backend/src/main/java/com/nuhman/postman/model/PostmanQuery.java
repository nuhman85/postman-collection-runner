package com.nuhman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostmanQuery {
    private String key;
    private String value;
    private boolean disabled;
}
