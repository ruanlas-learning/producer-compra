package com.example.producercompra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class CompraInput implements Serializable {

    private Integer productId;
    private Integer userId;
    private Double price;
}
