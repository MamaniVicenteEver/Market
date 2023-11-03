package com.ever.market.persistence.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import lombok.Getter;
import java.io.Serializable;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;
}
