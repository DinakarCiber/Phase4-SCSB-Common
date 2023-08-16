package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 * Created by akulak on 21/9/17.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@MappedSuperclass
public class BulkRequestItemAbstractEntity extends AbstractEntity<Integer> {

    @Column(name = "BULK_REQUEST_NAME")
    private String bulkRequestName;

    @Column(name = "BULK_REQUEST_FILE_NAME")
    private String bulkRequestFileName;

    @Lob
    @Column(name = "BULK_REQUEST_FILE_DATA")
    private byte[] bulkRequestFileData;

    @Column(name = "REQUESTING_INST_ID")
    private Integer requestingInstitutionId;

    @Column(name = "REQUEST_STATUS")
    private String bulkRequestStatus;

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

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "PATRON_ID")
    private String patronId;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocation;
}
