package az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internalService;

import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.ProtocolStasionaryInfoResponse;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.SaveProtocolStasionaryInfoRequest;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.UpdateProtocolStasionaryInfoRequest;
import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.db.repo.RepoProtocolStasionaryInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProtocolStasionaryInfoCrudInternalService {
    @Autowired
    RepoProtocolStasionaryInfo  repoProtocolStasionaryInfo;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //save

    public ProtocolStasionaryInfoResponse saveProtocolStasionaryInfo(SaveProtocolStasionaryInfoRequest saveProtocolStasionaryInfoRequest){
        ProtocolStasionaryInfoResponse protocolStasionaryInfoResponse=new ProtocolStasionaryInfoResponse();
        try {
            ProtocolStasionaryInfo protocolStasionaryInfo= new ProtocolStasionaryInfo();

            logger.info("saveProtocolStasionaryInfo response: {}",saveProtocolStasionaryInfoRequest.toString());

            protocolStasionaryInfo.setExpectedExitTime(saveProtocolStasionaryInfoRequest.getExpectedExitTime());
            protocolStasionaryInfo.setIdBedPlaceProperty(saveProtocolStasionaryInfoRequest.getIdBedPlaceProperty());
            protocolStasionaryInfo.setIdProtocol(saveProtocolStasionaryInfoRequest.getIdProtocol());
            protocolStasionaryInfo.setIsDelete(saveProtocolStasionaryInfoRequest.getIsDelete());
            protocolStasionaryInfo.setStasionaryEnteredTime(saveProtocolStasionaryInfoRequest.getStasionaryEnteredTime());
            protocolStasionaryInfo.setIdProtocolStasionaryInfo(saveProtocolStasionaryInfoRequest.getIdProtocolStasionaryInfo());




            protocolStasionaryInfo = repoProtocolStasionaryInfo.save(protocolStasionaryInfo);

            protocolStasionaryInfoResponse.setServerCode(200);
            protocolStasionaryInfoResponse.setServerMessage("Ok");
            protocolStasionaryInfoResponse.setProtocolStasionaryInfo(protocolStasionaryInfo);
        }
        catch (Exception e){
            protocolStasionaryInfoResponse.setServerCode(100);
            protocolStasionaryInfoResponse.setServerMessage("Error");
            logger.error("Error save file:{}",e);

        }
        return  protocolStasionaryInfoResponse;
    }
    public  ProtocolStasionaryInfoResponse updateProtocolStasionaryInfo(UpdateProtocolStasionaryInfoRequest updateProtocolStasionaryInfoRequest) {
        ProtocolStasionaryInfoResponse protocolStasionaryInfoResponse = new ProtocolStasionaryInfoResponse();
        ProtocolStasionaryInfo protocolStasionaryInfo = new ProtocolStasionaryInfo();

        try {
            if (protocolStasionaryInfo != null) {
                protocolStasionaryInfoResponse.setServerCode(200);
                protocolStasionaryInfoResponse.setServerMessage("Ok");
                logger.info("updateProtocolStasionaryInfo response: {}", updateProtocolStasionaryInfoRequest.toString());


                protocolStasionaryInfo.setExpectedExitTime(updateProtocolStasionaryInfoRequest.getExpectedExitTime());
                protocolStasionaryInfo.setIdBedPlaceProperty(updateProtocolStasionaryInfoRequest.getIdBedPlaceProperty());
                protocolStasionaryInfo.setIdProtocol(updateProtocolStasionaryInfoRequest.getIdProtocol());
                protocolStasionaryInfo.setIsDelete(updateProtocolStasionaryInfoRequest.getIsDelete());
                protocolStasionaryInfo.setStasionaryEnteredTime(updateProtocolStasionaryInfoRequest.getStasionaryEnteredTime());
                // protocolStasionaryInfo.setIdProtocolStasionaryInfo(updateProtocolStasionaryInfoRequest.getIdProtocolStasionaryInfo());
            } else {
                protocolStasionaryInfoResponse.setServerCode(200);
                protocolStasionaryInfoResponse.setServerMessage("OK");
                logger.info("updateprotocolStasionaryInfo response : {}", protocolStasionaryInfoResponse.toString());
            }


        } catch (Exception e) {
            protocolStasionaryInfoResponse.setServerCode(100);
            protocolStasionaryInfoResponse.setServerMessage("No update");
            logger.error("Error updateprotocolStasionaryInfo : {}", e);
        }
        return protocolStasionaryInfoResponse;
    }




    public ProtocolStasionaryInfoResponse deleteProtocolStasionaryInfo(long idProtocolStasionaryInfo ,long idPersonal){

        ProtocolStasionaryInfoResponse protocolStasionaryInfoResponse = new ProtocolStasionaryInfoResponse();

            try {
                ProtocolStasionaryInfo pat = repoProtocolStasionaryInfo.findByIdProtocolStasionaryInfo(idProtocolStasionaryInfo);

                if (pat == null) {
                    protocolStasionaryInfoResponse.setServerMessage("protocolStasionaryInfo not found");
                    protocolStasionaryInfoResponse.setServerCode(230);
                } else {
                    protocolStasionaryInfoResponse.setServerCode(200);
                    protocolStasionaryInfoResponse.setServerMessage("OK protocolStasionaryInfo is deleted");
                    pat.setIsDelete(1);
                    repoProtocolStasionaryInfo.save(pat);

                }
            } catch (Exception e) {
                protocolStasionaryInfoResponse.setServerCode(100);
                protocolStasionaryInfoResponse.setServerMessage("Error protocolStasionaryInfo deleting : "+e);
                logger.error("Error delete : {}", e);
            }
            return protocolStasionaryInfoResponse;
        }


}
