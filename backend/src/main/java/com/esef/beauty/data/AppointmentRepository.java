package com.esef.beauty.data;

import com.esef.beauty.data.dto.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
