package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.*;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "ims_location_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "LOCATION_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class LocationEntity extends AbstractEntity<Integer> {

    @Column(name = "IMS_LOCATION_CODE")
    private String locationCode;

    @Column(name = "IMS_LOCATION_NAME")
    private String locationName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ACTIVE")
    private String active;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_BY")
    private String lastUpdatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_DATE")
    private Date lastUpdatedDate;


}
