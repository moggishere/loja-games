package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;

    @NotNull
    @Size(min=1, max=100, message = "O título deve ter dados")
    private String tipo;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
