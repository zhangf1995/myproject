package com.myproject.es.esDomain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @program: myproject
 * @description: 测试类
 * @author: zf
 * @create: 2019-04-09 17:02
 **/
@Document(indexName = "test",type = "test",shards = 5,replicas = 1)
public class Test {
    @Id
    private Long id;

    @Field(analyzer = "ik_max_word")
    private String title; //标题
    private String category;// 分类
    private String brand; // 品牌
    private Double price; // 价格
    private String images; // 图片地址

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
