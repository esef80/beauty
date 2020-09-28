package com.esef.beauty.api.rest;

import com.esef.beauty.data.MasterRepository;
import com.esef.beauty.data.dto.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/operations")
public class OperationsController {

  @Autowired
  MasterRepository masterRepository;

  @GetMapping("/list")
  public Iterable<Master> getAll() {
    return masterRepository.findAll();
  }

  @PostMapping("/save")
  public void save(@RequestBody Master master){
    masterRepository.save(master);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable long id){
    masterRepository.deleteById(id);
  }

  @GetMapping("/get/{id{")
  public  Master get(@PathVariable long id) {
    return masterRepository.findById(id).orElseThrow(() -> new RuntimeException("Master not found"));
  }
}
