package com.esef.beauty.data;

import com.esef.beauty.data.dto.Master;
import com.esef.beauty.data.dto.Operation;
import org.springframework.data.repository.CrudRepository;

public interface OperationRepository extends CrudRepository<Operation, Long> {
}
