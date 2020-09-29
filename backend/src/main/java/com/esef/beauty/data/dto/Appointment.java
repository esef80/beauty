package com.esef.beauty.data.dto;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Appointment {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private LocalDateTime time;
  @OneToOne
  private Master master;

  @OneToOne
  private Customer customer;

  @OneToMany
  private List<Operation> operations;

}
