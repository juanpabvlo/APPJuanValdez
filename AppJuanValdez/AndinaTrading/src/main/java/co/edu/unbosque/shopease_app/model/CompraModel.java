package co.edu.unbosque.shopease_app.model;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "compras")
@NoArgsConstructor
@AllArgsConstructor
public class CompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compra;

    @Column(name = "id_usuario", nullable = false)
    private int id_usuario;

    @Column(name = "fecha_compra", nullable = false)
    private Date fecha_compra;

    @Column(nullable = false)
    private Double monto;
}
