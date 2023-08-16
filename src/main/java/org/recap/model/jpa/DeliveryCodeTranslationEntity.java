package org.recap.model.jpa;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DELIVERY_CODE_TRANSLATION_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DEL_CODE_TRANS_ID"))
@Data
public class DeliveryCodeTranslationEntity extends AbstractEntity<Integer> implements Comparable<DeliveryCodeTranslationEntity> {

    @Column(name = "REQUESTING_INST_ID")
    private Integer requestingInstitutionId;

    @Column(name = "REQUESTING_INST_DELIVERY_CODE_ID")
    private Integer requestingInstitutionDeliveryCodeId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;

    @Column(name = "IMS_LOCATION_DELIVERY_CODE")
    private String imsLocationDeliveryCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REQUESTING_INST_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IMS_LOCATION_ID", insertable = false, updatable = false)
    private ImsLocationEntity imsLocationEntity;

    @Override
    public int compareTo(DeliveryCodeTranslationEntity deliveryCodeEntity) {
        if (null != this.getImsLocationDeliveryCode() && null !=  deliveryCodeEntity && null != deliveryCodeEntity.getImsLocationDeliveryCode()) {
            return this.getImsLocationDeliveryCode().compareTo(deliveryCodeEntity.getImsLocationDeliveryCode());
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;

        DeliveryCodeTranslationEntity deliveryCodeTranslationEntity = (DeliveryCodeTranslationEntity) object;

        if (!Objects.equals(id, deliveryCodeTranslationEntity.id))
            return false;
        if (getRequestingInstitutionDeliveryCodeId() != null ? !getRequestingInstitutionDeliveryCodeId().equals(deliveryCodeTranslationEntity.getRequestingInstitutionDeliveryCodeId()) : deliveryCodeTranslationEntity.getRequestingInstitutionDeliveryCodeId() != null)
            return false;
        if (getImsLocationDeliveryCode() != null ? !getImsLocationDeliveryCode().equals(deliveryCodeTranslationEntity.getImsLocationDeliveryCode()) : deliveryCodeTranslationEntity.getImsLocationDeliveryCode() != null)
            return false;
        return getImsLocationId() != null ? getImsLocationId().equals(deliveryCodeTranslationEntity.getImsLocationId()) : deliveryCodeTranslationEntity.getImsLocationId() == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getImsLocationDeliveryCode() != null ? getImsLocationDeliveryCode().hashCode() : 0);
        result = 31 * result + (getRequestingInstitutionDeliveryCodeId() != null ? getRequestingInstitutionDeliveryCodeId().hashCode() : 0);
        result = 31 * result + (getImsLocationId() != null ? getImsLocationId().hashCode() : 0);
        return result;
    }

    }
