package com.example.coffeeorder.Domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name ="stamps")
@Getter
public class Stamp {

  @Id
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id", nullable = false, unique = true)
  private Member member;

  @Column(name = "stamp_count", nullable = false)
  private int stampCount;

  protected Stamp() {}

  public int getstampCount() { return stampCount;}
  public void increase(int amount) {
    this.stampCount += amount;
  }
}
