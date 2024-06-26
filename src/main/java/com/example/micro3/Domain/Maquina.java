package com.example.micro3.Domain;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

//Nombre de la tabla de la clase.
@Table(name = "maquina")
public class Maquina {

    //Generando la llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cambiado a GenerationType.IDENTITY para autoincrementar
    @Column(name = "id", nullable = false)

    private Long id;

    //Los demás atributos
    @Column(name = "img", length = 600) //Se usa esto para que la columna de String tenga un tamaño maximo de
    //600 caracteres.
    private String img;
    private String ubicacion;
    private String tipo;

    //Constructores
    public Maquina(){}


    public Maquina(Long id2, String img2, String ubicacion2, String tipo2){
        this.id = id2;
        this.img = img2;
        this.ubicacion = ubicacion2;
        this.tipo = tipo2;
    }

    //getters
    public Long getId(){ return id; }
    public String getImg(){ return img; }
    public String getUbicacion(){ return ubicacion; }

    public String getTipo() { return tipo; }

    //setters
    public void setId(Long id2){ this.id = id; }
    public void setImg(String img){ this.img = img; }
    public void setUbicacion(String ubicacion){ this.ubicacion = ubicacion; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
