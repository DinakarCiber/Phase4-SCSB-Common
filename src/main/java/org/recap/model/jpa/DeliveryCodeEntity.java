package org.recap.model.jpa;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DELIVERY_CODES_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DELIVERY_CODE_ID"))
@Data
public class DeliveryCodeEntity extends AbstractEntity<Integer> implements Comparable<DeliveryCodeEntity> {

    @Column(name = "DELIVERY_CODE")
    private String deliveryCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "OWNING_INST_ID")
    private Integer owningInstitutionId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;

    @Column(name = "DELIVERY_CODE_TYPE_ID")
    private Integer deliveryCodeTypeId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OWNING_INST_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IMS_LOCATION_ID", insertable = false, updatable = false)
    private ImsLocationEntity imsLocationEntity;

    @Column(name = "CIRC_DESK_LOCATION")
    private String pickupLocation;

    @Column(name = "ACTIVE")
    private char active;



    @Override
    public int compareTo(DeliveryCodeEntity deliveryCodeEntity) {
        if (null != this.getDescription() && null !=  deliveryCodeEntity && null != deliveryCodeEntity.getDescription()) {
            return this.getDescription().compareTo(deliveryCodeEntity.getDescription());
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        DeliveryCodeEntity deliveryCodeEntity = (DeliveryCodeEntity) object;

        if (!Objects.equals(id, deliveryCodeEntity.id))
            return false;
        if (getDeliveryCode() != null ? !getDeliveryCode().equals(deliveryCodeEntity.getDeliveryCode()) : deliveryCodeEntity.getDeliveryCode() != null)
            return false;
        if (getDescription() != null ? !getDescription().equals(deliveryCodeEntity.getDescription()) : deliveryCodeEntity.getDescription() != null)
            return false;
        return getOwningInstitutionId() != null ? getOwningInstitutionId().equals(deliveryCodeEntity.getOwningInstitutionId()) : deliveryCodeEntity.getOwningInstitutionId() == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getDeliveryCode() != null ? getDeliveryCode().hashCode() : 0);
        result = 31 * result + (getOwningInstitutionId() != null ? getOwningInstitutionId().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }

    }
