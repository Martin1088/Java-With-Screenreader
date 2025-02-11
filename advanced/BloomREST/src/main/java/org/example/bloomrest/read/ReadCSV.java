package org.example.bloomrest.read;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.bloomrest.model.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@ApplicationScoped
public class ReadCSV {
    private final List<Patient> patients = new ArrayList<>();
    private final AtomicBoolean isLoading = new AtomicBoolean(false);
    private final AtomicBoolean isCached = new AtomicBoolean(false);

    public void loadPatients() {
        if (isLoading.get() || isCached.get()) return;
        isLoading.set(true);
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("patients.csv")) {
            if (inputStream == null) {
                throw new RuntimeException("File patients.csv not found in resources!");
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] tokens = line.split(";");
                    if (!tokens[0].isEmpty()) {
                        Patient patient = new Patient(
                                Integer.parseInt(tokens[0]),  // extid
                                tokens[1],                   // namePrefix
                                tokens[2],                   // vorname
                                tokens[3],                   // nachname
                                tokens[4],                   // gender
                                tokens[5],                   // geburtsname
                                Integer.parseInt(tokens[6]), // geburtstag
                                Integer.parseInt(tokens[7]), // geburtsmonat
                                Integer.parseInt(tokens[8]), // geburtsjahr
                                tokens[9],                   // ort
                                tokens[10],                  // state
                                tokens[11]                   // plz
                        );
                        patients.add(patient);
                    }
                }
                isCached.set(true);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV file: ", e);
        } finally {
            isLoading.set(false);
        }
    }

    public void addPatient(Patient patient) {
        loadPatients();
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        loadPatients();
        return patients;
    }

    public Patient getPatientByExtid(int extid) {
        loadPatients();
        return patients.stream().filter(patient -> patient.getExtid() == extid).findFirst().orElse(null);
    }

    public List<Patient> searchPatientsByName(String name) {
        loadPatients();
        return patients.stream()
                .filter(p -> p.getVorname().equalsIgnoreCase(name) || p.getNachname().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}
