package service;

import lombok.AllArgsConstructor;
import model.Mesa;
import org.springframework.stereotype.Service;
import repository.MesaRepository;

@AllArgsConstructor
@Service
public class MesaService {

    private final MesaRepository mesaRepository;

    public Mesa salvar(Mesa mesa){
        return mesaRepository.save(mesa);
    }
}
