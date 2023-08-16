package org.recap.model.jpa;

import lombok.Data;


import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "OWNER_CODES_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "OWNER_CODE_ID"))
@Data
public class OwnerCodeEntity extends AbstractEntity<Integer> {

    @Column(name = "OWNER_CODE")
    private String ownerCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INSTITUTION_ID")
    private Integer institutionId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;

    @Column(name = "ACTIVE")
    private char active;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSTITUTION_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IMS_LOCATION_ID", insertable = false, updatable = false)
    private ImsLocationEntity imsLocationEntity;

    public int compareTo(OwnerCodeEntity ownerCodeEntity) {
        if (null != this.getDescription() && null !=  ownerCodeEntity && null != ownerCodeEntity.getDescription()) {
            return this.getDescription().compareTo(ownerCodeEntity.getDescription());
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        OwnerCodeEntity ownerCodeEntity = (OwnerCodeEntity) object;

        if (!Objects.equals(id, ownerCodeEntity.id))
            return false;
        if (getOwnerCode() != null ? !getOwnerCode().equals(ownerCodeEntity.getOwnerCode()) : ownerCodeEntity.getOwnerCode() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(ownerCodeEntity.getDescription()) : ownerCodeEntity.getDescription() != null)
            return false;
        return getInstitutionId() != null ? getInstitutionId().equals(ownerCodeEntity.getInstitutionId()) : ownerCodeEntity.getInstitutionId() == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getOwnerCode() != null ? getOwnerCode().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getInstitutionId() != null ? getInstitutionId().hashCode() : 0);
        return result;
    }


}
