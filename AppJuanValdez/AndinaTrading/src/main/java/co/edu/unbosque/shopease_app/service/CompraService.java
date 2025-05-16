package co.edu.unbosque.shopease_app.service;


import co.edu.unbosque.shopease_app.model.CompraModel;
import co.edu.unbosque.shopease_app.repository.CompraRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class CompraService {

    private final CompraRepository compraRepository;

    public CompraService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Transactional
    public CompraModel registrarCompra(int idUsuario, Double monto) {
        CompraModel compra = new CompraModel();
        compra.setId_usuario(idUsuario);
        compra.setMonto(monto);
        compra.setFecha_compra(Date.valueOf(LocalDate.now()));

        return compraRepository.save(compra);
    }
}
