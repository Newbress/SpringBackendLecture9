package com.sprint.mission.springeventdemo.event;

public record UserRegisteredEvent(
    String userId,
    String email
) {
}