package me.dio.coding.votacao.bbb.ms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("participantes")
public class ParticipanteModel {

    @Id
    private String id;
    private String nome;

}
