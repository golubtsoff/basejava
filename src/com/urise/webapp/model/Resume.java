package com.urise.webapp.model;

import java.util.UUID;

public class Resume implements Comparable<Resume> {

    // Unique identifier
    private final String uuid;

    private String fullName;

    public Resume(String fullName){
        this(UUID.randomUUID().toString(), fullName);
    }

    public Resume(String uuid, String fullName){
        this.uuid = uuid;
        this.fullName = fullName;
    }

    public String getUuid(){
        return uuid;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume r = (Resume) o;
        return uuid.equals(r.uuid) && fullName.equals(r.fullName);
    }



    @Override
    public int compareTo(Resume o) {
        return fullName.compareTo(o.fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "uuid='" + uuid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
