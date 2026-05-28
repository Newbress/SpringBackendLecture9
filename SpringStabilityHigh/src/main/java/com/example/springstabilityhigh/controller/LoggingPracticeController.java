package com.example.springstabilityhigh.controller;

import com.example.springstabilityhigh.service.BadLoggingService;
import com.example.springstabilityhigh.service.ExceptionLoggingService;
import com.example.springstabilityhigh.service.GoodLoggingService;
import com.example.springstabilityhigh.service.LoggingPracticeService;
import com.example.springstabilityhigh.service.SecurityLoggingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logging")
public class LoggingPracticeController {
  private final LoggingPracticeService loggingPracticeService;
  private final BadLoggingService badLoggingService;
  private final GoodLoggingService goodLoggingService;
  private final ExceptionLoggingService exceptionLoggingService;
  private final SecurityLoggingService securityLoggingService;

  public LoggingPracticeController(
      LoggingPracticeService loggingPracticeService,
      BadLoggingService badLoggingService,
      GoodLoggingService goodLoggingService,
      ExceptionLoggingService exceptionLoggingService,
      SecurityLoggingService securityLoggingService
  ){
    this.loggingPracticeService = loggingPracticeService;
    this.badLoggingService = badLoggingService;
    this.exceptionLoggingService = exceptionLoggingService;
    this.goodLoggingService = goodLoggingService;
    this.securityLoggingService =securityLoggingService;
  }

  @GetMapping("/level")
  public String testLevels() {
    loggingPracticeService.runBasicLogs();
    return "로그 레벨 테스트 완료";
  }

  @GetMapping("/bad")
  public String bad() {
    badLoggingService.runBadExample();
    return "bad logging 실행";
  }

  @GetMapping("/good")
  public String good() {
    goodLoggingService.runGoodExample();
    return "good logging 실행";
  }

  @GetMapping("/exception")
  public String exception(@RequestParam String type) {
    exceptionLoggingService.runExceptionCase(type);
    return "exception logging 실행";
  }

  @GetMapping("/security")
  public String security(@RequestParam String email,
      @RequestParam String password) {
    securityLoggingService.logUser(email, password);
    return "security logging 실행";
  }
}
