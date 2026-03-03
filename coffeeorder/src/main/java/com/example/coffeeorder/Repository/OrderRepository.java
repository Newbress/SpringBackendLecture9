package com.example.coffeeorder.Repository;

import com.example.coffeeorder.Domain.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

  @EntityGraph(attributePaths = {"member", "orderCoffees", "orderCoffees.coffee"})
  Optional<Order> findById(Long id);

  @EntityGraph(attributePaths = {"member", "orderCoffees", "orderCoffees.coffee"})
  List<Order> findAll();
}
