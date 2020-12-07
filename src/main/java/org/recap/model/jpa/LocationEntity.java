package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "location_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "LOCATION_ID"))
@Getter
@Setter
public class LocationEntity extends AbstractEntity<Integer> {

    @Column(name = "LOCATION_CODE")
    private String locationCode;

    @Column(name = "LOCATION_NAME")
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