package az.contasoft.xmies_protocolStasionaryInfo.db.repo;

import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoProtocolStasionaryInfo extends CrudRepository<ProtocolStasionaryInfo, Long> {
    List<ProtocolStasionaryInfo> findAll();


    ProtocolStasionaryInfo findByIdProtocolStasionaryInfo(long idProtocolStasionaryInfo);

    ProtocolStasionaryInfo findByIdProtocol (long idProtocol);
}
