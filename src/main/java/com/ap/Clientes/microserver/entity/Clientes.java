package com.ap.Clientes.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "clientes")
@Data

public class Clientes {
	
	@Id
    private String id;
    private String nombre;
    private String correo;
    private String telefono;

}
