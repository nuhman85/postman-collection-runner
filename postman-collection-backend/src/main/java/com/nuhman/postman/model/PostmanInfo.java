package com.nuhman.postman.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostmanInfo {

    private String _postman_id;
    private String name;
    private String schema;
    private String _exporter_id;

}
