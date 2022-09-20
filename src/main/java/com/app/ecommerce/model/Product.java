package com.app.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "title", nullable = false)
    private String productTitle;

    @Column(name = "desc", nullable = false)
    private String productDescription;

    @Column(name = "price", nullable = false)
    private Double price;

    @JoinColumn(name = "category", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private ProductCategory productCategory;

}
