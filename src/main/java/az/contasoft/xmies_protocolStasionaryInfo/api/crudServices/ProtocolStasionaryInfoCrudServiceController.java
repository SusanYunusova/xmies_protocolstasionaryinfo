package az.contasoft.xmies_protocolStasionaryInfo.api.crudServices;

import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.DeleteProtocolStasionaryInfoRequest;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.ProtocolStasionaryInfoResponse;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.SaveProtocolStasionaryInfoRequest;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal.UpdateProtocolStasionaryInfoRequest;
import az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internalService.ProtocolStasionaryInfoCrudInternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/crudServices")
public class ProtocolStasionaryInfoCrudServiceController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProtocolStasionaryInfoCrudInternalService protocolStasionaryInfoCrudInternalService;

    @PostMapping("/add")
    public ProtocolStasionaryInfoResponse saveProtocolStasionaryInfo(@RequestBody SaveProtocolStasionaryInfoRequest saveProtocolStasionaryInfoRequest) {
        logger.info("xmies_protocolStasionaryInfo->add->request : {}" + saveProtocolStasionaryInfoRequest.toString());
        return protocolStasionaryInfoCrudInternalService.saveProtocolStasionaryInfo(saveProtocolStasionaryInfoRequest);

    }

    @PostMapping("/update")
    public ProtocolStasionaryInfoResponse updateProtocolStasionaryInfo(@RequestBody UpdateProtocolStasionaryInfoRequest updateProtocolStasionaryInfoRequest) {
        logger.info("xmies_protocolStasionaryInfo->update->request : {}" + updateProtocolStasionaryInfoRequest.toString());
        return protocolStasionaryInfoCrudInternalService.updateProtocolStasionaryInfo(updateProtocolStasionaryInfoRequest);

    }


    @GetMapping("/delete/{idProtocolStasionaryInfo}/{idPersonal}")
    public ProtocolStasionaryInfoResponse deleteProtocolStasionaryInfo(@PathVariable("idProtocolStasionaryInfo") long idProtocolStasionaryInfo,
                                                                       @PathVariable("idPersonal") long idPersonal) {
        return protocolStasionaryInfoCrudInternalService.deleteProtocolStasionaryInfo(idProtocolStasionaryInfo,idPersonal);


    }




}
