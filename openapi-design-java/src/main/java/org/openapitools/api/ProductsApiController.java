package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.GetAllProducts200Response;
import org.openapitools.model.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-18T07:48:19.952582096+01:00[Europe/Malta]")
@Controller
@RequestMapping("${openapi.products.base-path:/products-api/v1}")
public class ProductsApiController implements ProductsApi {

    private final NativeWebRequest request;

    @Autowired
    public ProductsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Product> getProduct(String id) {
        return ResponseEntity.ok(new Product()
                .id("abc-123-xyz")
                .name("Chocolate")
                .price(4.67d)
                .description("Dark chocolate bar 90%")
                .lastUpdatedOn(OffsetDateTime.now()));
    }
}
