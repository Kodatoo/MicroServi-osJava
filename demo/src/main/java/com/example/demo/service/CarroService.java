package com.example.demo.service;
import java.util.List;
import java.util.Optional;

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

     public Optional<CarroModel> listarPorId(Long id) {
        return carroRepository.findById(id);
    }

    public CarroModel atualizarPorId(Long id, CarroModel dadosNovos){
        CarroModel carroExistente = carroRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Carro não encontrado"));


        carroExistente.setMarca(dadosNovos.getMarca());
        carroExistente.setAno(dadosNovos.getAno());
        carroExistente.setModelo(dadosNovos.getModelo());

        return carroRepository.save(carroExistente);

    }

    public void excluirPorId(Long id){
        Optional<CarroModel> carrOptional = carroRepository.findById(id);

        if(carrOptional.isPresent()){
            carroRepository.deleteById(id);
        } else{
            throw new RuntimeException("Carro não encontrado");
        }

    }



    
}
