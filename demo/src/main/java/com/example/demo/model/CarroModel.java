package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable= false)
    private String modelo;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = false)
    private String marca;


    public Long getId(){
        return this.id;
    }

    public String getModelo(){
        return this.modelo;
    }

    public Integer getAno(){
        return this.ano;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    

}
