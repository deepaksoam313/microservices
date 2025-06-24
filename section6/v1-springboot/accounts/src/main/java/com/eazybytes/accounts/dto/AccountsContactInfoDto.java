package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// no setter method only generated geter behind the scene
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String,String> contactDetails, List<String> onCallSupport) {
}
