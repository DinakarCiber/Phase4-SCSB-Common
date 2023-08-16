package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DELIVERY_RESTRICT_TYPE_T", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "DEL_RESTRICT_TYPE_ID"))
@EqualsAndHashCode(callSuper = false)
@Data
public class DeliveryRestrictTypeEntity extends AbstractEntity<Integer>{

    @Column(name = "DEL_RESTRICT_TYPE")
    private String deliveryRestrictType;

}
