package com.app.ecommerce.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
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

    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private ProductCategory productCategory;

}
