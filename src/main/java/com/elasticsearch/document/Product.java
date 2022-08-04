package com.elasticsearch.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product")
public class Product {

  @Id
  private String id;

  @Field(type = FieldType.Text, name = "name")
  private String name;

  @Field(type = FieldType.Double, name = "price")
  private Double price;

  @Field(type = FieldType.Text, name = "creator")
  private String creator;


}

