package az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal;

import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;

public class ProtocolStasionaryInfoResponse {
    private int serverCode;
    private String serverMessage;
    private ProtocolStasionaryInfo protocolStasionaryInfo;

    public ProtocolStasionaryInfoResponse() {
    }

    public ProtocolStasionaryInfoResponse(int serverCode, String serverMessage, ProtocolStasionaryInfo protocolStasionaryInfo) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.protocolStasionaryInfo = protocolStasionaryInfo;
    }


    @Override
    public String toString() {
        return "ProtocolStasionaryInfoResponse{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", protocolStasionaryInfo=" + protocolStasionaryInfo +
                '}';
    }

    public ProtocolStasionaryInfo getProtocolStasionaryInfo() {
        return protocolStasionaryInfo;
    }

    public void setProtocolStasionaryInfo(ProtocolStasionaryInfo protocolStasionaryInfo) {
        this.protocolStasionaryInfo = protocolStasionaryInfo;
    }

    public int getServerCode() {
        return serverCode;
    }

    public void setServerCode(int serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public ProtocolStasionaryInfoResponse(int serverCode, String serverMessage) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
    }
}
