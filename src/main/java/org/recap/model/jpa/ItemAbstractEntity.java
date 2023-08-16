package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sureshss on 02/20/20.
 */

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@MappedSuperclass
public class ItemAbstractEntity extends AbstractEntity<Integer>  implements Serializable {

   @Column(name = "BARCODE")
    private String barcode;

    @Column(name = "CUSTOMER_CODE")
    private String customerCode;

    @Column(name = "CALL_NUMBER")
    private String callNumber;

    @Column(name = "CALL_NUMBER_TYPE")
    private String callNumberType;

    @Column(name = "ITEM_AVAIL_STATUS_ID")
    private Integer itemAvailabilityStatusId;

    @Column(name = "COPY_NUMBER")
    private Integer copyNumber;

    @Column(name = "ITEM_LIBRARY")
    private String itemLibrary;

    @EqualsAndHashCode.Include
    @Column(name = "OWNING_INST_ID")
    private Integer owningInstitutionId;

    @Column(name = "COLLECTION_GROUP_ID")
    private Integer collectionGroupId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "USE_RESTRICTIONS")
    private String useRestrictions;

    @Column(name = "VOLUME_PART_YEAR")
    private String volumePartYear;

    @EqualsAndHashCode.Include
    @Column(name = "OWNING_INST_ITEM_ID")
    private String owningInstitutionItemId;

    @Column(name = "IS_DELETED")
    private boolean isDeleted;

    @Column(name = "CATALOGING_STATUS")
    private String catalogingStatus;

    @Column(name = "IMS_LOCATION_ID")
    private Integer imsLocationId;
}
