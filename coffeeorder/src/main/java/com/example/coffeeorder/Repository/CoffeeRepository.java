package com.example.coffeeorder.Repository;

import com.example.coffeeorder.Domain.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

}
