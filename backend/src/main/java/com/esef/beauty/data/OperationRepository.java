package com.esef.beauty.data;

import com.esef.beauty.data.dto.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface OperationRepository extends CrudRepository<Operation, Long> {
}
