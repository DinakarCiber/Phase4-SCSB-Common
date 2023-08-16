package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.*;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "scsb_properties_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "PROPERTIES_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class SCSBProprtiesEntity extends AbstractEntity<Integer> {

    @Column(name = "P_KEY")
    private String p_key;

    @Column(name = "P_VALUE")
    private String p_value;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "INSTITUTION_CODE")
    private String institutionCode;

    @Column(name = "IMS_LOCATION_CODE")
    private String imsLocationCode;

    @Column(name = "ACTIVE")
    private String active;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "UPDATED_BY")
    private String lastUpdatedBy;

}