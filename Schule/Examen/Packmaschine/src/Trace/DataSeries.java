package Trace;

import java.time.LocalDateTime;

public class DataSeries {
    private String machineID;
    private  String driveName;
    private LocalDateTime traceStartTime;
    private String  valueType;
    private  String reasonOfImport;
    private  String  operatiorOfImport;

    public DataSeries(String machineID, String driveName, LocalDateTime traceStartTime, String valueType, String reasonOfImport, String operatiorOfImport) {
        this.machineID = machineID;
        this.driveName = driveName;
        this.traceStartTime = traceStartTime;
        this.valueType = valueType;
        this.reasonOfImport = reasonOfImport;
        this.operatiorOfImport = operatiorOfImport;
    }
}
