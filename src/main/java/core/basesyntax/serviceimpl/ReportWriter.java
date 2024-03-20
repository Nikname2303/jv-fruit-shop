package core.basesyntax.serviceimpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportWriter {
    public void writeReportInFile(String toFileName, String report) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFileName))) {
            bufferedWriter.write(report);
        } catch (IOException e) {
            throw new RuntimeException("Can't write info" + toFileName, e);
        }
    }
}
