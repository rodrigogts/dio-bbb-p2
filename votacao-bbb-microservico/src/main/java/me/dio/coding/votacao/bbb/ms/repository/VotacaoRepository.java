package me.dio.coding.votacao.bbb.ms.repository;

import me.dio.coding.votacao.bbb.ms.model.VotacaoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotacaoRepository extends MongoRepository<VotacaoModel, String> {
}
