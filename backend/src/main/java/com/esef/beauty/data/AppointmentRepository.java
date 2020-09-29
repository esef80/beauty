package com.esef.beauty.data;

import com.esef.beauty.data.dto.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
