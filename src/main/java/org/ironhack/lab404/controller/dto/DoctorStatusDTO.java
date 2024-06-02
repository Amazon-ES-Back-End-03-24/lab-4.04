package org.ironhack.lab404.controller.dto;

import jakarta.validation.constraints.NotNull;
import org.ironhack.lab404.enums.EmployeeStatus;

public class DoctorStatusDTO {
    @NotNull(message = "Status can't be null.")
    private EmployeeStatus status;

    public @NotNull(message = "Status can't be null.") EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(@NotNull(message = "Status can't be null.") EmployeeStatus employeeStatus) {
        this.status = employeeStatus;
    }
}
