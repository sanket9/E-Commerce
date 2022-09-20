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
@Table(name = "product_category")
public class ProductCategory extends BaseModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCategoryId;

    @Column(name = "name", nullable = false)
    private String productTitle;

    @JoinColumn(name = "parent_cat", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private ProductCategory parentCategory;
}
