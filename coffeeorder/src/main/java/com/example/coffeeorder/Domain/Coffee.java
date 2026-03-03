package com.example.coffeeorder.Domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "coffees")
@Getter
public class Coffee {

  @Id
  private Long id;

  @Column(nullable = false)
  private String name;

  private int price;

  protected Coffee() {}
}
