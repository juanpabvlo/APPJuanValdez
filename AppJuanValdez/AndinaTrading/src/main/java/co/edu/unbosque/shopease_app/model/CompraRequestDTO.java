package co.edu.unbosque.shopease_app.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraRequestDTO {
    private int id_usuario;
    private Double monto;
}
