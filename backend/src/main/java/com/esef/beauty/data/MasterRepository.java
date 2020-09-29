package com.esef.beauty.data;

import com.esef.beauty.data.dto.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MasterRepository extends CrudRepository<Master, Long> {
}
