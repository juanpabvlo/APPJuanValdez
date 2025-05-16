package co.edu.unbosque.shopease_app.controller;

import co.edu.unbosque.shopease_app.model.CompraModel;
import co.edu.unbosque.shopease_app.model.CompraRequestDTO;
import co.edu.unbosque.shopease_app.service.CompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    private final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<CompraModel> registrarCompra(@RequestBody CompraRequestDTO request) {
        CompraModel compra = compraService.registrarCompra(request.getId_usuario(), request.getMonto());
        return ResponseEntity.ok(compra);
    }
}
