package az.contasoft.xmies_protocolStasionaryInfo.api.searchServices;


import az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal.ResponseSearchListProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal.ResponseSearchProtocolStasionaryInfo;
import az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internalService.ProtocolStasionaryInfoSearchInternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/searchServices")
public class ProtocolStasionaryInfoSearchServicesController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ProtocolStasionaryInfoSearchInternalService protocolStasionaryInfoSearchInternalService;


    @GetMapping
    public ResponseSearchListProtocolStasionaryInfo getAll() {

        logger.info("search -> controller -> All request : {}");
        return protocolStasionaryInfoSearchInternalService.getAll();


    }

    @GetMapping("/getByIdProtocolStasionaryInfo/{idProtocolStasionaryInfo}")
    public ResponseSearchProtocolStasionaryInfo getByIdProtocolStasionaryInfo(@PathVariable("idProtocolStasionaryInfo") long idProtocolStasionaryInfo){
        logger.info("search -> controller -> request : {}", idProtocolStasionaryInfo);
        return protocolStasionaryInfoSearchInternalService.getByIdProtocolStasionaryInfo(idProtocolStasionaryInfo);


    }
    @GetMapping("/getByIdProtocol/{idProtocol}")
    public ResponseSearchProtocolStasionaryInfo getByIdProtocol(@PathVariable("idProtocol") long idProtocol){
        logger.info("search -> controller -> request : {}", idProtocol);
        return protocolStasionaryInfoSearchInternalService.getByIdProtocol(idProtocol);


    }



}
