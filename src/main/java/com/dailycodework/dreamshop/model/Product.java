package com.dailycodework.dreamshop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private int inventory;
    private Category category;
    //@OneToMany
    //A anotação @OneToMany indica que uma entidade (no caso, Product) pode estar associada a várias outras entidades (no caso, Image). Ou seja, um produto pode ter várias imagens associadas a ele.
    //
    //mappedBy = "product"
    //O atributo mappedBy indica que o lado "dono" do relacionamento é a entidade Image. Isso significa que o relacionamento é mapeado pelo campo product na entidade Image. Em outras palavras:
    //
    //Na entidade Image, há um campo private Product product;, que define que cada imagem está associada a um produto específico.
    //O lado "dono" do relacionamento (ou seja, quem gerencia a associação no banco de dados) é a entidade Image.

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Image> images;
}
