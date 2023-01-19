package com.app.ecommerce.model;

import javax.persistence.*;

import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Table(name = "product_category")
@Accessors(chain = true)
public class ProductCategory extends BaseModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCategoryId;

    @Column(name = "name", nullable = false)
    private String productTitle;

    @JoinColumn(name = "parent_cat", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "parent_cat", nullable = true)
    private ProductCategory parentCategory;
}
