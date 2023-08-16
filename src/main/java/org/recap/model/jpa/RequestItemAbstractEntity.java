package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public class RequestItemAbstractEntity extends AbstractEntity<Integer> {

    @Column(name = "ITEM_ID")
    private Integer itemId;

    @Column(name = "REQUEST_TYPE_ID")
    private Integer requestTypeId;

    @Column(name = "REQUESTING_INST_ID")
    private Integer requestingInstitutionId;

    @Column(name = "PATRON_ID")
    private String patronId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQ_EXP_DATE")
    private Date requestExpirationDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "STOP_CODE")
    private String stopCode;

    @Column(name = "REQUEST_STATUS_ID")
    private Integer requestStatusId;

    @Column(name = "NOTES")
    private String notes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REQUESTING_INST_ID", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REQUEST_TYPE_ID", insertable = false, updatable = false)
    private RequestTypeEntity requestTypeEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REQUEST_STATUS_ID", insertable = false, updatable = false)
    private RequestStatusEntity requestStatusEntity;

}
