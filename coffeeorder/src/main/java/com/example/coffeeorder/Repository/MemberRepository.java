package com.example.coffeeorder.Repository;

import com.example.coffeeorder.Domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
