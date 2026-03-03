package com.example.coffeeorder.Repository;

import com.example.coffeeorder.Domain.Stamp;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StampRepository extends JpaRepository<Stamp, Long> {
  Optional<Stamp> findByMemberId(Long memberId);
}
