package controller;

import lombok.AllArgsConstructor;
import model.Mesa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.MesaService;

@RestController
@AllArgsConstructor
@RequestMapping("/mesa")
public class MesaController {

    private final MesaService mesaService;

    @PostMapping("/salvar")
    public ResponseEntity<Mesa> salvar(@RequestBody Mesa mesa) {
        return ResponseEntity.ok(mesaService.salvar(mesa));
    }

}
