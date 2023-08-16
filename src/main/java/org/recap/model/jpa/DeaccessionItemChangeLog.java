package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 * Created by akulak on 26/2/18 .
 */
@Entity
@Table(name = "deaccession_item_change_log_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "CHANGE_LOG_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class DeaccessionItemChangeLog extends AbstractEntity<Integer>  {
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "OPERATION_TYPE")
    private String operationType;

    @Column(name = "RECORD_ID")
    private Integer recordId;

    @Column(name = "NOTES")
    private String notes;
}
