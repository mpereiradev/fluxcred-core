package dev.matheuspereira.fluxcred.domain.handler;

import dev.matheuspereira.fluxcred.domain.model.Loan;
import dev.matheuspereira.fluxcred.domain.model.Person;

public interface LoanApprovalHandler {
  void setNext(LoanApprovalHandler next);
  void handle(Loan loan, Person person);
}
