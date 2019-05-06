package az.contasoft.xmies_protocolStasionaryInfo.api.searchServices.internal;

import az.contasoft.xmies_protocolStasionaryInfo.db.entity.ProtocolStasionaryInfo;

import java.util.List;

public class ResponseSearchListProtocolStasionaryInfo {

    private int serverCode;
    private String serverMessage;
    private List<ProtocolStasionaryInfo> protocolStasionaryInfoList;

    public ResponseSearchListProtocolStasionaryInfo() {
    }

    @Override
    public String toString() {
        return "ResponseSearchListProtocolStasionaryInfo{" +
                "serverCode=" + serverCode +
                ", serverMessage='" + serverMessage + '\'' +
                ", protocolStasionaryInfoList=" + protocolStasionaryInfoList +
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

    public List<ProtocolStasionaryInfo> getProtocolStasionaryInfoList() {
        return protocolStasionaryInfoList;
    }

    public void setProtocolStasionaryInfoList(List<ProtocolStasionaryInfo> protocolStasionaryInfoList) {
        this.protocolStasionaryInfoList = protocolStasionaryInfoList;
    }

    public ResponseSearchListProtocolStasionaryInfo(int serverCode, String serverMessage, List<ProtocolStasionaryInfo> protocolStasionaryInfoList) {
        this.serverCode = serverCode;
        this.serverMessage = serverMessage;
        this.protocolStasionaryInfoList = protocolStasionaryInfoList;
    }
}
