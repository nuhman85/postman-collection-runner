package com.nuhman.postman.model;

import org.springframework.core.env.Environment;

import java.util.List;

public record PostmanEnvironment(String id,
                                 String name,
                                 List<PostmanValueType> values,
                                 Environment _postman_variable_scope,
                                 String _postman_exported_at,
                                 String _postman_exported_using) {

}
