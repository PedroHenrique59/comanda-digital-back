package com.pedro.comandadigital.service;

import com.pedro.comandadigital.repository.MesaRepository;
import lombok.RequiredArgsConstructor;
import com.pedro.comandadigital.model.Mesa;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MesaService {

    private final MesaRepository mesaRepository;

    public Mesa salvar(Mesa mesa){
        return mesaRepository.save(mesa);
    }
}
