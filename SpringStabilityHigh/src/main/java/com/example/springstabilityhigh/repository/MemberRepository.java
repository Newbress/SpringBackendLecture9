package com.example.springstabilityhigh.repository;

import com.example.springstabilityhigh.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}