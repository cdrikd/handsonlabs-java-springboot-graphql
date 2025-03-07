package fr.maif.handsonlabs.javaspringbootgraphql.models;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "id", length = 2, nullable = false)
    private String id;

    @Column(name = "name", length = 256, nullable = false)
    private String name;

    @Column(name = "native", length = 256, nullable = false)
    private String nativeName;

    @Column(name = "phone", length = 256, nullable = false)
    private String phone;

    @Column(name = "continent", length = 2, nullable = false)
    private String continent;

    @Column(name = "capital", length = 256, nullable = false)
    private String capital;

    @Column(name = "currencies", length = 256, nullable = false)
    private String currencies;

    @ElementCollection
    @CollectionTable(name="countries_languages", joinColumns=@JoinColumn(name="country_id"))
    @Column(name="language_id")
    private Set<String> languageIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String currencies) {
        this.currencies = currencies;
    }

    public Set<String> getLanguageIds() {
        return languageIds;
    }

    public void setLanguageIds(Set<String> languageIds) {
        this.languageIds = languageIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) &&
            Objects.equals(name, country.name) &&
            Objects.equals(nativeName, country.nativeName) &&
            Objects.equals(phone, country.phone) &&
            Objects.equals(continent, country.continent) &&
            Objects.equals(capital, country.capital) &&
            Objects.equals(currencies, country.currencies) &&
            Objects.equals(languageIds, country.languageIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nativeName, phone, continent, capital, currencies, languageIds);
    }

    @Override
    public String toString() {
        return "Country{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", nativeName='" + nativeName + '\'' +
            ", phone='" + phone + '\'' +
            ", continent='" + continent + '\'' +
            ", capital='" + capital + '\'' +
            ", currencies='" + currencies + '\'' +
            ", languageIds=" + languageIds +
            '}';
    }
}
