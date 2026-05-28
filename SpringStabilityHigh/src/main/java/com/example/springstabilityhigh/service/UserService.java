package com.example.springstabilityhigh.service;


import com.example.springstabilityhigh.exception.DuplicateEmailException;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final Set<String> emails = new HashSet<>();

  public void register(String email) {

    // 비즈니스 규칙: 이메일 중복 금지
    if (emails.contains(email)) {
      throw new DuplicateEmailException(email);
    }

    emails.add(email);
  }
}