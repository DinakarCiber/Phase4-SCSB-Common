package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "request_item_status_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "REQUEST_STATUS_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class RequestStatusEntity extends AbstractEntity<Integer>{

    @Column(name = "REQUEST_STATUS_CODE")
    private String requestStatusCode;

    @Column(name = "REQUEST_STATUS_DESC")
    private String requestStatusDescription;

}
