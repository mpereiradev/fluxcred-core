package dev.matheuspereira.fluxcred.core.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
  private Integer id;
  private String personIdentifier;
  private BigDecimal amount;
  private int numberOfInstallments;
  private LoanStatus status;
  private LocalDate firstPaymentDate;
  private LocalDateTime approvalDate;
  private LocalDateTime signingDate;
  private LocalDateTime delinquencyDate;
  private LocalDateTime nextPaymentDate;
  private LocalDateTime completionDate;
  private LocalDateTime cancellationDate;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
