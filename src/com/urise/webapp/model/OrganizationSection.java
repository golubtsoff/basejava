package com.urise.webapp.model;

import java.util.*;

public class OrganizationSection extends Section {
    private static final long serialVersionUID = 1L;

    private final List<Organization> organizations;

    public OrganizationSection(Organization ... organizations){
        this(Arrays.asList(organizations));
    }

    public OrganizationSection(List<Organization> organizations) {
        Objects.requireNonNull(organizations, "Организация не задана");
        this.organizations = organizations;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationSection that = (OrganizationSection) o;

        return organizations.equals(that.organizations);

    }

    @Override
    public int hashCode() {
        return organizations.hashCode();
    }

    @Override
    public String toString() {
        return organizations.toString();
    }
}
