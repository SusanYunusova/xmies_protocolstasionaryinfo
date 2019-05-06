package az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal;

import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;

public class ResponseSearchProtocolStasionaryInfo {
    private int serverCode;
    private String serverMessage;
    private ProtocolStasionaryInfo protocolStasionaryInfo;

    public ResponseSearchProtocolStasionaryInfo() {
    }

    @Override
    public String toString() {
        return "ResponseSearchProtocolStasionaryInfo{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", protocolStasionaryInfo=" + protocolStasionaryInfo +
                '}';
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

    public ProtocolStasionaryInfo getProtocolStasionaryInfo() {
        return protocolStasionaryInfo;
    }

    public void setProtocolStasionaryInfo(ProtocolStasionaryInfo protocolStasionaryInfo) {
        this.protocolStasionaryInfo = protocolStasionaryInfo;
    }

    public ResponseSearchProtocolStasionaryInfo(int serverCode, String serverMessage, ProtocolStasionaryInfo protocolStasionaryInfo) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.protocolStasionaryInfo = protocolStasionaryInfo;
    }
}
