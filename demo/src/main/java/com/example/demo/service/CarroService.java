package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CarroModel;
import com.example.demo.repository.CarroRepository;

@Service
public class CarroService {
    
    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }

    public List<CarroModel> listarTodos(){
        return carroRepository.findAll();
    }

    public CarroModel salvar(CarroModel carro){
        return carroRepository.save(carro);
    }

    
}
