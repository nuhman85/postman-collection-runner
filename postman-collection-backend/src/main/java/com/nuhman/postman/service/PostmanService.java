package com.nuhman.postman.service;

import com.nuhman.postman.model.PostmanRequest;
import com.nuhman.postman.model.PostmanResponse;
import com.nuhman.postman.model.PostmanWrapper;

public interface PostmanService {
    void processRequest(PostmanWrapper postmanWrapper);
    

}
