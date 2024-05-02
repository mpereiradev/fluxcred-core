package dev.matheuspereira.fluxcred.core.domain.model;

import dev.matheuspereira.fluxcred.core.domain.exception.BusinessException;
import lombok.Getter;

@Getter
public enum IdentifierType {
  PF("Pessoa Física", 11),
  PJ("Pessoa Jurídica", 14),
  EU("Estudante Universitário", 8),
  AP("Aposentado", 10);

  private String description;
  private int length;

  IdentifierType(String description, int length) {
    this.description = description;
    this.length = length;
  }

  public static IdentifierType fromLength(int length) {
    for (IdentifierType type : IdentifierType.values()) {
      if (type.getLength() == length) {
        return type;
      }
    }

    throw new BusinessException("No valid identifier type found for length: " + length, 412);
  }

  public static IdentifierType fromKey(String key) {
    for (IdentifierType type : IdentifierType.values()) {
      if (type.name().equalsIgnoreCase(key)) {
        return type;
      }
    }

    throw new BusinessException("No valid identifier type found for key: " + key, 412);
  }
}