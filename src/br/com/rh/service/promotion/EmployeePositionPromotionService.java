package br.com.rh.service.promotion;

import br.com.rh.exception.ValidationException;
import br.com.rh.model.Employee;
import br.com.rh.model.EmployeePosition;

public class EmployeePositionPromotionService {
    public void promote(Employee employee, boolean isEligible) {
        final var actualEmployeePosition = employee.getEmployeePosition();
        if (EmployeePosition.MANAGER.equals(actualEmployeePosition))
            throw new ValidationException("Managers cannot be promoted!");
        if (isEligible) {
            final var newEmployeePosition = actualEmployeePosition.getNextPosition();
            employee.promote(newEmployeePosition);
        }
    }
}
