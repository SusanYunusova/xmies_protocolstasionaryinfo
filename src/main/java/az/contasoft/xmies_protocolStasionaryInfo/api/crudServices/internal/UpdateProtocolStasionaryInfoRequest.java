package az.contasoft.xmies_protocolStasionaryInfo.api.crudServices.internal;

import java.util.Date;

public class UpdateProtocolStasionaryInfoRequest {
    private long idProtocolStasionaryInfo;
    private long idProtocol;
    private long idBedPlaceProperty;
    private Date stasionaryEnteredTime;
    private  Date expectedExitTime;
    private  int isDelete;

    public UpdateProtocolStasionaryInfoRequest() {
    }

    @Override
    public String toString() {
        return "UpdateProtocolStasionaryInfoRequest{" +
                "idProtocolStasionaryInfo=" + idProtocolStasionaryInfo +
                ", idProtocol=" + idProtocol +
                ", idBedPlaceProperty=" + idBedPlaceProperty +
                ", stasionaryEnteredTime=" + stasionaryEnteredTime +
                ", expectedExitTime=" + expectedExitTime +
                ", isDelete=" + isDelete +
                '}';
    }

    public long getIdProtocolStasionaryInfo() {
        return idProtocolStasionaryInfo;
    }

    public void setIdProtocolStasionaryInfo(long idProtocolStasionaryInfo) {
        this.idProtocolStasionaryInfo = idProtocolStasionaryInfo;
    }

    public long getIdProtocol() {
        return idProtocol;
    }

    public void setIdProtocol(long idProtocol) {
        this.idProtocol = idProtocol;
    }

    public long getIdBedPlaceProperty() {
        return idBedPlaceProperty;
    }

    public void setIdBedPlaceProperty(long idBedPlaceProperty) {
        this.idBedPlaceProperty = idBedPlaceProperty;
    }

    public Date getStasionaryEnteredTime() {
        return stasionaryEnteredTime;
    }

    public void setStasionaryEnteredTime(Date stasionaryEnteredTime) {
        this.stasionaryEnteredTime = stasionaryEnteredTime;
    }

    public Date getExpectedExitTime() {
        return expectedExitTime;
    }

    public void setExpectedExitTime(Date expectedExitTime) {
        this.expectedExitTime = expectedExitTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public UpdateProtocolStasionaryInfoRequest(long idProtocolStasionaryInfo, long idProtocol, long idBedPlaceProperty, Date stasionaryEnteredTime, Date expectedExitTime, int isDelete) {
        this.idProtocolStasionaryInfo = idProtocolStasionaryInfo;
        this.idProtocol = idProtocol;
        this.idBedPlaceProperty = idBedPlaceProperty;
        this.stasionaryEnteredTime = stasionaryEnteredTime;
        this.expectedExitTime = expectedExitTime;
        this.isDelete = isDelete;
    }
}
