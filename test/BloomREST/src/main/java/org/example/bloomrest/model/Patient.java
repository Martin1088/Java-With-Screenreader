package org.example.bloomrest.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Patient {
    private int extid;
    private String namePrefix;
    private String vorname;
    private String nachname;
    private String gender;
    private String geburtsname;
    private int geburtstag;
    private int geburtsmonat;
    private int geburtsjahr;
    private String ort;
    private String state;
    private String plz;

    public Patient(int extid, String namePrefix, String vorname, String nachname, String gender, String geburtsname, int geburtstag, int geburtsmonat, int geburtsjahr, String ort, String state, String plz) {
        this.extid = extid;
        this.namePrefix = namePrefix;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gender = gender;
        this.geburtsname = geburtsname;
        this.geburtstag = geburtstag;
        this.geburtsmonat = geburtsmonat;
        this.geburtsjahr = geburtsjahr;
        this.ort = ort;
        this.state = state;
        this.plz = plz;
    }

    public int getExtid() {
        return extid;
    }

    public void setExtid(int extid) {
        this.extid = extid;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGeburtsname() {
        return geburtsname;
    }

    public void setGeburtsname(String geburtsname) {
        this.geburtsname = geburtsname;
    }

    public int getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(int geburtstag) {
        this.geburtstag = geburtstag;
    }

    public int getGeburtsmonat() {
        return geburtsmonat;
    }

    public void setGeburtsmonat(int geburtsmonat) {
        this.geburtsmonat = geburtsmonat;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
