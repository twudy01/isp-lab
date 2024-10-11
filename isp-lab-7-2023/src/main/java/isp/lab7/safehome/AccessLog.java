package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.List;

public class AccessLog {
    private List<String> logs;

    public AccessLog() {
        logs = new ArrayList<>();
    }

    public void addLog(String logEntry) {
        logs.add(logEntry);
    }

    public List<String> getLogs() {
        return logs;
    }

    public static void main(String[] args) {
        AccessLog accessLog = new AccessLog();

        accessLog.addLog("Access granted to John at 10:00 AM");
        accessLog.addLog("Access denied to Alice at 10:05 AM");
        accessLog.addLog("Access granted to Bob at 10:10 AM");

        List<String> logs = accessLog.getLogs();
        System.out.println("Access logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

