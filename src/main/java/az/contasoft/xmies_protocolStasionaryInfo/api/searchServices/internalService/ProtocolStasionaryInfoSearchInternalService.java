package az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internalService;


import az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal.ResponseSearchListProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal.ResponseSearchProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.db.repo.RepoProtocolStasionaryInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProtocolStasionaryInfoSearchInternalService {

    @Autowired
    RepoProtocolStasionaryInfo repoProtocolStasionaryInfo;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ResponseSearchListProtocolStasionaryInfo getAll() {
        ResponseSearchListProtocolStasionaryInfo responseSearchListProtocolStasionaryInfo = new ResponseSearchListProtocolStasionaryInfo();
        logger.info("search ALL ProtocolStasionaryInfo : {}", responseSearchListProtocolStasionaryInfo.toString());
        try {
            List<ProtocolStasionaryInfo> protocolStasionaryInfoList = repoProtocolStasionaryInfo.findAll();

            if (protocolStasionaryInfoList == null || protocolStasionaryInfoList.isEmpty()) {
                responseSearchListProtocolStasionaryInfo.setProtocolStasionaryInfoList(null);
                responseSearchListProtocolStasionaryInfo.setServerCode(210);
                responseSearchListProtocolStasionaryInfo.setServerMessage("responseSearchListProtocolStasionaryInfo not found");

                logger.info("search responseSearchListProtocolStasionaryInfo : {}", responseSearchListProtocolStasionaryInfo.toString());
            } else {
                responseSearchListProtocolStasionaryInfo.setProtocolStasionaryInfoList(protocolStasionaryInfoList);
                responseSearchListProtocolStasionaryInfo.setServerCode(200);
                responseSearchListProtocolStasionaryInfo.setServerMessage("responseSearchListProtocolStasionaryInfo found");

                logger.info("search Faktura : {}", responseSearchListProtocolStasionaryInfo.toString());
            }
            return responseSearchListProtocolStasionaryInfo;


        } catch (Exception e) {
            responseSearchListProtocolStasionaryInfo.setServerCode(100);
            responseSearchListProtocolStasionaryInfo.setServerMessage(e + " ");
            logger.info("error getting ALL responseSearchListProtocolStasionaryInfo : {}", e,e);

            return responseSearchListProtocolStasionaryInfo;
        }

    }


    public ResponseSearchProtocolStasionaryInfo getByIdProtocolStasionaryInfo(long idProtocolStasionaryInfo) {
        ResponseSearchProtocolStasionaryInfo response = new ResponseSearchProtocolStasionaryInfo();
        ProtocolStasionaryInfo byidProtocolStasionaryInfo = repoProtocolStasionaryInfo.findByIdProtocolStasionaryInfo(idProtocolStasionaryInfo);

        try {
            if (byidProtocolStasionaryInfo == null) {
                response.setProtocolStasionaryInfo(null);
                response.setServerCode(210);
                response.setServerMessage("byidProtocolStasionaryInfo not found");

                logger.info("Error search byidProtocolStasionaryInfo : {}", response.toString(), "idFaktura : {}", byidProtocolStasionaryInfo);
            } else {
                response.setProtocolStasionaryInfo(byidProtocolStasionaryInfo);
                response.setServerCode(200);
                response.setServerMessage("responseSearchProtocolStasionaryInfo found");

                logger.info("search by id ProtocolStasionaryInfo : {}", response.toString());
            }

            return response;
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("Error");
            return response;
        }
    }


    public ResponseSearchProtocolStasionaryInfo getByIdProtocol(long idProtocol) {
        ResponseSearchProtocolStasionaryInfo response = new ResponseSearchProtocolStasionaryInfo();
        ProtocolStasionaryInfo byIdProtocol = repoProtocolStasionaryInfo.findByIdProtocol(idProtocol);

        try {
            if (byIdProtocol == null) {
                response.setProtocolStasionaryInfo(null);
                response.setServerCode(210);
                response.setServerMessage("byidProtocol not found");

                logger.info("Error search byidProtocol : {}", response.toString(), "idProtocol : {}", idProtocol);
            } else {
                response.setProtocolStasionaryInfo(byIdProtocol);
                response.setServerCode(200);
                response.setServerMessage("responseSearchProtocolStasionaryInfo found");

                logger.info("search by id ProtocolStasionaryInfo : {}", response.toString());
            }

            return response;
        } catch (Exception e) {
            response.setServerCode(100);
            response.setServerMessage("Error");
            return response;
        }


    }
}
